package main.java.LatihanNoDua;

import java.util.function.*;
import java.util.stream.*;
import java.io.*;
import java.util.Arrays;
import java.util.*;
import fj.data.Array;
import static fj.data.Array.array;
import static fj.Show.arrayShow;
import static fj.Show.intShow;
import static fj.function.Integers.even;

public class ArrFilter
{

    public static void main(String[] args)
    {
        final Array<Integer> a = array(97, 44, 67, 3, 22, 90, 1, 77, 98, 1078, 6, 64, 6, 79, 42);
        final Array<Integer> b = a.filter(even);
        final Array<Integer> c = a.filter(i -> i % 2 == 0);
        arrayShow(intShow).println(b);
    }

}