class Car {
    private String model;
    private int year;

    void setDetails(String model, int year) {
        this.model = model; // resolves variable shadowing
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.setDetails("Tesla Model 3", 2023);
        c.display();
    }
}
