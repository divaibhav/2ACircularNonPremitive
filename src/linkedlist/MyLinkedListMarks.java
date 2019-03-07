package linkedlist;

import node.MarksNode;

public class MyLinkedListMarks {
    MarksNode head;
    //insert
    // dusplay
    //gethead


    public MarksNode getHead() {
        return head;
    }
    public void insert(MarksNode node){
        if(head==null){
            head=node;
        }
        else{
            MarksNode current=head;

            while(current.next!=null){

                current=current.next;
            }
            current.next=node;
        }
    }

    public String display(){
        String response="";

        MarksNode temp=head;
        while(temp!=null){
            response=response+temp.data+"--->";
            temp=temp.next;
        }

        response+="null";



        return response;
    }


}
