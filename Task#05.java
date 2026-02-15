class Programmer {
    int id;
    String name;
    String language;
    int problemsSolved;

    Programmer(int i, String n, String l, int p) {
        id = i;
        name = n;
        language = l;
        problemsSolved = p;
    }

    void solveProblems(int newProblems) {
        problemsSolved += newProblems;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Language: " + language + ", Problems Solved: " + problemsSolved);
    }

    public static void main(String[] args) {
        Programmer prog1 = new Programmer(1, "Alice", "Java", 10);
        Programmer prog2 = new Programmer(2, "Bob", "Python", 5);

        prog1.solveProblems(3);
        prog2.solveProblems(7);

        prog1.display();
        prog2.display();
    }
}
