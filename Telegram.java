class Telegram{



public static String validateAndRegister(long mobileNumber,String fullName,String birthday,String userName){
	
	System.out.println("validateAndRegister method is started");
	String registerstatus=null;
	if(mobileNumber !=0 && birthday !=null &&  fullName !=null && userName !=null){
		
		if(fullName.length()>4 && userName.length()>4){
			
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

