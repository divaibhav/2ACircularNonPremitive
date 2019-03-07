package main;

import linkedlist.MyLinkedListMarks;
import linkedlist.MyLinkedListStudent;
import node.MarksNode;
import node.StudentNode;
import studentbean.Student;

public class MyListMain {


    public static void main(String[] args) {

        //creating student objects
        Student s1,s2,s3,s4;

        s1 = new Student();
        s2 = new Student();
        s3 = new Student();
        s4 = new Student();

        s1.name="Vaibhav";
        s1.rollno=1;
        s1.rank=1;

        //creating new markslist
        s1.markslist=new MyLinkedListMarks();
       //creating marksnode to insert marks in marks linked list
        MarksNode s1m1=new MarksNode();
        s1m1.data=99;
        s1.markslist.insert(s1m1);
        MarksNode s1m2=new MarksNode();
        s1m2.data=99;
        s1.markslist.insert(s1m2);
        MarksNode s1m3=new MarksNode();
        s1m3.data=99;
        s1.markslist.insert(s1m3);
        MarksNode s1m4=new MarksNode();
        s1m4.data=99;
        s1.markslist.insert(s1m4);


        MyLinkedListStudent student=new MyLinkedListStudent();
        StudentNode s1n1=new StudentNode();
        s1n1.data=s1;
        student.insert(s1n1);
        student.display();




    }
}
