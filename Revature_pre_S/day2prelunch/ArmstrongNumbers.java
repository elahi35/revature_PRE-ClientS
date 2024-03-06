
public class ArmstrongNumbers {
    public static void main(String[] args) {
        
        int start = 100;
        int end = 500;

        System.out.println("Armstrong numbers between 100 and 500:");
        for (int num = start; num <= end; num++) {
            if (isArmstrongNumber(num)) {
                System.out.println(num);
            }
        }
    }

    
    public static boolean isArmstrongNumber(int num) {
        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;

    
        for (originalNum =num; originalNum != 0; originalNum /= 10, ++n);

        originalNum = num;

        
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        
        if (result == num)
            return true;
        else
            return false;
    }
}