package misrc;

/**
 *
 * @author Guillermo Casas
 */
public class NumRandow {
    public int newRand(int min, int max){
        float nF = (float)(Math.random()*(max-min))+min;
        return (int)nF;
    }
    public int newRand(){
        return this.newRand(0,9);
    }
    public NumRandow() {
    }
}
