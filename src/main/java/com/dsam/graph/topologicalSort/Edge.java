package com.dsam.graph.topologicalSort;

/**
 * 节点类
 *
 * @author qsfs on 17/2/12.
 */
public class Edge {
    public NodeRelation nodeRelation;

    public Edge(NodeRelation nodeRelation){
        this.nodeRelation = nodeRelation;
    }
}
