package practice;

public class Scope {
    int classLevelVariable = 100;
    public void show(int parameterVariable) {
        int methodLevelVariable = 50;

        System.out.println("Class Level: " + classLevelVariable);
        System.out.println("Method Level: " + methodLevelVariable);
        System.out.println("Parameter: " + parameterVariable);

        if (parameterVariable > 10) {
            int blockLevelVariable = parameterVariable * 2;
            System.out.println("Block Level: " + blockLevelVariable);
        }
    }
    public static void main(String[] args) {
        Scope example = new Scope();
        example.show(25);
    }
}
