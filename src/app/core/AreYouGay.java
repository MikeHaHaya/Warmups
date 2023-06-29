package app.core;

import app.Globals;

public class AreYouGay {

    public static void main(String[] args) {

        System.out.println("Are you a boy? (Y/N)");
        boolean isABoy = Globals.getBooleanInput();
        System.out.println("Do you like them boys? (Y/N)");
        boolean likesThemBoys = Globals.getBooleanInput();

        if ((isABoy && likesThemBoys) || (!isABoy && !likesThemBoys))
            System.out.println("Yeah probably");
        else
            System.out.println("Nah probably not");

    }

}
