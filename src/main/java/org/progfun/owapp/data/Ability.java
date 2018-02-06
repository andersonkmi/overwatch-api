package org.progfun.owapp.data;

public class Ability {
    private String id;
    private String name;
    private String description;
    private boolean isUltimate;

    public void setId(String value) {
        id = value;
    }

    public void setName(String value) {
        name = value;
    }

    public void setDescription(String value) {
        description = value;
    }

    public void setIsUltimate(boolean value) {
        isUltimate = value;
    }

    public String getId() {
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
