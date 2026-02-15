class Course {
    String code;
    String name;
    int creditHours;

    Course(String c, String n, int ch) {
        code = c;
        name = n;
        creditHours = ch;
    }

    void display() {
        System.out.println("Course Code: " + code + ", Course Name: " + name + ", Credit Hours: " + creditHours);
    }

    public static void main(String[] args) {
        Course course1 = new Course("CS101", "Programming Fundamentals", 3);
        Course course2 = new Course("MA102", "Calculus I", 4);

        course1.display();
        course2.display();
    }
}
