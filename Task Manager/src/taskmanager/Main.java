package taskmanager;

import taskmanager.manager.TaskManager;
import taskmanager.ui.Menu;

public class Main {
    public static void main(String[] args) {

       TaskManager manager = new TaskManager();
       Menu menu = new Menu();

       menu.mostrarMenu();

    }

}
