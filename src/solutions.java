public class solutions{

    public static void main(String[] args){
        System.out.print(squareDiff());
    }

    public static int multiples(){
        int total = 0;
        for(int i = 1; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0)
                total += i;
        }
        return total;
    }

    public static int squareDiff(){
        int sumSq = 0;
        int sqSum = 0;
        for(int i = 1; i <= 100; i++){
            sumSq += (int)Math.pow(i, 2);
            sqSum += i;
        }
        sqSum = (int)Math.pow(sqSum, 2);
        return sqSum - sumSq;
    }

}