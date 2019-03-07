package linkedlist;

import node.StudentNode;

public class MyLinkedListStudent {
    StudentNode head;
    //insert
    void insert(StudentNode node){
        if(head==null){
            head=node;
            node.next=head;
            node.previous=head;
        }
        else{
            StudentNode temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            node.next=head;
            node.previous=temp;
            temp.next=node;
        }
    }



    // dusplay
    void display(){
        System.out.println("MyLinkedList:");
        StudentNode temp=head;
        while(temp.next!=head){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print(temp.data+"--->");

    }





    //gethead
    public StudentNode getHead() {
        return head;
    }
}
