import java.*;
/**
 * Pada file ini terdapat 2 class yaitu class DeprecateTest dan SuppressWarning
 * 
 * DeprecateTest -> class ini terdapat satu prosedur yaitu prosedur display().
 *                  display() -> merupakan sebuah prosedur yang digunakan untuk menghasilkan suatu output
 *                               "Deprecated Test display()".
 * 
 * SuppressWarning -> merupakan sebuah class yang terdapat satu prosedur yaitu main
 *                    main() -> merupakan sebuah prosedur yang digunakan untuk melakukan instansiasi objek dan menampilkan
 *                              prosedur display().
 */

class DeprecateTest
{
    @Deprecated
    public void display()
    {
        System.out.println("Deprecated Test display()");
    }
}

public class SuppressWarning
{
    @SuppressWarnings({"checked", "deprecation"})
    public static void main(String[] args){
        DeprecateTest obj = new DeprecateTest();
        obj.display();
    }
}