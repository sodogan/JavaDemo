package org.sodogan.dev;

public class MallardDuck extends Duck{

    public MallardDuck() {
        super();
        setName("Mallard Duck");
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
