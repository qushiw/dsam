package com.dsam.graph.shortestPath;

/**
 * Created by wuguang on 17/2/12.
 */
public class ShortestPath {

    private String path;

    private Integer weight;

    private String name;

    public ShortestPath(String path,Integer weight,String name){
        this.path = path;
        this.weight = weight;
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
