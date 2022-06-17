import java.util.Scanner;

class Triangle {
    static String triangleType(int a, int b, int c){
        if(a == b && b == c)
            return "Equilateral";
        else if(a == b || b == c || a == c)
            return "Isoscleles";
        else
            return "Scalene";
    }
    static void triangle(int a, int b, int c){
        System.out.println("Triangle is " + triangleType(a, b, c));
    }
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter sides of triangle: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        triangle(a, b, c);
    }
}
