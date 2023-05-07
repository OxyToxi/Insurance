package contract;

import customer.Customer;
import insurance.Insurance;

import java.util.Date;


public class Contract {

	private String coverageDetails;
	private Date expirationDate;
	private int insuraceID;
	private int insuranceFee;
	private boolean isExpired;
	private boolean renewalStatus;
	public Contract(int insuranceID, int insuranceFee, Date expirationDate, String coverageDetails){
		this.insuraceID = insuranceID;
		this.insuranceFee = insuranceFee;
		this.expirationDate = expirationDate;
		this.coverageDetails = coverageDetails;

	}

	public boolean checkExpired(){
		int result = expirationDate.compareTo(new Date());


		if(result <= 0){
			isExpired = false; // 만료 안됨
		}
		else{
			isExpired = true; // 만료됨
		}
		return isExpired;
	}

	public boolean updateRenuewalStatus(boolean renewalStatus){
		this.renewalStatus = renewalStatus;
		return this.renewalStatus;
	}

}