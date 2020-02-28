package com.company;
import java.util.ArrayList;
public class Child {
    private int Age;
    private boolean siblingInProgram;
    private int yearsOfAttendance;
    private String name;
    private int daycareID;
    private static int nextID = 1000;
    protected int currentage = Age;
    public int CalculateBill(){
        int billamount = 0;
        if(siblingInProgram == true) {
            if (Age == 1) {
                billamount = 400;
                billamount = (int) (billamount * .9);
                int i = yearsOfAttendance;
                while(i != 0){
                    billamount = billamount - 10;
                    i = i - 1;
                }
                return billamount;
            }
            if (Age == 2) {
                billamount = 300;
                billamount = (int) (billamount * .9);
                int i = yearsOfAttendance;
                if(i != 0){
                    billamount = billamount - 10;
                    i = i - 1;
                }
                return billamount;
            }
            if (Age == 3) {
                billamount = 200;
                billamount = (int) (billamount * .9);
                int i = yearsOfAttendance;
                if(i != 0){
                    billamount = billamount - 10;
                    i = i - 1;
                }
                return billamount;
            } else {
                billamount = 150;
                billamount = (int) (billamount * .9);
                int i = yearsOfAttendance;
                if(i != 0){
                    billamount = billamount - 10;
                    i = i - 1;
                }
                return billamount;
            }
        }
        else{
            if (Age == 0) {
                billamount = 400;
                int i = yearsOfAttendance;
                while(i != 0) {
                    billamount = billamount - 10;
                    i = i - 1;
                }
                return billamount;
            }
            if (Age == 2) {
                billamount = 300;
                int i = yearsOfAttendance;
                while(i != 0) {
                    billamount = billamount - 10;
                    i = i - 1;
                }
                return billamount;
            }
            if (Age == 3) {
                billamount = 200;
                int i = yearsOfAttendance;
                while (i != 0) {
                    billamount = billamount - 10;
                    i = i - 1;
                }
                return billamount;
            }
            else;
                billamount = 150;
                return billamount;
            }
        }

    public Child(String Name, boolean siblingPlan, int currentAge){
        Age = currentAge;
        name = Name;
        siblingInProgram = siblingPlan;
        daycareID = nextID;
        nextID++;
    }
    public  String getName(){
        return name;
    }
    public int getNum(){
        return Age;
    }
}