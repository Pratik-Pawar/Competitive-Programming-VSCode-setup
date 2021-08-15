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
class Int3 {

    int i, j, k;

    @Override
    public String toString() {
        return "int3{" + "i=" + i + ", j=" + j + ", k=" + k + '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Int3) {
            Int3 a = (Int3) obj;
            return (this.i == a.i && this.j == a.j && this.k == a.k);
        }

        return false;
    }

    @Override
    public int hashCode() {
        long R = i;
        R = R << 13 + j;
        R = R << 13 + k;

        return (int) R;
    }

}
