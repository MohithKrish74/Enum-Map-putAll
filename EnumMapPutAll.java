package com.keyword;

import java.util.EnumMap;

enum Programming{C,JAVA,PYTHON,SCALA,RUBY}
public class EnumMapPutAll
{
    public static void main(String[] args)
    {
        EnumMap<Programming,String> map1 = new EnumMap<Programming, String>(Programming.class);
        EnumMap<Programming,String> map2 = new EnumMap<Programming, String>(Programming.class);
        map1.put(Programming.C,"C Programming");
        map1.put(Programming.JAVA,"Java Programming");
        map1.put(Programming.PYTHON,"Python Programming");
        map1.put(Programming.SCALA,"Scala Programming");
        map1.put(Programming.RUBY,"Ruby Programming");
        System.out.println("Before: ");
        System.out.println("The Map 1 is "+map1);
        System.out.println("The Map 2 is "+map2);
        System.out.println("----------------------------------");
        map2.putAll(map1);
        System.out.println("After: ");
        System.out.println("The Map 1 is "+map1);
        System.out.println("The Map 2 is "+map2);
        System.out.println("----------------------------------");


    }
}
