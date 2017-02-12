package com.dsam.graph.shortestPath;

/**
 * @author qsfs on 17/2/12.
 */
public class RelatedNode {

    /*关联顶点*/
    private NodeRelation nodeRelation;
    /*与关联顶点的权重*/
    private Integer weight;


    public RelatedNode(NodeRelation nodeRelation,Integer weight){
        this.nodeRelation = nodeRelation;
        this.weight = weight;
    }

    public void setNodeRelation(NodeRelation nodeRelation) {
        this.nodeRelation = nodeRelation;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public NodeRelation getNodeRelation() {
        return nodeRelation;
    }

    public Integer getWeight() {
        return weight;
    }
}
