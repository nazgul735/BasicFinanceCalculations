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
            npv=+ nums.get(i)/Math.pow(1+interest, i);
            

        }   
        return npv;
        
    }
    
    public static void main(String[] args) {
        List<Integer> homo =new ArrayList<Integer>();
        homo.add(150);
        homo.add(100);
        homo.add(300);

        NPV o = new NPV(0.12, homo);
        System.out.println(o.calculateNpv());
        

    }
}
