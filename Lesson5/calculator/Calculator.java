package Lesson5.calculator;

import Lesson5.calculator.components.Model;
import Lesson5.calculator.components.Presenter;
import Lesson5.calculator.components.View;

public class Calculator {
    private final View view;
    private final Model model;
    private final Presenter presenter;

    public Calculator(View view, Model model, Presenter presenter) {
        this.view = view;
        this.model = model;
        this.presenter = presenter;
    }

    public void run(){
        boolean running = true;
        while(running) {
            presenter.showMenu();
            String userOption = view.getInput("Enter option > ");
            switch (userOption.toLowerCase()) {
                case "q":
                    view.printString("Goodbye");
                    running = false;
                    break;
                case "math":
                    presenter.executeOperation();
                    break;
                default:
                    view.printString("Unknown operation");
            }
        }
    }
}
