public class FinalTestScopeOfVar {

    static int x = 21;
    private int y = 25;

    @SuppressWarnings("static-access")
    public void method1(int x) {
        FinalTestScopeOfVar ScopeVariable = new FinalTestScopeOfVar();
        this.x = 22; // Modifies the static field x
        this.y = 30; // Modifies the instance field y

        // Printing the static and instance fields correctly
        System.out.println("Static FinalTestScopeOfVar.x : " + FinalTestScopeOfVar.x);
        System.out.println("Instance ScopeVariable.y : " + ScopeVariable.y);
    }

    public static void main(String[] args) {
        FinalTestScopeOfVar ScopeVariable = new FinalTestScopeOfVar();
        ScopeVariable.method1(5); // Calling the method using an instance
    }
}
