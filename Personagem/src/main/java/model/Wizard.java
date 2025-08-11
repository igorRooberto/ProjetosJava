package model;

public class Wizard extends Character {

    public Wizard(Integer attack, Integer health, String name) {
        super(attack, health, name);
    }

    @Override
    public void specialAbility() {
        System.out.println(this.getName() + " throws a fireball!");
    }
}
