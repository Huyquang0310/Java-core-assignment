package Bai_2;

public class Student {
    private String studentId;
    private String fullName;
    private double theoryScore;
    private double practiceScore;

    // Constructor không tham số
    public Student() {
        this.studentId = "Chưa có";
        this.fullName = "Chưa có";
        this.theoryScore = 0.0;
        this.practiceScore = 0.0;
    }

    // Constructor đầy đủ 4 tham số
    public Student(String studentId, String fullName, double theoryScore, double practiceScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
    }

    // Tính điểm trung bình
    public double calculateAverage() {

        return (this.theoryScore + this.practiceScore) / 2.0;
    }

    // Xếp loại học lực
    public String getRank() {
        double avg = this.calculateAverage();
        if (avg >= 8.0) return "Giỏi";
        if (avg >= 6.5) return "Khá";
        if (avg >= 5.0) return "Trung Bình";
        return "Yếu";
    }

    // In thông tin chi tiết
    public void printDetails() {
        System.out.printf("Mã SV: %s | Họ tên: %-15s | Điểm TB: %.2f | Xếp loại: %s\n",
                this.studentId, this.fullName, this.calculateAverage(), this.getRank());
    }

    public static void main(String[] args) {
        Student s1 = new Student("SV01", "Nguyễn Văn An", 8.0, 8.5);
        Student s2 = new Student("SV02", "Trần Thị Mai", 6.0, 6.5);

        s1.printDetails();
        s2.printDetails();
    }
}
