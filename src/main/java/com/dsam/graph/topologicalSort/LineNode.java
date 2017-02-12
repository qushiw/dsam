package com.dsam.graph.topologicalSort;

/**
 *
 * 保存节点信息
 * <div>
 *     例： 1，2，3，4
 *     1：线，2：线的开始节点，3：线的结束节点，4：线的权重
 * </div>
 *
 * @author qsfs on 17/2/12.
 */
public class LineNode {
    private String line;
    private String startNode;
    private String endNode;
    private Integer value;


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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
