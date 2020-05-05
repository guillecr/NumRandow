/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misrc;

/**
 *
 * @author guille_linux
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
