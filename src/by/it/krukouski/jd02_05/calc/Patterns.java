package by.it.krukouski.jd02_05.calc;

public interface Patterns {

    String OPERATION = "(?<=[^-+*/=,{])([-+*/=])";
    String SCALAR = "-?[0-9]+\\.?[0-9]*";
    String VECTOR = "\\{" + SCALAR + "(," + SCALAR + ")*}";
    String MATRIX = "\\{" + VECTOR + "(," + VECTOR + ")*}";
    String BRACKETS = "\\([^\\(]+?\\)";


            //2+(2-4)
}
