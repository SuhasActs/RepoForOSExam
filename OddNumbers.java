public class OddNumbers {
    public static void main(String[] args) {
        int count = 0; 
        int num = 1;   

        System.out.println("The first 100 odd numbers are:");

        while (count < 100) {
            System.out.print(num + " "); 
            num += 2;  
            count++;   

            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
