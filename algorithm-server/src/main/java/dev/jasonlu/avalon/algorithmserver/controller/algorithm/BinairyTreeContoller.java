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

    private String ownerId = "abcdefg1234567";

    @RequestMapping(value = "/longest-path-sum-root-to-leaf", method = RequestMethod.POST)
    @ResponseBody
    public BinaryTreeResponse longestPathSumRootToLeaf(@RequestBody BinaryTreeRequest theRequest) {

        saveQueue(theRequest.getIntData());

        BinaryTree<Integer> tree = new BinaryTree<>(theRequest.getIntData());
        BinaryTreeAlgorithms algorithms = new BinaryTreeAlgorithms(tree);

        long sumOfLongestPathRootToLeafOfInteger = algorithms.sumOfLongestPathRootToLeafOfInteger();
        BinaryTreeResponse theResponse = new BinaryTreeResponse();
        theResponse.setHeight(tree.getHeight());
        theResponse.setSize(tree.getSize());
        theResponse.setIntData(theRequest.getIntData());
        theResponse.setPath(new int []{});
        theResponse.setSumOfLongestPathRootToLeafOfInteger(sumOfLongestPathRootToLeafOfInteger);
        theResponse.setTree(tree);

        return theResponse;
    }

    private void saveQueue(Integer[] intData) {
        TaskQueue taskQueue = new TaskQueue();
        taskQueue.intData = intData;
        taskQueue.owner = ownerId;

        repository.save(taskQueue);

        for (TaskQueue q : repository.findAll()) {
            System.out.println(q);
        }
    }
}
