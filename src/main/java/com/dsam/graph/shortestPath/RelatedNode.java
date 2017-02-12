package com.dsam.graph.shortestPath;

/**
 * @author qsfs on 17/2/12.
 */
public class RelatedNode {

    /*关联顶点*/
    private NodeRelation nodeRelation;
    /*与关联顶点的权重*/
    private Integer weight;

    /*是否走过的标识*/
    protected boolean flag;


    public RelatedNode(NodeRelation nodeRelation,Integer weight){
        this.nodeRelation = nodeRelation;
        this.weight = weight;
        this.flag = false;
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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
