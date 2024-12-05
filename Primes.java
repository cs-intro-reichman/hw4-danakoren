public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        final int N = Integer.parseInt(args[0]);
        boolean [] arr = new boolean[N+1];
        int p = 2;
        for(int i = 0 ; i < arr.length ; i ++){
            if(i == 0 || i == 1){
                arr[i] = false;
            }
            arr[i] = true;
           
        }
            while( p * p <= N){
            
            if(arr[p]){
                for(int i = p * p ; i < arr.length ; i += p){
                    arr[i] = false;
                }
                
                
            }
            p++;
        }
        System.out.println("Prime numbers up to " + N + ":");
        int counter = 0;
        for( int i = 2 ; i <= N ; i++){
            if(arr[i] == true){
                System.out.println(i);
                counter++;
            }
        }
        double percent = ((double)counter /(double) N) * 100;
        System.out.println("There are " + counter + " primes between 2 and " + N + " (" + (int)percent + "% are primes)");
     
    }
}