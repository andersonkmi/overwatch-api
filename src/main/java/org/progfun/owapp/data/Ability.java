package org.progfun.owapp.data;

public class Ability {
    private Integer id;
    private String name;
    private String description;
    private boolean isUltimate;

    public Ability setId(Integer value) {
        id = value;
        return this;
    }

    public Ability setName(String value) {
        name = value;
        return this;
    }

    public Ability setDescription(String value) {
        description = value;
        return this;
    }

    public Ability setIsUltimate(boolean value) {
        isUltimate = value;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsUltimate() {
        return isUltimate;
    }
}
