package main;

import model.Character;
import model.Warrior;
import model.Wizard;

public class Battle {

    public static void main(String[] args) {


        Character warrior = new Warrior(20, 100, "Aragorgn");
        Character wizard = new Wizard(25, 80, "Gandalf");

        System.out.println("--- Battle Start ---");


        warrior.attack(wizard);
        System.out.println("Health of " + wizard.getName() + ": " + wizard.getHealth());


        wizard.attack(warrior);
        System.out.println("Health of " + warrior.getName() + ": " + warrior.getHealth());

        System.out.println("\n--- Special Abilities ---");

        warrior.specialAbility();
        wizard.specialAbility();

        System.out.println("\n--- Battle Continues ---");

        // Example of a longer fight
        warrior.attack(wizard);
        wizard.attack(warrior);
        warrior.attack(wizard);

        System.out.println("\n--- Battle End ---");
        System.out.println("Final health of " + warrior.getName() + ": " + warrior.getHealth());
        System.out.println("Final health of " + wizard.getName() + ": " + wizard.getHealth());

    }
}