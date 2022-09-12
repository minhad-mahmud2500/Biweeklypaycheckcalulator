import java.util.*;
public class BiweeklyPaycheckCalculator {
public static void main (String[] args){
double fedtax=0;
double Stax =0;
Scanner scan=new Scanner(System.in);
System.out.println("please enter your payrate");
double rate=scan.nextInt();
System.out.println("Please enter how many hours you work daily ");
int hours=scan.nextInt();
System.out.println("please enter how many days you worked this period");
int days=scan.nextInt();
System.out.println("please enter how many sick days you've taken");
int sick=scan.nextInt();
System.out.println("plese enter how many vaction days you've taken");
int vacation=scan.nextInt();
System.out.println("which state do you live in?");
String state=scan.nextLine();
System.out.println("please say whether you are Single,Married Filing Jointly,Married Filing Separately,or Head of Household");
String filing=scan.nextLine();
double vacationpay=(hours*rate)*vacation;
double sickpay=(hours*rate)*sick;
double pay=(rate*hours*days)-(vacationpay+sickpay);
switch (state) {
case "AL":
     Stax =(6.50/100);
    break;
case "AK":
    Stax =0;
    break;
case "AZ":
    Stax =(4.90/100);
    break;
case "CA":
    Stax =(8/100);
    break;
case "CO":
    Stax =(4.55/100);
    break;
case "CT":
    Stax =(11.98/100);
    break;
case "DE":
    Stax =(5.55/100);
    break;
case "FL":
    Stax=0;
    break;
case "GA":
    Stax =(5.75/100);
    break;
case "HI":
    Stax =(8.25/100);
    break;
case "ID":
    Stax =(6/100);
    break;
case "IL":
    Stax =(4.95/100);
    break;
case "IN":
    Stax =(3.23/100);
    break;
case "IA":
    Stax =(5.50/100);
    break;
case "KS":
    Stax =(5.70/100);
    break;
case "KY":
    Stax =(5/100);
    break;
case "LA":
    Stax =(4.45/100);
    break;
case "ME":
    Stax =(5.50/100);
    break;
case "MD":
    Stax =(3.20/100);
    break;
case "MA":
    Stax =(5/100);
    break;
case "MI":
    Stax =(4.25/100);
    break;
case "MN":
    Stax =(4.35/100);
    break;
case "MS":
    Stax =(5/100);
    break;
case "MO":
    Stax =(4/100);
    break;
case "MT":
    Stax =(6.75/100);
    break;
case "NE":
    Stax =(6.84/100);
    break;
case "NV":
    Stax =0;
    break;
case "NH":
    Stax =(5/100);
    break;
case "NJ":
    Stax =(5.525/100);
    break;
case "NM":
    Stax =(5.90/100);
    break;
case "NY":
    Stax =(5.30/100);
    break;
case "NC":
    Stax =(4.99/100);
    break;
case "ND":
    Stax =(1.10/100);
    break;
case "OH":
    Stax =(2.765/100);
    break;
case "OK":
    Stax =(4.75/100);
    break;
case "OR":
    Stax =(9.90/100);
    break;
case "PA":
    Stax =(3.07/100);
    break;
case "RI":
    Stax =(5.99/100);
    break;
case "SC":
    Stax =(6/100);
    break;
case "SD":
    Stax =0;
    break;
case "TN":
    Stax =0;
    break;
case "TX":
    Stax =0;
    break;
case "UT":
    Stax =(4.85/100);
    break;
case "VT":
    Stax =(10.3/100);
    break;
case "VA":
    Stax =(2/100);
    break;
case "WA":
    Stax =0;
    break;
case "WV":
    Stax =(6.50/100);
    break;
case "WI":
    Stax =(5.3/100);
    break;
case "WY":
    Stax =0;
    break;        
}
switch(filing) {
case "Single":
	if(pay>0&&pay<9950) {
	 fedtax=(10/100);
		break;
	}
		else if(pay>9950&&pay<40525) {
			 fedtax=(12/100);
			break;
		}
		else if(pay>40525&&pay<86375) {
			 fedtax=(22/100);
			break;
		}
	else if(pay>86375&&pay<164925) {
			 fedtax=(24/100);
			break;
		}
	else if(pay>164925&&pay<209425) {
		 fedtax=(32/100);
		break;
	}
	else if(pay>209425&&pay<523600) {
	 fedtax=(35/100);
		break;
	}
	else if(pay>523600) {
		 fedtax=(37/100);
		break;
	}
case "Married Filing Jointly":
	if(pay>0&&pay<19900) {
		 fedtax=(10/100);
		break;
	}
		else if(pay>19900&&pay<81050) {
			 fedtax=(12/100);
			break;
		}
		else if(pay>81050&&pay<172750) {
			fedtax=(22/100);
			break;
		}
	else if(pay>172750&&pay<329850) {
			 fedtax=(24/100);
			break;
		}
	else if(pay>329850&&pay<418850) {
		 fedtax=(32/100);
		break;
	}
	else if(pay>418851&&pay<628300) {
	 fedtax=(35/100);
		break;
	}
	else if(pay>628301) {
		 fedtax=(37/100);
		break;
	}
case "Married Filing Separately":
	if(pay>0&&pay<9950) {
		 fedtax=(10/100);
		break;
	}
		else if(pay>9950&&pay<40525) {
			 fedtax=(12/100);
			break;
		}
		else if(pay>40525&&pay<86375) {
			 fedtax=(22/100);
			break;
		}
	else if(pay>86375&&pay<164925) {
		 fedtax=(24/100);
			break;
		}
	else if(pay>164925&&pay<209425) {
		fedtax=(32/100);
		break;
	}
	else if(pay>209425&&pay<314150) {
		 fedtax=(35/100);
		break;
	}
	else if(pay>314151) {
		 fedtax=(37/100);
		break;
	}
case "Head of Household":
	if(pay>0&&pay<14200) {
		 fedtax=(10/100);
		break;
	}
		else if(pay>14200&&pay<54200) {
			 fedtax=(12/100);
			break;
		}
		else if(pay>54200&&pay<86350) {
			 fedtax=(22/100);
			break;
		}
	else if(pay>86350&&pay<164900) {
			 fedtax=(24/100);
			break;
		}
	else if(pay>164900&&pay<209400) {
	 fedtax=(32/100);
		break;
	}
	else if(pay>209400&&pay<523600) {
		 fedtax=(35/100);
		break;
	}
	else if(pay>523600) {
		fedtax=(37/100);
		break;
	}
	}
    double tax=pay-((pay*fedtax)+(pay*Stax));
    double netpay=pay-tax;
    System.out.println("your biweekly paycheck is"+netpay);
}
}
