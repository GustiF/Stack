/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author GUSTI
 */
public class Stack {
    private int ukuranMaks;
    private long[] arrayTumpukan;
    private int atas;
    
    public Stack(int s){
        ukuranMaks = s;
        arrayTumpukan = new long [ukuranMaks];
        atas = -1;
        
        
    }
    
    public long push (long j){
        return arrayTumpukan[++atas] = j;
        
    }
    
    public long pop () {
        return arrayTumpukan[atas--];
    }
    
    public long peek () {
        return arrayTumpukan[atas];
    }
    
    public boolean apaKosong() {
        return (atas == -1);
    }
    
    
    
}

class ujiTumpukan {
    public static void main (String[] args) {
        Stack tumpukan = new Stack (10);
        tumpukan.push(20);
        tumpukan.push(40);
        tumpukan.push(60);
        tumpukan.push(80);
        
        while( !tumpukan.apaKosong() ) {
            long nilai = tumpukan.pop();
            System.out.print(nilai);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
