package org.progfun.owapp.data;

public class Hero {
    private Integer id;
    private String name;
    private String realName;
    private Integer health;
    private Integer armour;
    private Integer shield;

    public Hero setId(Integer value) {
        id = value;
        return this;
    }

    public Hero setName(String value) {
        name = value;
        return this;
    }

    public Hero setRealName(String value) {
        realName = value;
        return this;
    }

    public Hero setHealth(Integer value) {
        health = value;
        return this;
    }

    public Hero setArmour(Integer value) {
        armour = value;
        return this;
    }

    public Hero setShield(Integer value) {
        shield = value;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getArmour() {
        return armour;
    }

    public Integer getShield() {
        return shield;
    }

}
