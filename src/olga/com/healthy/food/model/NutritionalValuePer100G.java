package olga.com.healthy.food.model;

import java.io.Serializable;

public class NutritionalValuePer100G implements Serializable{

	private static final long serialVersionUID = -4022498677518582802L;
	
	public int constituentId;
	public String constituentType;
	public double value;
	public int unitsId;
	
	public NutritionalValuePer100G(){
		
	}
	
	public NutritionalValuePer100G(int constituentId, String constituentType){
		this.constituentId = constituentId;
		this.constituentType = constituentType;
	}
}
