import java.*;

/**
 * class base sebuah class yang menampung suatu procedure yaitu display()
 * procedure display() -> digunakan untuk menampilkan sebuah pesan :
 * "Base display()"
 */
class Base
{
    public void display()
    {
        System.out.println("Base display()");
    }
}

/**
 * class Derived merupakan turunan atau anak dari kelas base
 * dalam kelas ini memiliki dua prosedur yaitu display() dan main
 * 
 * display() -> pada bagian ini akan menghasilkan output "Delivered display()"
 * main() -> sebuah prosedur utama yang pertama kali dijalankan ketika mengakses class Derived
 *           pada bagian ini dilakukan sebuah proses instansiasi objek dari class Derived
 *           yang mana objek tersebut akan mengambil prosedur display.
 */
class Derived extends Base
{
    @Override
    public void display()
    {
        System.out.println("Delivered display(int)");
    }

    public static void main(String[] args)
    {
        Derived obj = new Derived();
        obj.display();
    }
}