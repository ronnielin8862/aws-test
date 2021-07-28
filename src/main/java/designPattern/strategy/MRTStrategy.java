package designPattern.strategy;

public class MRTStrategy implements StrategyInterface{
    @Override
    public int calculate(int km) {

//        小於十公里20元，超過每五公里五元

        int result = 0 ;

        if(km <= 0) return  result ;

        if(km <= 20) {
            result = 20 ;
        }

        if(km > 20){
            int count = (( km - 20 ) / 5 ) + 1 ;
            result = result + 5 * count ;
        }

        return result;
    }
}
