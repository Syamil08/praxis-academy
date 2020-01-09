import java.*;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * pada file ini terdapat 2 class yaitu :
 * 1. biodata -> digunakan untuk menampung value dari interfaces yang telah kita buat serta kita beri value
 *               @myCustomAnnotation(nama = "Syamil",alamat = "Monjali") // memberi value pada interface myCustomAnnotation yang telah kita buat
 * 2. DocumentedAnnotation -> pada bagian ini terdapat 1 prosedur yaitu prosedur main 
 *    
 *    fungsi prosedur main pada class DocumentedAnnotation :
 *    
 *    a. Method m = biodata.class.getMethod("getBiodata"); -> digunakan untuk mengambil method getBiodata pada
 *                                                         class biodata.
 *    b. myCustomAnnotation customAnnotation = (myCustomAnnotation) m.getAnnotation(myCustomAnnotation.class);
 *       -> berfungsi untuk memberikan root rujukan kepada class yang ada di myCustomAnnotation.
 * 
 *    c. if(customAnnotation != null) -> lakukan pengecekan jika customAnnotation tidak kosong / null
 *    
 *    d. System.out.println("Nama :" + customAnnotation.nama()); -> melakukan output nama yang telah kita berikan pada
 *                                                                  myCustomAnnotation -> nama yang ada pada class biodata.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface myCustomAnnotation{
    int umur() default 18;
    String nama();
    String alamat();
}

class biodata
{
    @myCustomAnnotation(nama = "Syamil",alamat = "Monjali")
    public void getBiodata(){}
}

public class DocumentedAnnotation
{
    public static void main(String[] args)
    {
        try {
            Method m = biodata.class.getMethod("getBiodata");
            myCustomAnnotation customAnnotation = (myCustomAnnotation) m.getAnnotation(myCustomAnnotation.class);
            if(customAnnotation != null)
            {
                System.out.println("Nama :" + customAnnotation.nama());
                System.out.println("Alamat :" + customAnnotation.alamat());
                System.out.println("Umur :" + customAnnotation.umur());
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method Tidak Ditemukan");    
            return;
        }
    }
}