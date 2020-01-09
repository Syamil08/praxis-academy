import java.*;
/**
 * class DeprecatedTest merupakan sebuah class yang memiliki 2 buah prosedur yaitu :
 * prosedur display() & main()
 * 
 * display() -> digunakan untuk menampilkan keluaran berupa teks "Deprecated Test display()"
 * main() -> merupakan sebuah prosedur yang didalamnya akan dilakukan :
 * instansiasi objek dari class DeprecatedTest -> DeprecatedTest d1 = new DeprecatedTest(); // instansiasi pada baris 21
 * menampilkan prosedur display berdasarkan objek yang telah dibuat -> d1.display(); // pada baris 23
 */

class DeprecatedTest
{
    /**
     * @deprecated No Replacement
     */
    @Deprecated
    public void display()
    {
        System.out.println("Deprecated Test display()");
    }

    public static void main(String[] args)
    {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.display();
    }
}