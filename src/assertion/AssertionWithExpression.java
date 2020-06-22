package assertion;

public class AssertionWithExpression {
    public static void main(String[] args) {
        int age = 16;

        // in this case assertion error occurs with error message.
        assert age >= 18 : "Age is less than 18 you can't vote";
        System.out.println("Age of Person is : "+age);
    }
}
