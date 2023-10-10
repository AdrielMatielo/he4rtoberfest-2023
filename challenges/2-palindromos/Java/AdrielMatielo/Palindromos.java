public class Palindromos{
    public static void main(String[] args){
        for (int i=0; i<args.length; i++){
            String reverseTest = new StringBuilder(args[i]).reverse().toString();
            System.out.println((args[i].toLowerCase()).equals(reverseTest.toLowerCase()));
        }
    }
}