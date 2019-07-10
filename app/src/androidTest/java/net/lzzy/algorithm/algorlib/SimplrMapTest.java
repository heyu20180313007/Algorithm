package net.lzzy.algorithm.algorlib;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimplrMapTest {

    @Test
    public void iterateDepthFirst() {
        SimplrMap map=new SimplrMap(6);
        map.addEdge(0,1,1);
        map.addEdge(1,5,1);
        map.addEdge(0,2,1);
        map.addEdge(0,3,1);
        map.addEdge(3,4,1);
        String Expected="015234";
        assertEquals(Expected,map.iterateDepthFirst());
    }

    @Test
    public void itereRangeFirst() {
        SimplrMap map=new SimplrMap(6);
        map.addEdge(0,1,1);
        map.addEdge(1,5,1);
        map.addEdge(0,2,1);
        map.addEdge(0,3,1);
        map.addEdge(3,4,1);
        String Expected="012354";
        assertEquals(Expected,map.iterateDepthFirst());
    }
}