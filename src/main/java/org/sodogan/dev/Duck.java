package org.sodogan.dev;

/**
 * @author Solen Dogan
 *
 */
public abstract class Duck {

    protected String _name;

    public Duck() {
    }

    public void fly() {
        System.out.println("Inside Fly Duck : " + _name + " is flying");
    };

    public void quack() {
        System.out.println("Inside Quack Duck : " + _name + " is quacking");
    }

    public void swim() {
        System.out.println("Inside Quack Duck : " + _name + " is swimming");
    }

    public abstract String getName();

    public abstract void display();

}
