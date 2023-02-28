class Incremental {
    private static Incremental singletonInc;
    private static int count = 0;
    private int numero;

    private Incremental() {
        
    }

    public void increment(){
        numero = ++count;
    }

    public static synchronized Incremental getInstance(){
        if(singletonInc == null)
        singletonInc = new Incremental();

        singletonInc.increment();
        return singletonInc;
    }

    public String toString() {
        return "Incremental " + numero;
    }
 }

public class TesteIncremental {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
          Incremental inc = Incremental.getInstance();
          System.out.println(inc);
        }
    }
 }