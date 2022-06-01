package validate;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidateStudent {
    Scanner scanner = new Scanner(System.in);
    List<Student> students = new ArrayList<>();

    public int validateID(List<Student> students) {
        while (true) {
            try {
                System.out.println("nhập id:");
                int id = Integer.parseInt(scanner.nextLine());
                if (getIndexId(id, students) != -1) {
                    throw new Exception();
                }
                return id;
            } catch (Exception e) {
                System.err.println("Nhập sai id rồi");
            }
        }
    }

    public int getIndexId(int id, List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMasinhvien() == id) {
                return i;
            }
        }
        return -1;
    }

    public String validateString(String dulieu) {
        while (true) {
            System.out.println("nhập:" + dulieu);
            String str = scanner.nextLine();
            if (dulieu.equals(" ")) {
                System.err.println("không được để trống !");
                continue;
            } else {
                return str;
            }
        }
    }

    public int validateAge() {
        while (true) {
            try {
                System.out.println("nhập age :");
                int age = Integer.parseInt(scanner.nextLine());
                return age;
            } catch (Exception e) {
                System.err.println("nhập age sai !");
            }
        }
    }
    public double validateScore() {
        while (true) {
            try {
                System.out.println("nhập score :");
                double score = Integer.parseInt(scanner.nextLine());
                return score;
            } catch (Exception e) {
                System.err.println("nhập score sai !");
            }
        }
    }
}
