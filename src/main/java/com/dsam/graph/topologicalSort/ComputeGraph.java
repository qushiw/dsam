package com.dsam.graph.topologicalSort;

import java.util.*;

/**
 *
 * 图拓扑排序计算类
 *
 * @author qsfs on 17/2/12.
 */
public class ComputeGraph {
    private static Map<String,NodeRelation> dataMap = new LinkedHashMap<String, NodeRelation>();

    public static void buildGraph(List<LineNode> graphs){
        Edge edge = null;
        for(LineNode graph:graphs){
            String startNode = graph.getStartNode();
            String endNode = graph.getEndNode();

            NodeRelation startNodeRelation = dataMap.get(startNode);
            if (startNodeRelation == null){
                startNodeRelation = new NodeRelation(startNode);
                dataMap.put(startNode,startNodeRelation);
            }

            NodeRelation endNodeRelation = dataMap.get(endNode);
            if (endNodeRelation == null){
                endNodeRelation = new NodeRelation(endNode);
                dataMap.put(endNode,endNodeRelation);
            }


            endNodeRelation.setInDegree(endNodeRelation.getInDegree()+1);
            edge = new Edge(endNodeRelation);
            startNodeRelation.edgeList.add(edge);
        }
    }

    public static void sort(){
        Queue<NodeRelation> queue = new LinkedList<NodeRelation>();

        Collection<NodeRelation> collection =  dataMap.values();

        for (NodeRelation nodeRelation:collection){
            if (nodeRelation.inDegree == 0){
                queue.offer(nodeRelation);
            }
        }
        int count = 0;

        while (!queue.isEmpty()){
            count ++;
            NodeRelation nodeRelation = queue.poll();
            System.out.println("节点："+nodeRelation.getFlag());
            List<Edge> edgeList = nodeRelation.edgeList;
            for(Edge edge:edgeList){
                if (--edge.nodeRelation.inDegree == 0){
                    queue.offer(edge.nodeRelation);
                };
            }
        }

        if (count != collection.size()){
            System.out.println("好像是个环");
        }
    }

}
