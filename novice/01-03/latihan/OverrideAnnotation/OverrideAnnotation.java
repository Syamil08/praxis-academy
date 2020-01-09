import java.*;
/**
 * pada file ini terdapat 2 class yaitu class Base dan Derived
 * 
 * Base -> dalam class ini memiliki 2 prosedur yaitu prosedur display() dan main
 *         a. display() -> berfungsi untuk menghasilkan suatu output berupa teks "Base display()"
 *         b. main() -> terdapat sebuah program untuk melakukan instasiasi objek dari class Base
 *                      dan mengambil isi dari class Derived.
 * 
 * Derived -> sebuah class yang berisi satu prosedur yaitu prosedur display()
 *            display() -> merupakan sebuah prosedur yang digunakan untuk menghasilkan suatu output berupa teks
 *                         "Derived display()".
 */

class Base
{
    public void display()
    {
        System.out.println("Base display()");
    }

    public static void main(String[] args)
    {
        Base obj = new Derived();
        obj.display();
    }
}

class Derived extends Base
{
    @Override
    public void display()
    {
        System.out.println("Derived display()");
    }
}