package org.sodogan.dev;

public class RedHeadedDuck extends Duck {

    public RedHeadedDuck() {
        super();
        setName("Red Head Duck");
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return _name;
    }

    private void setName(String newName)
    {
        this._name = newName;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Inside Display Duck name " + _name );

    }

}
