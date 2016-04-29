package com.company;

public class Main {

    public static void main(String[] args)
    {
        TextFile test = new TextFile("/home/android-dev/Documents/test.txt");

        for (int i = 0; i < 3; i++)
        {
            System.out.println(test.readLine(i));
        }
    }
}
