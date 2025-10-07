class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    void compareArea(Rectangle r) {
        if (this.area() > r.area())
            System.out.println("Current rectangle is bigger.");
        else if (this.area() < r.area())
            System.out.println("Passed rectangle is bigger.");
        else
            System.out.println("Both rectangles have equal area.");
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 4);
        Rectangle r2 = new Rectangle(6, 3);

        r1.compareArea(r2);
    }
}