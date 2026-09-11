package Bai_9;

public class Classroom {
    private String className;
    private Student[] students;
    private int size;

    public Classroom() {

    }

    public Classroom(String className, int maxStudents) {
        this.className = className;
        this.students = new Student[maxStudents];

    }

    public boolean addStudent(Student s) {
        if (this.size < this.students.length) {
            this.students[this.size] = s;
            this.size++;
            return true;
        } else {
            System.out.println("Lớp đã đủ, không thể thêm sinh viên!");
            return false;
        }
    }

    public double calculateClassAverage() {
        double total = 0;
        for (int i = 0; i < this.size; i++) {
            total += this.students[i].calculateStudentAverage();
        }

        return total / this.size;
    }


    public Student findValedictorian() {
        Student valedictorian = students[0];
        for (int i = 0; i < this.size; i++) {
            if (students[i].calculateStudentAverage() > valedictorian.calculateStudentAverage()) {
                valedictorian = students[i];

            }
        }
        return valedictorian;
    }

    public void printManagement() {
        Student valedictorian = findValedictorian();
        System.out.printf("Lớp: %-10s (Sĩ số: %s sinh viên)\n", this.className, this.students.length);
        System.out.printf("Điểm trung bình lớp: %.2f\n", calculateClassAverage());
        System.out.printf("Thủ khoa của lớp: %s ", valedictorian.fullName);
        double score = valedictorian.calculateStudentAverage();
        String classification = valedictorian.getRank();
        System.out.printf("(Điểm TB thủ khoa: %.2f - Xếp loại: %s)", score, classification);

    }

    public static void main(String[] args) {
        Classroom classroom = new Classroom("Java 01", 3);
        classroom.addStudent(new Student("01", "Nguyễn Văn An", 9.0, 9.4));
        classroom.addStudent(new Student("02", "Huy Quang", 8.0, 8.5));
        classroom.addStudent(new Student("03", "Trịnh Quân", 6.2, 6.8));
        classroom.printManagement();
    }
}


