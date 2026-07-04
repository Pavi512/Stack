package com.bridgelabz.stack;

//Creating a node
class Node{
    int data;
    Node next;
    //Constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

//Stack class
class Stack{
    //Head node named as top
    Node top;

    //Constructor
    public Stack(){
        this.top = null;
    }

    //Puhs method to ad  element into the stack at first
    public void push(int element){
        Node temp = new Node(element);
        if(top == null){
            top = temp;
        }
        else{
            temp.next = top;
            top = temp;
        }
    }

    //Method to push an element from stack
    public void pop(){
        if(top == null){
            return;
        }
        else{
//            int topEle = top.data;
            top = top.next;
//            return topEle;
        }
    }

    //Method to get peek element in the stack
    public int peek(){
        if(top == null){
            return -1;
        }
        else{
            return top.data;
        }
    }

    //Display method to print the stack
    public void display(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        else{
            Node curr = top;
            while (curr != null){
                System.out.print(curr.data);
                if (curr.next != null) {
                    System.out.print("->");
                }
                curr = curr.next;
            }
//            System.out.println("null");
        }
    }
}

//Main class
public class UC1StackPushMethod {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(70);
        s.push(30);
        s.push(56);
        s.display();
        System.out.println();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.display();
    }
}
