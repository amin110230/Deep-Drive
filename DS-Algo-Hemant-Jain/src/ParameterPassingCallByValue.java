public class ParameterPassingCallByValue {
    public static void increment(int var)
    {
//        a separate copy is created inside the called method
        var++;
    }
    public static void main(String[] args)
    {
//        the variable in the calling method remains unchanged
        int i = 10;
        System.out.println("Value of i before increment is : " + i);
        increment(i);
        System.out.println("Value of i before increment is : " + i);
//        1. Pass by value just creates a copy of variable.
//        2. Pass by value, value before and after the method call remain same.
    }
}
