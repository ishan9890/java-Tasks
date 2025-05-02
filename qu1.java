public class qu1 {
    public static String isPrime(int num) {
        if (num<=1){
            return num + "is not a prime number";
            
        }
        for(int i = 2; i < num; i++){
            if(num %i == 0){
                return num + "is not a prime number because it is divisible by" + i+".";

            }
        }
        return num + "is a prime numvber";

    }
    public static void main(String[] args) {
        int number =17;
        String result = isPrime(number);
        System.out.println(result);
    }
    
}
