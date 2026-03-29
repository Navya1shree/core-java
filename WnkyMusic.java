class WnkyMusic{



public static String validateAndRegister(long mobileNumber,String fullName,String langue,String state){
	
	System.out.println("validateAndRegister method is started");
	String registerstatus=null;
	if(mobileNumber !=0 &&   fullName !=null && langue !=null && state  !=null){
		
		if(fullName.length()>4 && state.length()>4){
			
			registerstatus="thank you "+fullName+"registered successfully";
		}else{
			registerstatus="please check the length of psw,fullName,userName";
		}
		
	}else{
			registerstatus="please enter the valid Data";
		}
		System.out.println("validateAndRegister method is ended");
		return registerstatus;
		}
	}








