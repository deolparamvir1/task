
public class Task2 {

	
	public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
	
	public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	
	
	private static void fibonacci(int n) {
        int first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
	
	
	public static String reverse(String str) {
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        return rev.toString();
    }
	
	public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
	
	
	public static double Average(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    
    public static int Max(int[] grades) {
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    
    public static int Min(int[] grades) {
        int min = grades[0];
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(factorial(6));
		
		System.out.println(checkPrime(3));
		
		fibonacci(8);
		
		System.out.println(reverse("abcd"));
		
		System.out.println(isLeapYear(1996));
		
		int []numbers= {2,4,5,6,5,7,8,9,0,7,89};
		
		System.out.println(Average(numbers));
		System.out.println(Max(numbers));
		System.out.println(Min(numbers));
		
		
		
		
		

	}


}
