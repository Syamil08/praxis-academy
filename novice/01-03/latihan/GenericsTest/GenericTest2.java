import java.*;

class DuaObjek <T, U>
{
    T obj1;
    U obj2;

    DuaObjek(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print()
    {
        System.out.println(this.obj1);
        System.out.println(this.obj2);
    }
}

class utama
{
    public static void main(String[] args)
    {
        DuaObjek<String, Integer> obj = new DuaObjek<String, Integer>("objek string", 10);
        obj.print();
    }
}