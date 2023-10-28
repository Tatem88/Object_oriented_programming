package lesson_7;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;

        return new Complex(realSum, imaginarySum);
    }

    public Complex multiply(Complex other){
        double realProduct = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryProduct = this.real * other.imaginary - this.real * other.imaginary + this.imaginary * other.real;

        return new Complex(realProduct, imaginaryProduct);

    }



        public Complex divide(Complex other) {
            double divisor = other.real * other.real + other.imaginary * other.imaginary;
            double realPart = (this.real * other.real + this.imaginary * other.imaginary) / divisor;
            double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / divisor;
            return new Complex(realPart, imaginaryPart);
        }


    @Override
    public String toString(){
        if (imaginary>=0){
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}

