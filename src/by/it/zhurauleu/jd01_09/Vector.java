package by.it.zhurauleu.jd01_09;

import java.util.Arrays;

public class Vector extends Var {

    private double[] value;

    public Vector(double[] value) {
        this.value = Arrays.copyOf(value, value.length);
    }

    public Vector(Vector vector) {
        this.value = vector.value;
    }

    public Vector(String strVector) {
        String[] strArr = strVector.split("[/{, }]+");
        strArr = Arrays.copyOfRange(strArr, 1, strArr.length);
        double[] array = new double[strArr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(strArr[i]);
        }
        this.value = array;
    }

    public double[] getValue() {
        return this.value;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            double[] firstOperand = Arrays.copyOf(this.value, this.value.length);
            double secondOperand = ((Scalar) other).getValue();
            for (int i = 0; i < firstOperand.length; i++) {
                firstOperand[i] += secondOperand;
            }
            return new Vector(firstOperand);
        } else if (this.value.length == ((Vector) other).value.length) {
            double[] firstOperand = Arrays.copyOf(this.value, this.value.length);
            for (int i = 0; i < this.value.length; i++) {
                firstOperand[i] += ((Vector) other).value[i];
            }
            return new Vector(firstOperand);
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar) {
            double[] firstOperand = Arrays.copyOf(this.value, this.value.length);
            double secondOperand = ((Scalar) other).getValue();
            for (int i = 0; i < firstOperand.length; i++) {
                firstOperand[i] -= secondOperand;
            }
            return new Vector(firstOperand);
        } else if (other instanceof Vector && this.value.length == ((Vector) other).value.length) {
            double[] firstOperand = Arrays.copyOf(this.value, this.value.length);
            for (int i = 0; i < firstOperand.length; i++) {
                firstOperand[i] -= ((Vector) other).value[i];
            }
            return new Vector(firstOperand);
        }
        return super.add(other);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar) {
            double[] firstOperand = Arrays.copyOf(this.value, this.value.length);
            double secondOperand = ((Scalar) other).getValue();
            for (int i = 0; i < firstOperand.length; i++) {
                firstOperand[i] = firstOperand[i] * secondOperand;
            }
            return new Vector(firstOperand);
        } else if (other instanceof Vector && this.value.length == ((Vector) other).value.length) {
            double result = 0;
            double[] firstOperand = Arrays.copyOf(this.value, this.value.length);
            for (int i = 0; i < firstOperand.length; i++) {
                result += firstOperand[i] * ((Vector) other).value[i];
            }
            return new Scalar(result);
        }
        return super.add(other);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar) {
            double[] firstOperand = Arrays.copyOf(this.value, this.value.length);
            double secondOperand = ((Scalar) other).getValue();
            for (int i = 0; i < firstOperand.length; i++) {
                firstOperand[i] = firstOperand[i] / secondOperand;
            }
            return new Vector(firstOperand);
        }
        return super.div(other);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("{");
        String delimiter = "";
        for (int i = 0; i < value.length; i++) {
            output.append(delimiter);
            output.append(value[i]);
            delimiter = ", ";
        }
        output.append("}");
        return output.toString();
    }
}

