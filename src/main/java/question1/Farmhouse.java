package question1;

public class Farmhouse extends ToppingDecorator {

    public Farmhouse(Pizza newPizza) {

        super(newPizza);

        System.out.println("Adding Dough");

        System.out.println("Adding Moz");
    }

    // Returns the result of calling getDescription() for
    // PlainPizza and adds " mozzarella" to it

    public String getDescription(){

        return tempPizza.getDescription() + ", FarmHouse Pizza";

    }

    public double getCost(){

        System.out.println("Cost of FH: " + .50);

        return tempPizza.getCost() + .50;

    }

}