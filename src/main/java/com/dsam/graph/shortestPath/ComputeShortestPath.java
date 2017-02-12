package com.dsam.graph.shortestPath;

import java.util.*;

/**
 * @author  on 17/2/12.
 */
public class ComputeShortestPath {

    private static Map<String,NodeRelation> dataMap = new LinkedHashMap<String, NodeRelation>();

    public static void buildNodeRelation(List<NodeLine> nodeLineList){
        for (NodeLine nodeLine:nodeLineList){
            NodeRelation startNodeRelation = dataMap.get(nodeLine.getStartNode());
            if (startNodeRelation == null){
                startNodeRelation = new NodeRelation(nodeLine.getStartNode());
                dataMap.put(nodeLine.getStartNode(),startNodeRelation);
            }

            NodeRelation endNodeRelation = dataMap.get(nodeLine.getEndNode());
            if (endNodeRelation == null){
                endNodeRelation = new NodeRelation(nodeLine.getEndNode());
                dataMap.put(nodeLine.getEndNode(),endNodeRelation);
            }

            startNodeRelation.getNextNodeList().add(new RelatedNode(endNodeRelation,nodeLine.getWeightValue()));

        }
    }



    private static Map<String,ShortestPath> sortMap = new LinkedHashMap<String, ShortestPath>();

    public static void sort(String name){
        NodeRelation nodeRelation = dataMap.get(name);
        nodeRelation.setWeightValue(0);
        if (nodeRelation == null){
            System.out.println("没有此源节点,name = "+name);
            return;
        }

        Queue<NodeRelation> queue = new LinkedList<NodeRelation>();
        queue.offer(nodeRelation);
        sortMap.put(name,new ShortestPath(name,0,name));
        while (!queue.isEmpty()){
            NodeRelation node = queue.poll();
            List<RelatedNode> list = node.getNextNodeList();
            for (RelatedNode relatedNode:list){
                NodeRelation tempNode = dataMap.get(relatedNode.getNodeRelation().getName());
//                if (tempNode.getWeightValue()!=Integer.MAX_VALUE){
                    tempNode.setWeightValue(relatedNode.getWeight()+node.getWeightValue());
                    ShortestPath shortestPath = sortMap.get(tempNode.getName());
                    if (shortestPath!=null){
                        if (shortestPath.getWeight()>tempNode.getWeightValue()){
                            shortestPath.setPath(sortMap.get(node.getName()).getPath() +","+ tempNode.getName());
                            shortestPath.setWeight(tempNode.getWeightValue());
                        }
                    }else{
                        sortMap.put(tempNode.getName(),new ShortestPath(sortMap.get(node.getName()).getPath()+","+tempNode.getName(),tempNode.getWeightValue(),tempNode.getName()));
                    }

//                }
                queue.offer(tempNode);
            }
        }
    }



    public static void getResult(){
        if (sortMap.isEmpty()){
            System.out.println("没有比对元素");
        }

        Collection<ShortestPath> collection = sortMap.values();

        for(ShortestPath shortestPath:collection){
            System.out.println("顶点:"+shortestPath.getName()+"," +
                    "到源节点的最短路径为:"+shortestPath.getPath()+",路径长度为:"+shortestPath.getWeight());
        }
    }
}
