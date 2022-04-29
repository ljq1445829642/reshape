import java.io.BufferedReader;
import java.util.Scanner;

/**
 * @author lijiaqing
 * @version 1.0
 * @date 2022/4/29 12:21
 */
public class Reshaping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []title  = sc.nextLine().split(",");
        String [][]datas = new String[1010][title.length];
        int rows = 0;
        String t;
        while(!(t=sc.nextLine()).equals("")){
            String [] temp;
            temp = t.split(",");
            datas[rows++] = temp;
        }
//country,1999,2000,2001
//A,0.7K,2K,5k
//B,37K,80K,99k
//C,212K,213K,555k
        int resRows = rows*(title.length-1);
        System.out.println("country year cases");
        int point  = 0;
        for (int i = 1; i < title.length; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(datas[j][0]+"  "+title[i]+"  "+datas[j][i]);
                System.out.println();
            }
        }


    }
}
