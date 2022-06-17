public class output {
    public static void main(String[] args) {
        int y = 53, count = 7;
        while(true){
            System.out.println("Y value: " + y);
            count = y % count;
            y += count;
            if(count > 100){
                break;
            }
        }
    }
}
