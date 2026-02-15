class Computer {
    String systemID;
    String processor;
    int ram;
    String os;

    Computer(String id, String proc, int r, String o) {
        systemID = id;
        processor = proc;
        ram = r;
        os = o;
    }

    void display() {
        System.out.println("System ID: " + systemID + ", Processor: " + processor + ", RAM: " + ram + "GB, OS: " + os);
    }

    public static void main(String[] args) {
        Computer comp1 = new Computer("C101", "Intel i5", 8, "Windows 10");
        Computer comp2 = new Computer("C102", "AMD Ryzen 7", 16, "Ubuntu 22.04");

        comp1.display();
        comp2.display();
    }
}
