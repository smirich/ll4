package com.example.demo.managers;

public class LinkedListManager<T> {

    private int size;
    private Node head;

    private class Node {
        private T payload;
        private Node nextNode;

        public Node(T payload, LinkedListManager<T>.Node nextNode) {
            this.payload = payload;
            this.nextNode = nextNode;
        }

    }

    public boolean addAtIndex(T payload, int index)
    {
        if (index > size + 1)
        {
            return false;
        }

        Node nodeToInsert = new Node(payload, head);

        if (index == 0)
        {
            nodeToInsert.nextNode = head;
            head = nodeToInsert;
            size++;
            return true;
        }
        Node shuttle = head;
        for (int i = 0; i < index - 1; i++)
        {
            shuttle = shuttle.nextNode;
        }
        nodeToInsert.nextNode = shuttle.nextNode;
        shuttle.nextNode = nodeToInsert;
        size++;
        return true;
    }

    public T getAtIndex(int index)
    {
        if (index > size)
        {
            return null;
        }
        Node shuttle = head;
        for (int i = 0; i < index; i++)
        {
            shuttle = shuttle.nextNode;
        }
        return shuttle.payload;

    }

    public int size()
    {
        return size;
    }

    // public T removeAtIndex(int index)
    // {
    //     size--;
    //     return null;
    // }

    @Override
    public String toString()
    {
        Node shuttle = head;
        String returnString = "";
        for (int i = 0; i < size; i++)
        {
            returnString += getAtIndex(i) + ",";
            shuttle = shuttle.nextNode;
        }
        return returnString;
        // String returnValue = "";
        // Node shuttle = head;
        // while (head != null)
        // {
        //     returnValue += shuttle.payload;
        //     shuttle = shuttle.nextNode;
        // }
        // return returnValue;
    }
}
