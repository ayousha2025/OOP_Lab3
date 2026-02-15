class Mobile {
    String brand;
    String model;
    double price;

    Mobile() {
        brand = "Unknown";
        model = "Unknown";
        price = 0.0;
    }

    Mobile(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Mobile phone1 = new Mobile();
        Mobile phone2 = new Mobile("Samsung", "Galaxy S23", 999.99);

        phone1.display();
        phone2.display();
    }
}
