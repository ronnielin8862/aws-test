package designPattern.decorator;

public class BeforeDecorator {

    public static void main(String[] args) {

        SimpleCombo simpleCombo = new SimpleCombo();

            System.out.println("簡餐：");
            simpleCombo.order();

        BusinessLunch businessLunch = new BusinessLunch();
            System.out.println("商業午餐：");
            businessLunch.order();

        FullCombo fullCombo = new FullCombo();
            System.out.println("全餐：");
            fullCombo.order();

    }
}

class Restaurant {

    private void minimumOrder(){
        System.out.println("一杯飲料");
    }

    //低消是一杯飲料
    public void order(){
        minimumOrder();
    }
}

class BusinessLunch extends Restaurant {

    private void salad(){
        System.out.println("一盤沙拉");
    }

    private void mainMeal(){
        System.out.println("一份主餐");
    }

    @Override
    public void order() {
        super.order();
        salad();
        mainMeal();
    }
}

class SimpleCombo extends BusinessLunch {

    private void soup(){
        System.out.println("一份湯品");
    }

    @Override
    public void order() {
        super.order();
        soup();
    }
}

class FullCombo extends SimpleCombo {

    private void sweet(){
        System.out.println("一份甜點");
    }

    @Override
    public void order() {
        super.order();
        sweet();
    }
}