package Bai_9;

public class Student {
    private String studentId;
    public String fullName; // public để class khác có thể dùng, nếu không sử dụng getter
    private double theoryScore;
    private double practiceScore;

    public Student() {
        this.studentId = "Chưa có";
        this.fullName = "Chưa có";
        this.theoryScore = 0.0;
        this.practiceScore = 0.0;
    }

    public Student(String studentId, String fullName, double theoryScore, double practiceScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
    }

    // Tính điểm trung bình cuả 1 học sinh
    public double calculateStudentAverage() {

        return (this.theoryScore + this.practiceScore) / 2.0;
    }

    // Xếp loại học lực
    public String getRank() {
        double avg = this.calculateStudentAverage();
        if (avg >= 8.0) return "Giỏi";
        if (avg >= 6.5) return "Khá";
        if (avg >= 5.0) return "Trung Bình";
        return "Yếu";
    }
}