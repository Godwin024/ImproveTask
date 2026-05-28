public class CalSumDoWhile{

    public static void main(String[] args){
    
        int count = 1;
        int sum = 0;
        
        do{
            sum += count;
            System.out.printf("%d%n", sum);
            count ++;
        }while(count <= 50);
    }

}
