/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pureFunction;

public class App {

    public int sum(int a,int b)
    {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 5, b = 5;
        App sum = new App();
        System.out.println(sum.sum(a, b));
    }
}