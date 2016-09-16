package com.letscodes.dp.creational.factory.plan;

public class PlanFactory {
	public static Plan getPlan(String planType) {
		if (planType.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("Institutional")) {
			return new InstitutionalPlan();
		} else if (planType.equalsIgnoreCase("Commercial")) {
			return new CommercialPlan();
		} else {
			return null;
		}

	}

}
