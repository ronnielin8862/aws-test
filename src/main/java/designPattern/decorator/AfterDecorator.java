package designPattern.decorator;

public class AfterDecorator {
    public static void main(String[] args) {
        SimpleSet simpleSet = new SimpleSet();
        simpleSet.show();
    }
}

class Order {
    public void show(){

    }
}

class Item extends Order {
    protected Order order;

    public void decorate(Order order){
        this.order = order;
    }

    @Override
    public void show() {
        if(order!= null)
            order.show();
    }
}

class Drink extends Item {

    private void addDrink(){
        System.out.println("一份飲料");
    }

    @Override
    public void show() {
        super.show();
        addDrink();
    }
}

class MainMeal extends Item {

    private void addMeal(){
        System.out.println("加一份主餐");
    }

    @Override
    public void show() {
        super.show();
        addMeal();
    }
}

class Salad extends Item {

    private void addSalad(){
        System.out.println("一份沙拉");
    }

    @Override
    public void show() {
        super.show();
        addSalad();
    }
}

class Soup extends Item {

    private void addSoup(){
        System.out.println("加一份湯品");
    }

    @Override
    public void show() {
        super.show();
        addSoup();
    }
}

class Set extends Order {
    protected Order order;

    public void decorate(Order order){
        this.order = order;
    }

    @Override
    public void show() {
        if(order!= null)
            order.show();
    }
}

class SimpleSet extends Set {

    private void addSet(){
        Salad salad = new Salad();
        MainMeal mainMeal = new MainMeal();
        Drink drink = new Drink();
        salad.decorate(order);
        mainMeal.decorate(salad);
        drink.decorate(mainMeal);
        this.order = drink;
    }

    @Override
    public void show() {
        addSet();
        super.show();
    }
}