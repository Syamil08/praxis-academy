import java.*;

class Test<T>
{
    T obj;

    /**
     * 
     * @param obj -> variabel yang akan digunakan nantinya untuk parameter dari contructor Test
     * 
     */
    Test(T obj)
    {
        this.obj = obj;
    }

    /**
     * 
     * @return membalikkan nilai dari variabel obj.
     */
    public T getObjek()
    {
        return this.obj;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Test<Integer> integer = new Test<Integer>(10);
        System.out.println(integer.getObjek());

        Test<String> string = new Test<String>("ini nilai string dari variabel obj");
        System.out.println(string.getObjek());
        
    }
}