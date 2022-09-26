/**
 * Learn Java Fundamentals
 */
public class LearnJavaFundamentals {
    static int x = 19; //this is static variables (outside of method or main body)
    public static void main(String[] args) {
        
        int y = 78; //this is instance variables (outside method, inside main)

        System.out.println("hELLO jAVA MEH!");
        System.out.println("The total calculation is : " + ((localVariables()*(x + y)) / 6));
    }

    public static int localVariables(){ //if void is used, it doesn't return value
        int m = 90; //this is local variable (inside main)
        return m;
    }

    /* to comment/uncomment multiple line, alt+shift+A
    LIKE THIS */
}