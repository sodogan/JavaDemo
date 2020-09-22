/**
 *
 */
package org.sodogan.dev;

/**
 * @author User
 *
 */
public class RubberDuck extends Duck
{

    public RubberDuck()
    {
        super();
        setName("Rubber Duck");
    }

    @Override
    public String getName()
    {
       return _name;
    }

    private void setName(String newName)
    {
        this._name = newName;
    }

    @Override
    public void fly()
    {
        System.out.println("This Duck : " + _name + " is not flying");
    }


    @Override
    public void quack()
    {
        System.out.println("This Quack Duck : " + _name + " is not quacking");
    }

    @Override
    public void display()
    {
        // TODO Auto-generated method stub
        System.out.println("Inside Display Duck name " + _name);

    }

}
