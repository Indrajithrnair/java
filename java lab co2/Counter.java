class Counter {
    static int count = 0; // static variable
    final int MAX = 100;  // constant

    Counter() {
        count++;
    }

    static void displayCount() {
        System.out.println("Objects created: " + count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.displayCount();
        System.out.println("Final constant MAX = " + c1.MAX);
    }
}
