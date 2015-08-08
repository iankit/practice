/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler;

/**
 *
 * @author Zion
 */
public class problem1 {
    public void solve(long range){
        long ans =0;
        for(int i = 0; i<range;i++)
        {
           if(i%3==0 || i%5==0)
           {
               ans+=i;
           } 
        }
        System.out.println(ans);
    }
        
    

    public static void main (String[] args){
        problem1 prog = new problem1();
        prog.solve(10);
        prog.solve(100);
        prog.solve(1000);
    }
}