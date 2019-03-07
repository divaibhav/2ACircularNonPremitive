package studentbean;

import linkedlist.MyLinkedListMarks;

public class Student {

    int rollno;
    int rank;
    String name;
    MyLinkedListMarks markslist;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", rank=" + rank +
                ", name='" + name + '\'' +
                ", markslist=" + markslist +
                '}';
    }
}
