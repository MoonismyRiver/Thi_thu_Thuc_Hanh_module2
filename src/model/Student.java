package model;

public class Student {
    private int masinhvien;
    private String hoten;
    private int tuoi;
    private String gioitinh;
    private String diachi;
    private double diemtrungbinh;

    public Student() {
    }

    public Student(int masinhvien, String hoten, int tuoi, String gioitinh, String diachi, double diemtrungbinh) {
        this.masinhvien = masinhvien;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.diemtrungbinh = diemtrungbinh;
    }

    public int getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(int masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getDiemtrungbinh() {
        return diemtrungbinh;
    }

    public void setDiemtrungbinh(double diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }

    @Override
    public String toString() {
        return "Student{" +
                "masinhvien=" + masinhvien +
                ", hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh='" + gioitinh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", diemtrungbinh=" + diemtrungbinh +
                '}';
    }

    public String write() {
        return hoten + "," + tuoi + "," + gioitinh + "," + diachi + "," + diemtrungbinh;
    }
}
