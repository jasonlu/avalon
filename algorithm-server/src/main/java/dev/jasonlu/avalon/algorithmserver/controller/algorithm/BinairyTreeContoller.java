package dev.jasonlu.avalon.algorithmserver.controller.algorithm;

import dev.jasonlu.avalon.algorithmserver.algorithms.BinaryTreeAlgorithms;
import dev.jasonlu.avalon.algorithmserver.model.BinaryTree;
import dev.jasonlu.avalon.algorithmserver.model.BinaryTreeRequest;
import dev.jasonlu.avalon.algorithmserver.model.BinaryTreeResponse;
import dev.jasonlu.avalon.algorithmserver.model.TaskQueue;
import dev.jasonlu.avalon.algorithmserver.repository.TaskQueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/binary-tree")
public class BinairyTreeContoller {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @Autowired
    private TaskQueueRepository repository;

    // The userId is suppose to from OAuth2 context. mocking the value for now.
    private String userId = "abcdefg1234567";

    @RequestMapping(value = "/longest-path-sum-root-to-leaf", method = RequestMethod.POST)
    @ResponseBody
    public BinaryTreeResponse longestPathSumRootToLeaf(@RequestBody BinaryTreeRequest theRequest) {

        // Save the task to queue, to be processed by workflow later
        saveQueue(theRequest.getIntData());

        // These three statement should be called inside workflow, but this will do for now.
        BinaryTree<Integer> tree = new BinaryTree<>(theRequest.getIntData());
        BinaryTreeAlgorithms algorithms = new BinaryTreeAlgorithms(tree);
        long sumOfLongestPathRootToLeafOfInteger = algorithms.sumOfLongestPathRootToLeafOfInteger();

        BinaryTreeResponse theResponse = new BinaryTreeResponse();
        theResponse.setHeight(tree.getHeight());
        theResponse.setSize(tree.getSize());
        theResponse.setIntData(theRequest.getIntData());
        // I want to also get the path of the result so I can render it on the webpage.
        theResponse.setPath(new int []{});

        // The actual result.
        theResponse.setSumOfLongestPathRootToLeafOfInteger(sumOfLongestPathRootToLeafOfInteger);
        theResponse.setTree(tree);

        return theResponse;
    }

    private void saveQueue(Integer[] intData) {
        TaskQueue taskQueue = new TaskQueue();
        taskQueue.intData = intData;
        taskQueue.owner = userId;

        repository.save(taskQueue);
    }
}
