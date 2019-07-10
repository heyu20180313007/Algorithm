package net.lzzy.algorithm.algorlib;

import net.lzzy.algorithm.BusMap;

import org.junit.Test;

import static org.junit.Assert.*;

public class BusMapTest {

    @Test
    public void getMinDistance() {
        BusMap map = new BusMap(5);
        map.setStart(0);
        map.addTwoWayEdge(0,4,10);
        map.addTwoWayEdge(0,1,2);
        map.addTwoWayEdge(0,2,4);
        map.addTwoWayEdge(1,4,7);
        map.addTwoWayEdge(1,2,3);
        map.addTwoWayEdge(2,3,4);
        map.addTwoWayEdge(2,4,3);
        map.addTwoWayEdge(3,4,5);
        int expected=7;
        assertEquals(expected,(int)map.getMinDistance(BusMap.KEY_DIJKSTRA));
    }
}