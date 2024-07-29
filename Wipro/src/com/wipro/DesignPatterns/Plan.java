package com.wipro.DesignPatterns;
import java.io.*;

abstract class Plan {
	protected double rate;
	abstract void getRate();
	
	public void calculateBills(int units) {
		System.out.println(units*rate);
		
	}

}
class DomesticPlan extends Plan{
	@Override
	public void getRate() {
		rate = 4;
		
	}
}
class CommercialPlan extends Plan{
	@Override
	public void getRate() {
		rate = 5;
	}
}
class InstutionalPlan extends Plan{
	@Override
	public void getRate() {
		rate = 6;
	}
}
class GetPlanFactory{
	public Plan getPlan(String planType) {
		if(planType == null) {
			return null;
			
		}
		if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
			
		}
		else if(planType.equalsIgnoreCase("INSTUTIONALPLAN")) {
			return new InstutionalPlan();
			
		}
		return null;
	}
}
class GenerateBill{
	public static void main(String[]args)throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();
		System.out.println("Enter the name of he plan for which the bill will be generated");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = br.readLine();
		System.out.println("Entyer the number of units for bill will be calculated:");
		int units = Integer.parseInt(br.readLine());
		Plan p = planFactory.getPlan(planName);
		System.out.println("Bill amount for " + planName+"of "+ units+" unit is:");
		p.getRate();
		p.calculateBills(units);
	}
	
		
		
	}
