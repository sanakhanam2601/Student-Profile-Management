class StudentProfile {
    String studentName = null;

    void display() {
        try {
            System.out.println(studentName.length());
        }
        catch (NullPointerException e) {
            System.out.println("Student name is not available");
        }
    }

    public static void main(String[] args) {
        StudentProfile s = new StudentProfile();
        s.display();

        s.studentName = "Sana";
        s.display();
    }
}