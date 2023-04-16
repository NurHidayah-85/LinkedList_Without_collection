/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author LENOVO
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private Node newNode;
    
    
    
    {
        head = tail = newNode = null;
    }
    
    
    public boolean isEmpty(){
        return head ==null;
    }
    
    
    public Object getFirst(){
        if(isEmpty())
        return null;
        else{
            newNode = head;
            return newNode.data;
        }
    }
    
    public void addFirst(Object Item){
        newNode = new Node(Item);
        if(head==null)
        head = tail = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    


}
