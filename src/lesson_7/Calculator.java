package lesson_7;

import java.util.logging.Logger;

public class Calculator {
    public Complex add(Complex a, Complex b){

        Complex result = a.add(b);

        LOGGER.info("Result " + result );

        return result;
    }

    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    public Complex multiply(Complex a, Complex b){
        Complex result = a.multiply(b);
        LOGGER.info("Result " + result );
        return a.multiply(b);
    }


    public Complex divide(Complex a, Complex b){
        Complex result = a.divide(b);
        LOGGER.info("Result " + result );
        return a.divide(b);
    }
}
