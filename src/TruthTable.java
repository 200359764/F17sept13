/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seunghwan Kim
 */
public class TruthTable {
    public static void main(String[] args)
    {
        System.out.printf("FALSE AND FALSE = %s%n", false && false) ;
        System.out.printf("FALSE OR FALSE = %s%n", false || false) ;
        System.out.printf("NOT FALSE = %s%n", ! false) ;
        
        System.out.printf("%nFALSE AND TRUE = %s%n", false && true) ;
        System.out.printf("FALSE OR TRUE = %s%n", false || true) ;
        System.out.printf("NOT TRUE = %s%n", ! true) ;
        
        System.out.printf("%nTRUE AND FALSE = %s%n", true && false) ;
        System.out.printf("TRUE OR FALSE = %s%n", true || false) ;
        
        System.out.printf("%nTRUE AND TRUE = %s%n", true && true) ;
        System.out.printf("TRUE OR TRUE = %s%n", true || true) ;
        
    }
}
