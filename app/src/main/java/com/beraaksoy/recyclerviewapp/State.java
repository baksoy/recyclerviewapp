package com.beraaksoy.recyclerviewapp;

/**
 * Created by beraaksoy on 5/26/16.
 */
public class State {
    private String name;
    private int flag;

    public State(String name, int flag) {
        this.name = name;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
