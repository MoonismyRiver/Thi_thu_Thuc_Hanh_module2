package Controller;

import Soft.SoftByScore;
import io.ReaderAndWriteStudent;
import model.Student;

import validate.ValidateStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerStudent {
    Scanner scanner = new Scanner(System.in);
    List<Student> students = new ArrayList<>();
    ValidateStudent validateStudent = new ValidateStudent();
    ReaderAndWriteStudent readerAndWriteStudent = new ReaderAndWriteStudent();

    public void menu() {

        System.out.println("----CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN----");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1.Xem danh sách sinh viên");
        System.out.println("2.Thêm mới");
        System.out.println("3.Chỉnh sửa");
        System.out.println("4.Xóa");
        System.out.println("5.Sắp xếp");
        System.out.println("6.Đọc từ file");
        System.out.println("7.Ghi vào file");
        System.out.println("8.Thoát");
        System.out.println("Chọn chức năng:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAll();
                break;
            case 2:
                createStudent();
                break;
            case 3:
                editStudent();
                break;
            case 4:
                deleteStudent();
                break;
            case 5:
                sortByScore();
                break;
            case 6:
                students = readerAndWriteStudent.read();
                System.out.println("Đọc thành công !");
                break;
            case 7:
                readerAndWriteStudent.write(students);
                System.out.println("Ghi thành công! ");
                break;
            case 8:
                System.exit(0);

        }

    }

    public void showAll() {
        for (int i = 0; i < students.size(); i++) {
            if ((i + 1) % 5 == 0) {
                System.out.println(students.get(i));
                scanner.nextLine();
            } else {
                System.out.println(students.get(i));
            }

        }
    }

    public Student createStudent() {
        int id = validateStudent.validateID(students);
        String name = validateStudent.validateString("name:");
        int age = validateStudent.validateAge();
        String gender = validateStudent.validateString("gender");
        String address = validateStudent.validateString("address");
        double agvScore = validateStudent.validateScore();
        return new Student(id,name,age,gender,address,agvScore);
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void editStudent() {
        System.out.println("nhập id cần sửa :");
        int id = Integer.parseInt(scanner.nextLine());
        int index = validateStudent.getIndexId(id, students);
        if (index != -1) {
            students.set(index, createStudent());
        } else {
            System.err.println("id không tồn tại !");
        }
    }

    public void deleteStudent() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        int index = validateStudent.getIndexId(id, students);
    }

    public void sortByScore() {
        students.sort(new SoftByScore());
        System.out.println("sắp xếp thành công !");
    }

}
