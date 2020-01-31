package pureFunction;


public class NoPureFunction
{
    private int value = 0;

    public int add(int nextValue)
    {
        this.value += nextValue;
        return this.value;
    }

    public static void main(String[] args)
    {
        int value = 10;
        NoPureFunction noPure = new NoPureFunction();
        System.out.println(noPure.add(value));
    }
}