package model;

public class Warrior extends Character {


    public Warrior(Integer attack, Integer health, String name) {
        super(attack, health, name);
    }

    @Override
    public void specialAbility() {
        System.out.println(this.getName() +" delivers a powerful blow!");
    }
}
