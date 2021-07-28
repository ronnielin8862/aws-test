package designPattern.strategy;

public class PriceCalculator {
    StrategyInterface strategy;

    private PriceCalculator(){};

    public PriceCalculator(StrategyInterface strategy){
        this.strategy = strategy;
    }

    public int calculate(int km){
        return this.calculate(km,strategy);
    }

    public int calculate(int km , StrategyInterface strategy){
        this.strategy = strategy;
        return strategy.calculate(km);
    }
}
