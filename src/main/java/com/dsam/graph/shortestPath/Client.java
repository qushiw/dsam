package com.dsam.graph.shortestPath;


import java.util.ArrayList;
import java.util.List;

/**
 * @author qsfs on 17/2/12.
 */
public class Client {


    public static void main(String[] args) {
        List<NodeLine> graphs = new ArrayList<NodeLine>();
        NodeLine graph = new NodeLine();
        graph.setStartNode("A");
        graph.setEndNode("B");
        graph.setLine("1");
        graph.setWeightValue(29);
        graphs.add(graph);
        NodeLine graph1 = new NodeLine();
        graph1.setStartNode("A");
        graph1.setEndNode("C");
        graph1.setLine("1");
        graph1.setWeightValue(100);
        graphs.add(graph1);
        NodeLine graph2 = new NodeLine();
        graph2.setStartNode("B");
        graph2.setEndNode("D");
        graph2.setLine("1");
        graph2.setWeightValue(15);
        graphs.add(graph2);
        NodeLine graph3 = new NodeLine();
        graph3.setStartNode("D");
        graph3.setEndNode("C");
        graph3.setLine("1");
        graph3.setWeightValue(1);
        graphs.add(graph3);



        ComputeShortestPath.buildNodeRelation(graphs);
        ComputeShortestPath.sort("A");
        ComputeShortestPath.getResult();
    }
}
