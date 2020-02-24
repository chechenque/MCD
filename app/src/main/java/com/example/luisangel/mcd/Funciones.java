package com.example.luisangel.mcd;

public class Funciones {
    public int mcd(int a, int b){
        if(a == 0) return b;
        else if(b == 0) return a;
        int z = a%b;
        return mcd(b,z);
    }

    public int mcm(int a, int b){
        return a*b/mcd(a,b);
    }

    public int congruencia(int a, int b, int n){
        int d = mcd(a,n);
        //ra+sn=d
        if(d%b == 0){
            int r,s;
            //r = (d-s*n)/a;
            //d = r
            return 0;
        }else{
            return -1;
        }
    }

    public int inverso(int n){
        return 0;
    }
}
