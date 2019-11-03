package com.domain.lesson6.units;

// BattleUnit bu = new BattleUnit("юнит", 6);

abstract public class BattleUnit extends Unit implements AttackAble {

    protected int attackScore;

    public BattleUnit(String name, int speed, int health, int attackScore) {
        super(name, speed); // вызов конструктора родителя
        this.health = health;
        this.attackScore = attackScore;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    public static BattleUnit createBattleUnit(String userChoice) {

        BattleUnit battleUnit = null;
        String nameWarrior = "Воин ";
        String nameKnight = "Рыцарь ";
        String nameDoctor = "Доктор ";
        int i = (int) (Math.random() * 20) + 1;
        int j = (int) (Math.random() * 20) + 1;
        int k = (int) (Math.random() * 20) + 1;
        int q = (int) (Math.random() * 20) + 1;

        if ("warrior".equals(userChoice)) {
            battleUnit = new Warrior(nameWarrior + i, j, k, q);
        } else if ("knight".equals(userChoice)) {
            battleUnit = new Knight(nameKnight+i,j, k, q);
        } else if ("doctor".equals(userChoice)) {
            battleUnit = new Doctor(nameDoctor+i,j, k, q);
        }
        System.out.println("Создан объект: "+battleUnit);

        return battleUnit;
    }


    @Override
    public String toString() {
        return "BattleUnit{" +
                "attackScore=" + attackScore +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void escapeBattleField() {
        System.out.println("Юнит " + this.name + " сбежал с поля боя");
    }
}
