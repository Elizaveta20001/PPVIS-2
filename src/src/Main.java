import Services.Injector;

public class Main {
    public void start()
    {
        Injector injector = new Injector();
        injector.start();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
}

