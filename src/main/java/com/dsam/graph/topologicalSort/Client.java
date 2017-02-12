package com.dsam.graph.topologicalSort;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端执行类
 *
 * @author qsfs on 17/2/12.
 */
public class Client {
    public static void main(String[] args) {
        List<LineNode> graphs = new ArrayList<LineNode>();
        LineNode graph = new LineNode();
        graph.setStartNode("A");
        graph.setEndNode("B");
        graph.setLine("1");
        graph.setValue(1);
        graphs.add(graph);
        LineNode graph1 = new LineNode();
        graph1.setStartNode("A");
        graph1.setEndNode("C");
        graph1.setLine("1");
        graph1.setValue(1);
        graphs.add(graph1);
        LineNode graph2 = new LineNode();
        graph2.setStartNode("B");
        graph2.setEndNode("D");
        graph2.setLine("1");
        graph2.setValue(1);
        graphs.add(graph2);
        LineNode graph3 = new LineNode();
        graph3.setStartNode("D");
        graph3.setEndNode("C");
        graph3.setLine("1");
        graph3.setValue(1);
        graphs.add(graph3);

        ComputeGraph.buildGraph(graphs);
        ComputeGraph.sort();
    }
}
