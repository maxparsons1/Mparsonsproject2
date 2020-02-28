package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class DayCareFacility{
    private ArrayList<Child> allstudent;
    private ArrayList<DayCareWorker> allemployees;
    private Child currentChild;
    private DayCareWorker currentEmployees;
    public static void main(String[] args){
    }
    private void menu(){
        System.out.println("How would you like to proceed?");
        System.out.println("enter the number with the corresponding option");
        System.out.println("[1]Admit child");
        System.out.println("[2]Hire worker");
        System.out.println("[3]Remove student to go to school");
        System.out.println("[4]Run fire drill");
        System.out.println("[5]End of year");
        System.out.println("[6]Do accounting");
        System.out.println("[7]Exit");
    }
    public void addChild(Scanner inputscanner1){
        inputscanner1.nextLine();
        System.out.print("What is the new child's name:");
        var name = inputscanner1.nextLine();
        System.out.println("Is the child on a sibling plan(true or false):");
        var siblingPlan = Boolean.parseBoolean(inputscanner1.nextLine());
        System.out.println("What is the childs current age:");
        int currentAge = Integer.parseInt(inputscanner1.nextLine());
        currentChild = new Child(name, siblingPlan, currentAge);
 /*       var employees = allemployees.size();
        var randGenerator = new Random();
        var num = randGenerator.nextInt(employees);
        var nameofemployees = allemployees.get(num);*/
        allstudent.add(currentChild);

        System.out.println("Congratulations! Child "+ currentChild.getName() + " has been added to the program");
    }
    public Child StudentGoToSchool(){
        Child accountToClose = null;
        for(var Child : allstudent){
            if(Child.getNum()> 6) {
                System.out.println("Child " + Child.getName() + " has turned 6 and has been removed from the program");
                accountToClose = Child;
            }
        }
        allstudent.remove(accountToClose);
        return accountToClose;
    }

    public void endofyear(){
        for(var Child : allstudent){
            Child.currentage = Child.currentage + 1;
        }
        for(var DayCareWorker : allemployees){
            DayCareWorker.performanceReview();
        }
    }
    public void hireworker(Scanner inputscanner2){
        inputscanner2.nextLine();
        System.out.print("What is the workesrs name:");
        var name = inputscanner2.nextLine();
        System.out.println("what is the worker's starting pay:");
        var startingPay = Float.parseFloat(inputscanner2.nextLine());
        currentEmployees = new DayCareWorker(startingPay, name);
        allemployees.add(currentEmployees);
        System.out.println("Congratulations! Worker "+ currentChild.getName() + " has been added to the program");
    }
    public void fireDrill(){
        for(var Child : allstudent)
        System.out.println(Child.getName() + "is safe.");
    }
    public void DoAccounting() {
        float revenue = 0;
        float payments = 0;
        for (var Child : allstudent){
            System.out.println(Child.getName() +" bill is $" + Child.CalculateBill());
            revenue = revenue + Child.CalculateBill();
        }
        for (var DayCareWorker : allemployees){
            System.out.println(DayCareWorker.getName() +" salary is $" + DayCareWorker.getSalary());
            payments = payments + DayCareWorker.getSalary();
        }
        var daycarerev = revenue - payments;
        if(daycarerev > 0){
            System.out.println("the day care made " + daycarerev);
        }
        else{
            System.out.println("The day care lost " + daycarerev);
        }

    }

    public void runDayCare(){
        var Input= new Scanner(System.in);
        while(true){
            menu();
            var choice = Input.nextInt();
            switch (choice){
                case 1:
                    addChild(Input);
                    break;
                case 2:
                    hireworker(Input);
                    break;
                case 3:
                    StudentGoToSchool();
                    break;
                case 4:
                    fireDrill();
                    break;
                case 5:
                    endofyear();
                    break;

                case 6:
                    DoAccounting();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("That was not a option");


            }
        }
    }
    public DayCareFacility(){
        allstudent = new ArrayList<Child>();
        allemployees = new ArrayList<DayCareWorker>();
    }
}
