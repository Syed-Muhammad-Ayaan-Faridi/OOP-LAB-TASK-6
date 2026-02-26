import java.util.ArrayList;
import java.util.Scanner;

class DuplicateRemover{
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        ArrayList<Integer> nonDuplicate = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean duplicate = false;
            for (int j = 0; j < nonDuplicate.size(); j++) {
                if (list.get(i).equals(nonDuplicate.get(j))) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                nonDuplicate.add(list.get(i));
            }
        }
        return nonDuplicate;
    }
}
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> nonDuplicate = new ArrayList<>();
        ArrayList<Integer> Number= new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of elements: ");
        int len = input.nextInt();
        for (int i = 0; i < len; i++) {
            Number.add(input.nextInt());
        }
        nonDuplicate = DuplicateRemover.removeDuplicates(Number);
        System.err.println(nonDuplicate.toString());
        input.close();
    }
}