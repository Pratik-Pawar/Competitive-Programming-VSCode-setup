/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

/**
 *
 * @author Administrator
 */
public class MathFun {

    int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    int digiCount(Object no) {
        return String.valueOf(no).length();
    }

    char[] toDigi(Object no) {
        return String.valueOf(no).toCharArray();
    }

}
