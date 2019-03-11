package dev.jasonlu.avalon.algorithmserver.controller.algorithm;

import dev.jasonlu.avalon.algorithmserver.algorithms.BinaryTreeAlgorithms;
import dev.jasonlu.avalon.algorithmserver.model.BinaryTree;
import dev.jasonlu.avalon.algorithmserver.model.BinaryTreeRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/binary-tree")
public class BinairyTreeContoller {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/longest-path-sum-root-to-leaf", method = RequestMethod.POST)
    @ResponseBody
    public Long longestPathSumRootToLeaf(@RequestBody BinaryTreeRequest theRequest) {
        BinaryTree<Integer> tree = new BinaryTree<>(theRequest.getIntData());
        return new BinaryTreeAlgorithms(tree).sumOfLongestPathRootToLeafOfInteger();
    }
}
