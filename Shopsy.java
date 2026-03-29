class Shopsy{



public static String validateAndRegister(long mobileNumber,short otp,String fullName,String adress){
	
	System.out.println("validateAndRegister method is started");
	String loginstatus=null;
	if(mobileNumber !=0 && otp !=null &&  fullName !=null && adress !=null){
		
		if(psw.length()>6 && fullName.length()>4 && userName.length()>4){
			
		registerstatus="thank you "+fullName+"login successfully";
		}else{
			registerstatus="please check the corectPassworld,fullName,adress";
		}
		
	}else{
			registerstatus="please enter the valid Data";
		}
		System.out.println("validateAndlogin method is ended");
		return registerstatus;
		}
	}
