package com.company;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
public class DayCareWorker {
    private String Name;
    private float salary;
    private ArrayList<Child> childerenInGroup;
    Random randgenerator = new Random();
    int perfomanceReviewnum = randgenerator.nextInt(5) + 1;

    public String getName() {
        return Name;
    }

    public float getSalary() {
        return salary;
    }

    public boolean addchild(Child newKid) {
        childerenInGroup = new ArrayList<Child>();
        return true;
    }

    DayCareWorker(float startingPay, String Name) {
        salary = startingPay;
    }

    public double performanceReview() {
        System.out.println(getSalary());
        if (perfomanceReviewnum == 1) {
            salary = (float) salary * 1;
            return getSalary();
        }
        if (perfomanceReviewnum == 2) {
            salary = (float) (salary * 1.01);
            return getSalary();
        }
        if (perfomanceReviewnum == 3) {
            salary = (float) (salary * 1.025);
            return getSalary();
        }
        if (perfomanceReviewnum == 4) {
            salary = (float) (salary * 1.035);
            return getSalary();
        } else {
            salary = (float) (salary * 1.05);
            return getSalary();
        }
    }

}
