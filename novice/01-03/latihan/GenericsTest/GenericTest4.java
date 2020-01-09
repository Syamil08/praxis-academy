import java.*;
import java.util.*;
import java.util.ArrayList;

class Casting
{
    public static void main(String[] args)
    {
        ArrayList<String> arrString = new ArrayList<String>();
        arrString.add("satu");
        arrString.add("dua");

        String satu,dua;
        satu = arrString.get(0);
        dua = arrString.get(1);

        System.out.println(satu);
        System.out.println(dua);
    }
}