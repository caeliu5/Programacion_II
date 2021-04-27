public class CounterTwo{
    public int MAX_COUNT=100;
    public int a;

    public void displayCount (){

        for(int i=0 ; i<MAX_COUNT ; i++ ){
            a++;// A empieza a contar de 1 en 1 

            if (a%12==0){
                System.out.println(a);
            }
        }

    }
}
