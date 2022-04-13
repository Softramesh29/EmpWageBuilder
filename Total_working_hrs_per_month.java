package Total_working_hrs_per_month;

public class Total_working_hrs_per_month {
	public static final int part_time = 1;
	public static final int full_time = 2;
	public static final int rate_per_hour = 20;
	public static final int num_of_working_days = 2;
	public static final int maximum_hours_in_month = 10;
	
public static void main(String[] args) {
	int totalemphrs = 0, totalempwage =0 , totalworkingdays =0;
	
	while (totalemphrs <= maximum_hours_in_month &&
			totalworkingdays < num_of_working_days) {
			int emphrs = 0;
			totalworkingdays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case part_time:
			emphrs = 4;
			break;
			case full_time:
			emphrs = 8;
			break;
			default:
				emphrs = 0;
			}
			totalemphrs += emphrs;
			System.out.println("day# : " + totalworkingdays + "Emp Hr : " + emphrs);
	}
	int totalempwages = totalemphrs * rate_per_hour;
			System.out.println("Total Emp Wage : " + totalempwages);
			
	}
}

