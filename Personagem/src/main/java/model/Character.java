package model;

public abstract class Character {
    private String name;
    private Integer health;
    private Integer attack;

    public Character(Integer attack, Integer health, String name) {
        this.attack = attack;
        this.health = health;
        this.name = name;
    }

    public abstract void specialAbility();

    public static void attack(Character target){
        System.out.println(target.getName() + " attack " + target.getName() + "!");
        target.receiveDamage(target.getAttack());
    }

    public void receiveDamage(int dano) {
        this.health -= dano;
        if (this.health < 0) {
            this.health = 0;
        }
        System.out.println(this.name + " receive " + dano + " damage. Current health: " + this.health);
    }


    public Integer getAttack() {
        return attack;
    }

    public Integer getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}
