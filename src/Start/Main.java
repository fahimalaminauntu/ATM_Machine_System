package Start;

import ATM.OptionMenu;

import java.io.File;
import java.io.IOException;

public class Main extends OptionMenu {
    static File file = new File("Bank statement");

    public static void main(String[] args) throws IOException {
        if(!file.exists()){
            file.createNewFile();
        }
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.getLogin();
    }
}
