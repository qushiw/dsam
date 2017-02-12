package com.dsam.graph.shortestPath;

import java.util.LinkedList;
import java.util.List;

/**
 * @author qsfs on 17/2/12.
 */
public class NodeRelation {
    private String name;

    private NodeRelation preNodeRelation;

    private List<RelatedNode> nextNodeList;
    /*跟源节点的权重*/
    private Integer weightValue;



    public NodeRelation(String name) {
        nextNodeList = new LinkedList<RelatedNode>();
        weightValue = Integer.MAX_VALUE;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeightValue() {
        return weightValue;
    }

    public void setWeightValue(Integer weightValue) {
        this.weightValue = weightValue;
    }

    public List<RelatedNode> getNextNodeList() {
        return nextNodeList;
    }

    public void setNextNodeList(List<RelatedNode> nextNodeList) {
        this.nextNodeList = nextNodeList;
    }
}
