package by.it.krukouski.calc;

public class VarCreator {

    private VarCreator() {

    }

    static Var createVar(String string) throws CalcException {
        if (string.matches(Patterns.SCALAR)) {
            return new Scalar(string);
        } else if (string.matches(Patterns.VECTOR)) {
            return new Vector(string);
        } else if (string.matches(Patterns.MATRIX)) {
            return new Matrix(string);
        } else if (VarRepo.contain(string)) {
            return VarRepo.load(string);
        } else {
            throw new CalcException("ERROR Var" + string);
        }
    }

}
