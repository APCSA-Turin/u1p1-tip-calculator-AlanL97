package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        double totalTip = percent/100.0*cost;
        double totalBill = cost+totalTip;
        double perPersonBeforeTip = cost/people;
        double tipPerPerson = totalTip/people;
        double totalCostPerPerson = totalBill/people;
        totalTip = Math.round(totalTip*100.0)/100.0; //I learned how to round here: https://stackoverflow.com/questions/8825209/rounding-decimal-points
        totalBill = Math.round(totalBill*100.0)/100.0; //Math.round rounds to the nearest whole number. 
        perPersonBeforeTip = Math.round(perPersonBeforeTip*100.0)/100.0; //Rounding the variable time 100.0 keeps the tenth and hundredth place digit and dividing by 100.0 makes it so that the tenth and hundreth number are in the correct place
        tipPerPerson = Math.round(tipPerPerson*100.0)/100.0;
        totalCostPerPerson = Math.round(totalCostPerPerson*100.0)/100.0;
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + "$" + totalTip + "\n");
        result.append("Total Bill with tip: " + "$" + totalBill + "\n");
        result.append("Per person cost before tip: " + "$" + perPersonBeforeTip + "\n");
        result.append("Tip per person: " + "$" + tipPerPerson + "\n");
        result.append("Total cost per person: " + "$" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost =52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
