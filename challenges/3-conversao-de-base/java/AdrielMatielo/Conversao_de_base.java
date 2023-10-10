import java.util.Scanner;

public class Conversao_de_base{
    public static void main(String[] args){
        if(args.length == 0){
            Scanner sc = new Scanner(System.in);
            int[] nums = new int[3];
            for(int i : nums){
                nums[i] = sc.nextInt();
                String binary = Integer.toBinaryString(nums[i]);
                System.out.println(binary);
            }
        }else {
            for (int i = 0; i < args.length; i++) {
                String binary = Integer.toBinaryString(Integer.parseInt(args[i]));
                System.out.println(binary);
            }
        }
    }
}