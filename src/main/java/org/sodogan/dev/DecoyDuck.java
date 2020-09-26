package org.sodogan.dev;

/**
 * @author Solen Dogan
 *
 */
public class DecoyDuck extends Duck{

    public DecoyDuck() {
        super();
        setName("Decoy Duck");
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
    public void fly() {
        System.out.println("This Duck : " + _name + " is  flying");
    };

    @Override
    public void quack() {
        System.out.println("This Quack Duck : " + _name + " is quacking");
    }

    @Override
    public void display() {
          System.out.println("Inside Display Duck name " + _name );
    }

}
