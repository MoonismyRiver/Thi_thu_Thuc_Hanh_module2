package io;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriteStudent {
    File file = new File("C:\\Users\\admin\\Desktop\\Module 2\\ThiThucHanhModule2\\src\\student.csv");

    public void write(List<Student> students) {

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("id,name,age,gender,address,avgScore");
            bufferedWriter.newLine();
            for (Student s : students) {
                bufferedWriter.write(s.write());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Student> read() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            while ((str = bufferedReader.readLine()) != null) {
                String[] arr = str.split(",");
                int id = Integer.parseInt(arr[0]);
                String name = arr[1];
                int age = Integer.parseInt(arr[2]);
                String gender = arr[3];
                String address = arr[4];
                double score = Double.parseDouble(arr[5]);
                students.add(new Student(id, name, age, gender, address, score));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;

    }
}
