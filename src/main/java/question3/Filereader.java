package question3;

import java.io.*;

public class Filereader {


    private static Filereader Filereader = null;

    private int val;

    private Filereader() {

    }

    public static Filereader getInstance() {
        if (Filereader == null) {
            synchronized (Filereader.class) {
                if (Filereader == null) {
                    Filereader = new Filereader();
                }
            }
        }

        return Filereader;
    }

    public void fun() {

        try {

            BufferedReader reader=new BufferedReader(new FileReader("/home/archit/Desktop/file1.txt"));
            val=Integer.parseInt(reader.readLine());

            System.out.println(Thread.currentThread().getName()+" : "+val);
            val=val*5;

            reader.close();
            String str=String.valueOf(val);
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/archit/Desktop/file1.txt"));
            writer.write(str);

            writer.close();
        }
        catch (Exception ex){

        }
    }
}
