/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class STACK2 {

    private StackNode CreateNewNode(int element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
private class StackNode {
    int data;
    StackNode next;
    
}
private StackNode top;
private int size;

private StackNode createNewNode (int element)throws Exception {
    StackNode node = new StackNode();
    if (node== null) {
        throw new Exception("memory is empty");
        
    }else {
        node.data = element;
        node.next = null;
        return node;
    }
}

public void push (int element) throws Exception {
    StackNode node = CreateNewNode (element);
    if (size==0) {
        top= node;
        
    }else{
        node.next = top;
        top= node;
        
    }
    size++;
}
public int pop()throws Exception {
    if (size ==0) {
        throw new Exception("Stack is empty");
        
    }
    int temp = peek();
    top = top.next;
    size--;
    return temp;
}
public void display () throws Exception {
    if (size ==0) {
        throw new Exception("Stack is empty");
        
    }
    StackNode temp = top;
    while (temp != null) {        
        System.out.println(temp.data +"->");
        temp = temp.next;
    }
    System.out.println("NULL");
}

public int peek()throws Exception {
       if (size==0) {
           throw new Exception("Stack is empty");
       }
       return top.data;
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        STACK2 list = new STACK2();
        
        while (true) {            
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. display");
            System.out.println("Enter your choice");
            
            int element;
            int choice = scn.nextInt();
        try {    
         switch (choice) {
             case 1:
                 System.out.println("Enter value of node ");
                element = scn.nextInt();
                list.push(element);
                 System.out.println("\n");
              break;
             case 2:
                 System.out.println(list.pop() +"deleted");
                 System.out.println("\n");
             break;
             case 3:
                 list.display();
                 System.out.println("\n");
                 break;
             case 4:
                 scn.close();
                 System.exit(0);
             default :
                 System.out.println("invalid");
         } 
        } catch (Exception e) {
            System.out.println("Exception"+ e.getMessage());
        }
           
        }
    }
    
}
