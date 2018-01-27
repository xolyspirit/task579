package solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.sumModule();
    }

    private void sumModule() throws IOException {
        //for keep results
        ArrayList<Integer> pozitive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        //for reading file
                Scanner scanner = new Scanner(new File("INPUT.TXT"));
       int count = scanner.nextInt();
       int element,i = 0;

       //for calculating
       int modulePoz = 0,moduleNeg = 0;

       //reading file and calculating modules
       while (scanner.hasNextInt()&&i<count){
           i++;
           element = scanner.nextInt();
           if (element>0){
               pozitive.add(i);
               modulePoz += element;
           }
           else{
               negative.add(i);
               moduleNeg += element;
           }
       }

        //for writing file
        FileWriter writer = new FileWriter("OUTPUT.TXT");

        //write in file result of comparing
        if (modulePoz>Math.abs(moduleNeg)){
            writer.write(String.valueOf(pozitive.size()));
            writer.append("\n");
            for (int p: pozitive) {
                writer.append(String.valueOf(p)).append(" ");
            }
        }
        else {
            writer.write(String.valueOf(negative.size()));
            writer.append("\n");
            for (int n: negative) {
                writer.append(String.valueOf(n)).append(" ");
            }
        }
        writer.close();
    }
}
