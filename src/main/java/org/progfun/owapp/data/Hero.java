package org.progfun.owapp.data;

public class Hero {
    private String id;
    private String name;
    private String realName;
    private String health;
    private String armour;
    private String shield;

    public void setId(String value) {
        id = value;
    }

    public void setName(String value) {
        name = value;
    }

    public void setRealName(String value) {
        realName = value;
    }

    public void setHealth(String value) {
        health = value;
    }

    public void setArmour(String value) {
        armour = value;
    }

    public void setShield(String value) {
        shield = value;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public String getHealth() {
        return health;
    }

    public String getArmour() {
        return armour;
    }

    public String getShield() {
        return shield;
    }

}
