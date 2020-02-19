package com.example.luisangel.mcd;

public class MCD {
    public int mcd(int a, int b){
        if(a == 0) return b;
        else if(b == 0) return a;
        int z = a%b;
        return mcd(b,z);
    }
}
