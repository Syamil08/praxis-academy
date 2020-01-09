import java.*;

class coba
{
    static<T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void  main(String[] args)
    {
        genericDisplay(10);

        genericDisplay("element");

        genericDisplay(1.8);
    }
}