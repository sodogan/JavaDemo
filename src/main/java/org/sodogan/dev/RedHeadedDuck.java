package org.sodogan.dev;

public class RedHeadedDuck extends Duck {

    public RedHeadedDuck() {
        super();
        setName("Red Head Duck");
    }

    @Override
    public String getName() {
        return _name;
    }

    private void setName(String newName)
    {
        this._name = newName;
    }

    @Override
    public void display() {
        System.out.println("Inside Display Duck name " + _name );

    }

}
