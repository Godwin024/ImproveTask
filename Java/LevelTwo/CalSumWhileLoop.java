public class CalSumWhileLoop{

    public static void main(String[] args){
    
        int count = 1;
        int sum = 0;
        
        while(count <= 50){
        
            sum+=count;
            count++;
        }
             System.out.printf(" %d%n ", sum);
    }

}
