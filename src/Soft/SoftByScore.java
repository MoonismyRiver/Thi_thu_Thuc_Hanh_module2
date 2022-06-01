package Soft;

import model.Student;

import java.util.Comparator;

public class SoftByScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
       if(o1.getDiemtrungbinh()> o2.getDiemtrungbinh()){
           return 1;
       }
       return -1;
    }
}
