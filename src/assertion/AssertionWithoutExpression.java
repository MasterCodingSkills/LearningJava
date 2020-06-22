package assertion;

public class AssertionWithoutExpression {
    public static void main(String[] args) {
        int age = 16;

        // in this case assertion error occurs without any message.
        assert age >= 18;
        System.out.println("Age of Person is : "+age);
    }
}
