
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
       sgrt(16.0);
       sgrt1(32.0);
    }
    //type-1
    public static UnaryOperator<Double> sgrt(Double san){
        UnaryOperator<Double> unaryOperator = s->s;
        System.out.println(unaryOperator.apply(Math.sqrt(san)));
            return unaryOperator;
    }
    //type-2
    public static UnaryOperator<Double> sgrt1(Double san){
        UnaryOperator<Double> unaryOperator = new UnaryOperator<Double>() {
            @Override
            public Double apply(Double aDouble) {
                return apply(aDouble);

            }
        };
        System.out.println(Math.sqrt(san));
        return unaryOperator;

    }


}