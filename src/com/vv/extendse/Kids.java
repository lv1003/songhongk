package com.vv.extendse;

/**
 * Created by vv on 2018/8/25.
 */
public class Kids extends ManKind {
    private int yearsOld;

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println(this.yearsOld+"years old");
    }
}
