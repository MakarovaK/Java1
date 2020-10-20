package com.company;

class Node {
    double value_;
    Node next_;
    public Node(double value) {
        value_ = value;
        next_ = null;
    }
    public Node(double value, Node next) {
        value_ = value;
        next_ = next;
    }
    public Node() {
        value_ = 0;
        next_ = null;
    }
}

public class List {
    private Node header;
    public List() {
        header = new Node();
    }
    public void pushEnd(double value){
       Node tmp = header;
        while (tmp.next_ !=null) {
            tmp = tmp.next_;
        }
        Node element = new Node(value);
        tmp.next_=element;
    }
    public void print(){
        Node tmp = header.next_;
        while (tmp !=null){
            System.out.print(tmp.value_ + " ");
            tmp = tmp.next_;
        }
        System.out.println();
    }
    public void remove(int index){
        int i = 1;
        Node tmp = header;
        while (tmp.next_ !=null && i != index){
            tmp = tmp.next_;
            i++;
        }
        if (tmp.next_ == null)
            System.out.println("oshibka");
        else
            tmp.next_ = tmp.next_.next_;
    }
    public void print(int index){
        Node tmp = header;
        int i = 0;
        while (tmp !=null && i != index){
            tmp = tmp.next_;
            i++;
        }
        if (tmp == null)
            System.out.println("oshibka");
        else
            System.out.println(tmp.value_);
    }

}
