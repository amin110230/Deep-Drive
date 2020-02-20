public class ParameterPassingCallByReference {
    private static class MyInt
    {
        int value;
    };
    public static void increment(MyInt x)
    {
        (x.value)++;
    }
    public static void main(String[] args)
    {
        MyInt x = new MyInt();
        x.value = 10;
        System.out.println("Value of i before increment is: "+ x.value);
//        Parameter passing of a reference variable is done by copying the address of the variable.
        increment(x);
//        the changes done in a called function are also reflected to the caller of the function.
        System.out.println("Value of i after increment is: "+ x.value);
//        Call by reference is implemented indirectly by passing the address of an instance of class or array to the function
    }
}
