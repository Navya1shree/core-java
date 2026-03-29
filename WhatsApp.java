class WhatsApp{



public static String validateAndRegister(String firstName,String lastName,String gender,long mobileNumber,String birthday,String psw){
	
	System.out.println("validateAndRegister method is started");
	String registerstatus=null;
	if(firstName !=null && lastName !=null && gender !=null && mobileNumber !=0 && birthday !=null && psw !=null){
		
		if(psw.length()>4 && firstName.length()>4 && lastName.length()>4 && gender.length()>4  ){
			
			registerstatus="thank you "+firstName+"registered successfully";
		}else{
			registerstatus="please check the length of psw,firstName,userName";
		}
		
	}else{
			registerstatus="please enter the valid Data";
		}
		System.out.println("validateAndRegister method is ended");
		return registerstatus;
		}
	}
