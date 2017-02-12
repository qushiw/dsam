package com.dsam.graph.shortestPath;

/**
 * 定点类
 *
 * @author qsfs on 17/2/12.
 */
public class NodeLine {
    /*线*/
    private String line;
    /*开始节点*/
    private String startNode;
    /*结束节点*/
    private String endNode;
    /*线的权重*/
    private Integer weightValue;


    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getStartNode() {
        return startNode;
    }

    public void setStartNode(String startNode) {
        this.startNode = startNode;
    }

    public String getEndNode() {
        return endNode;
    }

    public void setEndNode(String endNode) {
        this.endNode = endNode;
    }

    public Integer getWeightValue() {
        return weightValue;
    }

    public void setWeightValue(Integer weightValue) {
        this.weightValue = weightValue;
    }
}
