package dev.jasonlu.avalon.algorithmserver.model;

import org.springframework.data.annotation.Id;

public class TaskQueue {

    @Id
    public String id;

    public String owner;
    public Integer[] intData;

    @Override
    public String toString() {
        return "ID: " + this.id + ", intData: " + intData + "Owner: " + owner;
    }
}
