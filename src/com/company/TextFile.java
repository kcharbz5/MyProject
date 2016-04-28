package com.company;
import java.io.*;

/**
 * Created by android-dev on 27/04/16.
 */
public class TextFile
{
    private String path;

    public TextFile()
    {
        path = "C:\\test.txt";
    }

    public TextFile(String path)
    {
        this.path = path;
    }

    public TextFile(TextFile t)
    {
        path = t.path;
    }

    public String getPath()
    {
        return path;
    }

    public readLine()
    {
        FileReader in = new FileReader(getPath());

    }

}
