package com.example.demo.managers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListManagerTest {

    private LinkedListManager<String> linkedListManager;

    @BeforeEach
    public void setUp()
    {
        linkedListManager = new LinkedListManager<>();
    }

    @Test
    public void givenEmptyList_sizeReturnsZero()
    {
        assertEquals(0, linkedListManager.size());
    }

    @Test
    public void givenEmptyList_addAtIndex0_sizeReturns2()
    {
        linkedListManager.addAtIndex("A", 0);
        linkedListManager.addAtIndex("B", 0);
        assertEquals(2, linkedListManager.size());
    }

    @Test
    public void givenEmptyList_addAtIndex0_getAtIndex0IsCorrect()
    {
        linkedListManager.addAtIndex("A", 0);
        assertEquals("A", linkedListManager.getAtIndex(0));
    }

    @Test
    public void givenListWith2Nodes_addAtIndex0_getAtIndex0IsCorrect()
    {
        linkedListManager.addAtIndex("A", 0);
        linkedListManager.addAtIndex("B", 0);
        linkedListManager.addAtIndex("C", 0);
        assertEquals("C", linkedListManager.getAtIndex(0));
    }

    @Test
    public void givenListWith2Nodes_addAtIndex0_getAtIndex2IsCorrect()
    {
        linkedListManager.addAtIndex("A", 0);
        linkedListManager.addAtIndex("B", 0);
        linkedListManager.addAtIndex("C", 0);
        assertEquals("A", linkedListManager.getAtIndex(2));
    }

    @Test
    public void givenListWith2Nodes_addAtIndex1_getAtIndex1IsCorrect()
    {
        // linkedListManager.addAtIndex("A", 0);
        linkedListManager.addAtIndex("B", 0);
        linkedListManager.addAtIndex("C", 1);
        assertEquals("C", linkedListManager.getAtIndex(1));
    }

    @Test
    public void givenListWith2Nodes_addAtIndex5returnsFalse()
    {
        linkedListManager.addAtIndex("A", 0);
        linkedListManager.addAtIndex("B", 0);
        assertFalse(linkedListManager.addAtIndex("C", 5));
    }

    @Test
    public void givenEmptyList_addAtIndex0_toStringReturnsCorrectString()
    {
        linkedListManager.addAtIndex("A", 0);
        assertEquals("A,", linkedListManager.toString());
    }

    @Test
    public void givenEmptyList_toStringReturnsEmptyString()
    {
        assertEquals("", linkedListManager.toString());
    }

    @Test
    public void givenEmptyList_AddingToMultipleIndexes_toStringReturnsCorrectString()
    {
        linkedListManager.addAtIndex("A", 0);
        linkedListManager.addAtIndex("B", 0);
        linkedListManager.addAtIndex("C", 1);
        linkedListManager.addAtIndex("D", 3);
        linkedListManager.addAtIndex("E", 2);
        linkedListManager.addAtIndex("F", 5);
        assertEquals("B,C,E,A,D,F,", linkedListManager.toString());
    }

    // @Test
    // public void givenListWithTwoNodes_removeAtIndex0_returns1()
    // {
    //     linkedListManager.addAtIndex("Element 1");
    //     linkedListManager.addAtIndex("Element 2");
    //     linkedListManager.removeAtIndex(0);
    //     assertEquals(1, linkedListManager.size());
    // }

    // @Test
    // public void listWithOneNode_addToEnd_returnsIndexOf2()
    // {
    //     int index = linkedListManager.addAtIndex("Element 1");
    //     assertEquals(1, index);
    // }

    // @Test
    // public void givenListWithOneNode_toStringReturnsCorrectString()
    // {
    //     linkedListManager.addAtIndex("Element 1");

    //     String expectedString = "Element1,";
    //     assertEquals(expectedString, linkedListManager.toString());
    // }

    // @Test
    // public void givenListWithTwoNodes_toStringReturnsCorrectString()
    // {
    //     linkedListManager.addAtIndex("Element 1");
    //     linkedListManager.addAtIndex("Element 2");
    //     String expectedString = "Element 2, Element 1,";
    //     assertEquals(expectedString, linkedListManager.toString());
    // }

}
