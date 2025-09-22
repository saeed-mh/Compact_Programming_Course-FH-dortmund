public class Primes {

    public void primesUpdated(){
        int nValues = 50;
        outer : for (int i = 2 ; i <= nValues ; i ++){
            for(int j = 2 ; j <= Math.sqrt(i) ; j++){
                if(i % j == 0){
                    continue outer;
                }
                
            }
            System.err.println(i);
        }
    }
}

