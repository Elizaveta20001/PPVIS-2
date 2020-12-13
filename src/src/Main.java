import Controller.Injector;
import View.UI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
       Injector injector = new Injector();
       injector.getUi().showLoginFrame();
    }
}

