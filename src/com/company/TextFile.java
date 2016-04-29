package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * TextFile
 */
public class TextFile
{
    private String path;
    private File file;

    public TextFile()
    {
        path = "C:\\test.txt";
        file = new File(path);
    }

    public TextFile(String path)
    {
        this.path = path;
        file = new File(path);
    }

    public TextFile(TextFile t)
    {
        path = t.path;
        file = new File(path);
    }

    public String getPath()
    {
        return path;
    }

    public String readLine(int line)
    {
        String currentLine = null;
        int currentLineNumber = 1;
        try
        {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine())
            {
                if (currentLineNumber == line)
                {
                    currentLine = fileScanner.nextLine();
                }
                currentLineNumber++;
            }
        }

        catch (FileNotFoundException e)
        {
            System.out.println("The file " + path + "was not found");
        }
        return currentLine;
    }

    public ArrayList<String> readAllLines()
    {
        ArrayList<String> allLines = new ArrayList<String>();
        int currentLineNumber = 0;
        try
        {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine())
            {
                allLines.add(fileScanner.nextLine());
                currentLineNumber++;
            }
        }

        catch (FileNotFoundException e)
        {
            System.out.println("The file " + path + "was not found");
        }
        return allLines;
    }
}
