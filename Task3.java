import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int evenPosTotal = 0;
        int oddPosTotal = 0;
        for(int i = 0; i < 5;i++){
            System.err.println("Enter Number"+(i+1));
            List.add(input.nextInt());
        }
        Boolean isPrime = false;
        int i = 0;
        while (!isPrime && (i < 5)) {
            int count = 0; 
            for(int ind = 1 ; ind < (List.get(i)/2) ; ind++){
                if ((List.get(i) % ind) == 0) count++;
            }
            if (count <= 2) isPrime = true;
        }
        if (isPrime) {
            for (int j = 0; j < List.size() ; j+=2) evenPosTotal += List.get(j);
            System.out.println(evenPosTotal);
        } else{
            for (int j = 1; j < List.size(); j+=2) oddPosTotal += List.get(j);
            System.out.println(oddPosTotal);
        }
        input.close();
    }
}