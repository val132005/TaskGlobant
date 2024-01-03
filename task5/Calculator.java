package task5;

public class Calculator {

    double num1;
    double num2;

    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 =num2;
    }


    public double addition(){
        double resultAddition = num1 + num2;
        return resultAddition;
    }

    public double substraction(){
        double resultSubstraction = num1-num2;
        return resultSubstraction;
    }

    public double multiplication(){
        double resultMultiplication = num1*num2;
        return resultMultiplication;
    }

    public double division(){
        double resultDivision = num1/num2;
        return resultDivision;
    }




}
