package com.dsam.graph.topologicalSort;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * 节点之间关系类
 * @author qsfs on 17/2/12.
 */
public class NodeRelation {
    /*节点标识*/
    private String flag;
    /*节点关联的线信息*/
    public List<Edge> edgeList;
    /*节点入度*/
    public Integer inDegree;

    public NodeRelation(String flag){
        edgeList = new LinkedList<Edge>();
        inDegree = 0;
        this.flag = flag;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getInDegree() {
        return inDegree;
    }

    public void setInDegree(Integer inDegree) {
        this.inDegree = inDegree;
    }
}
