package org.example;

public class Main {
    public static void main(String[] args){
}
public static int add(int a, int b) {
    return a + b;
}
public static int multiply(int a, int b) {

        return a * b;
}

public static int add(int... var) {
    int sum = 0;
    for (int num : var) {
        sum += num;
    }
    return sum;
}
// Step 4: Modify the multiply function to multiply multiple integers
public static int multiply(int... var) {
    int result = 1;
    for (int num : var) {
        result *= num;
    }
    return result;
}
}