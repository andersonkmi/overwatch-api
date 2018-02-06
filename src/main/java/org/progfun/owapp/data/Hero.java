package org.progfun.owapp.data;

public class Hero {
    private Integer id;
    private String name;
    private String realName;
    private Integer health;
    private Integer armour;
    private Integer shield;

    public void setId(Integer value) {
        id = value;
    }

    public void setName(String value) {
        name = value;
    }

    public void setRealName(String value) {
        realName = value;
    }

    public void setHealth(Integer value) {
        health = value;
    }

    public void setArmour(Integer value) {
        armour = value;
    }

    public void setShield(Integer value) {
        shield = value;
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
