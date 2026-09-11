interface Game {

    int MAX_PLAYERS = 11;
}

class Cricket implements Game {

    void display() {
        System.out.println("Game: Cricket, Max Players: " + MAX_PLAYERS);
    }
}

class Football implements Game {

    void display() {
        System.out.println("Game: Football, Max Players: " + MAX_PLAYERS);
    }
}

public class GameDemo {

    public static void main(String[] args) {

        Cricket c = new Cricket();
        Football f = new Football();

        c.display();
        f.display();
    }
}