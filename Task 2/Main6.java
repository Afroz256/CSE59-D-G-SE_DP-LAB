
class Applet {

    // Base class method
    void launch() {
        System.out.println("Applet launched");
    }
}

// Derived class
class GameApplet extends Applet {

    // Method specific to GameApplet
    void play() {
        System.out.println("Playing game");
    }
}

public class Main {
    public static void main(String[] args) {

        // Create GameApplet object
        GameApplet game = new GameApplet();

        // Call inherited method
        game.launch();

        // Call derived class method
        game.play();
    }
}
