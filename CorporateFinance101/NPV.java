package CorporateFinance101;

import java.util.ArrayList;
import java.util.List;

public class NPV {


    private double interest;
    private double npv;
    private List<Integer> nums;

    public NPV(double interest, List<Integer> nums){
        this.interest=interest;
        this.nums=nums;

    }

    public double calculateNpv(){
        for (int i=0; i< nums.size(); i++){
            npv=+ nums.get(i)/Math.pow((1+interest), i);
            System.out.println(npv);
            

        }   
        return npv;
        
    }
    
    public static void main(String[] args) {
        List<Integer> li =new ArrayList<Integer>();
        li.add(-100);
        li.add(-100);
        li.add(250);
        double inter=0.1;

        NPV o = new NPV(inter, li);
        System.out.println(o.calculateNpv());
        

    }
}
