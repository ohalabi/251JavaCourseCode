/*
 * Copyright (c) 2020. Osama Halabi
 * All rights reserved
 */

package FileInfo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Osama Halabi on 2020/10/23.
 */
public class Files1 {

    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter file or directory name:");

        analyzeFile(input.nextLine());
    }

    public static void analyzeFile(String path) {
        File fileObj = new File(path);
        String s;
        if (fileObj.exists()) {
            System.out.println(fileObj.getName() + " exists.");
            s = fileObj.isFile() ? fileObj.getName() + " is a file." : fileObj.getName() + " is not a file.";
            System.out.println(s);
            s = fileObj.isDirectory() ? fileObj.getName() + " is a directory." : fileObj.getName() + " is not a directory.";
            System.out.println(s);
            System.out.printf("Last modified: %s\n", fileObj.lastModified());
            System.out.printf("Path: %s\n", fileObj.getPath());
            System.out.printf("Absolute Path: %s\n", fileObj.getAbsolutePath());
            System.out.printf("Parent: %s\n", fileObj.getParent());
            if (fileObj.isDirectory()) {
                String[] directory = fileObj.list();

                System.out.println("Directory contents:");
                for (String item : directory)
                    System.out.println(item);
            }
        } else {
            System.out.println("No such file or Directory.");
        }
    }
}
