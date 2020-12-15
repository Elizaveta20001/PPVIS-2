import Controller.Injector;
import View.UI;
import java.sql.*;
import javax.swing.*;

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

