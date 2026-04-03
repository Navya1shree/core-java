class SerialRunner{
	
	public static void main(String []team){
		Serial karna=new Serial();
		karna.serialName="Karna";
		karna.heroName="karna";	
		karna.heroineName="Nidii";
		karna.serialTime="8:00";
		karna.producerName="shruthi naydu";
		karna.vilanName="nayana";

		
	karna.displaySerialDetails();
   System.out.println("----------------------------------------");

	
	Serial s1=new Serial("annaya","shivu","paru","7:30","pramod shetty","sinna");
	s1.displaySerialDetails();
	System.out.println("----------------------------------------");
	
     Serial s2 = new Serial("Krishna Rukku", "Rukku ", "Krishna", "6:30", "Mouna gude mane", "Villain Name");
     s2.displaySerialDetails();
	System.out.println("----------------------------------------");

    Serial s3 = new Serial("Paaru", "Paaru ", "Aditya ", "7:0", "Sharath Bharadwaj", "Villain");
    s3.displaySerialDetails();
	System.out.println("----------------------------------------");

     Serial s4 = new Serial("Sathya", "Sathya", "Sagar", "5;30", "Gauthami Jadav", "Villain");
     s4.displaySerialDetails();
	System.out.println("----------------------------------------");

    Serial s5= new Serial("Gattimela", "Amulya ", "Rakshith ", "5:0", "Nisha Ravikrishnan", "Villain");
     s5.displaySerialDetails();
	System.out.println("----------------------------------------");

       Serial s6 = new Serial("Naa Ninna Bidalaare", "Sharath", "Neetha Ashok", "8:00 PM", "shetty", "Veena Sundar");
     s6.displaySerialDetails();
	System.out.println("----------------------------------------");

   Serial s7 = new Serial("Puttakkana Makkalu", "Umashree", "Akshara", "7:30 PM", "sagara", "Ramesh Pandit");
   s7.displaySerialDetails();
	System.out.println("----------------------------------------");

   Serial s8 = new Serial("Shravani Subramanya", "Asiya Firdose", "Amogh Aaditya", "6:0"," balaji ", "Balaraj");
    s8.displaySerialDetails();
	System.out.println("----------------------------------------");

     Serial s9 = new Serial("Sathya", "Gauthami Jadav", "Sagar Biligowda", "7:00 PM", "sharath", "Abhijeeth");
     s9.displaySerialDetails();
	System.out.println("----------------------------------------");

    Serial s10 = new Serial("Paaru", "Mokshitha Pai", "Sharath Padmanabhan", "7:45 PM", "rakshith", "Vinaya Prasad");
    s10.displaySerialDetails();
	System.out.println("----------------------------------------");
	
	}






}