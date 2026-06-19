class Printer {

    // Method to print text
    void printData(String text) {
        System.out.println("Text: " + text);
    }

    // Overloaded method to print a number
    void printData(int number) {
        System.out.println("Number: " + number);
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Calling both overloaded methods
        printer.printData("Hello, World!");
        printer.printData(100);
    }
}
