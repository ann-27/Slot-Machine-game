import java.util.*;
//Slot machine java program.
class slotMachine {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		Random random = new Random();

		int userInput = 0;
		int credits = 10;
		int spin1 = 0 ;
		int spin2 = 0;
		int spin3 = 0;


		System.out.println("                                     *             ");
	    System.out.println("                                     1             ");
	    System.out.println("                                                   ");
	    System.out.println("                                   2   2           ");
	    System.out.println("                                                   ");
	    System.out.println("                                 3   3   3         ");
	    System.out.println("                                                   ");
	    System.out.println("                              4    4   4   4       ");
	    System.out.println("                                                   ");
	    System.out.println("                            5    5   5   5   5     ");
	    System.out.println("                                                   ");
	    System.out.println("                          6   6    6   6   6   6   ");
	    System.out.println("                                                   ");
	    System.out.println("                        7   7   7    7   7   7   7 ");    
	    System.out.println("                                    1 1            ");
	    System.out.println("                                    1 1            ");
	    System.out.println("                                    1 1            ");
	    System.out.println("                               MERRYCHRISTMAS      ");
	    System.out.println("                                                   ");


		System.out.println("1 - Display credits");
		System.out.println("                                    ");
		System.out.println("2 - Start the GAME :D");
		System.out.println("                                    ");
		System.out.println("3 - Exit game  :( ");
		System.out.println("                                    ");
        

		

		while(true){ 
				userInput=inputScanner.nextInt();
 


			if (userInput==1){
				// to display credits 
			    System.out.println("Your remaining credit is "+credits);
			    System.out.println("                               ");  // to add space between each line
				System.out.println("1 - Display remaining credits");
				System.out.println("                             "); // to add space between each line 
				System.out.println("2 - Play again :D");
				System.out.println("                             ");  
				System.out.println("3 - Exit game  :( ");
				System.out.println("                                                   ");	
			}
				



			if (userInput==3){
				System.out.println("GAME OVER");
				System.out.println("your remaining credit is "+credits);
				System.out.println("                             ");
				System.exit(0);
			}



			if(userInput==2){
				// play game 
				credits=credits-1; // subtract 1 credit to play
				spin1 = random.nextInt(7)+1;
				spin2 = random.nextInt(7)+1;
				spin3 = random.nextInt(7)+1;
				System.out.println("                                                                     "); 
				System.out.println(("|")+spin1+("|")+(" ")+ ("|") + spin2 + ("|")+(" ")+ ("|")+spin3+("|"));
				System.out.println("                                                                     ");
			}



			if(spin1==7 && spin2==7 && spin3==7){ 		
			//  777                  
				credits=credits+150;
				System.out.println("You have won 150 credits");
				System.out.println("You got three 7's in a row");
				System.out.println("Your new credit is "+credits);
				System.out.println("                             ");
			}




			if(spin1==spin2 && spin2==spin3){		
			// 3 numbers in order					
				credits=credits+80;
				System.out.println("You have won 80 credits");
				System.out.println("You got three matching numbers");
				System.out.println("Your new credit is "+  credits);
				System.out.println("                             ");
			}




			if(spin1+1==spin2 && spin2+1==spin3){    
			// in increasing order e.g. 123...
				credits=credits+40;
				System.out.println("You have won 40 credits");
				System.out.println("You got three ascending consecutive numbers");
				System.out.println("Your new credit is "+credits);
				System.out.println("                             ");
			}

			if(spin1==spin2-2 && spin1==spin3-1 || spin1==spin2-1 && spin1==spin3+1 || spin1==spin2-1 && spin1==spin3-1 || spin1==spin2+2 && spin1==spin3+1
			|| spin1==spin2+1 && spin1==spin3+2){
			// non sequential order 
					credits=credits+25;
				System.out.println("You have won 25 credits");
				System.out.println("You got three non sequential numbers in a row");
				System.out.println("Your new credit is "+credits);
				System.out.println("                             ");
			}


			if(spin1 % 2==0 && spin2 % 2 ==0 || spin2 % 2 ==0 && spin3 % 2 ==0 || spin1 %  2 ==0 && spin3 % 2 ==0){		
			// 2 matching EVEN
				credits=credits+10;
				System.out.println("You have won 10 credits");
				System.out.println("You got two matching even's");
				System.out.println("Your new credit is "+credits);
				System.out.println("                             ");
			}




			if (spin1 % 2 ==1 && spin2 %  2 ==1 ||  spin2 % 2 ==1 && spin3 % 2 ==1 || spin1 % 2 ==1 && spin3 % 2 ==1){	
			// 2 matching ODD
				credits=credits+5;
				System.out.println("You have won 5 credits");
				System.out.println("You got two matching odd's");
				System.out.println("Your new credit is "+credits);
				System.out.println("                             ");
			}




			if(spin1==7 || spin2==7 || spin3==7){		
			// any number =7
				credits=credits+2;
				System.out.println("You have won 2 credits");
				System.out.println("You got one 7");
				System.out.println("Your new credit is "+credits);
				System.out.println("                             ");
			}
			
			if(userInput ==2){
				System.out.println("1 - Display remaining credits");
				System.out.println("                             ");
				System.out.println("2 - Play again :D");
				System.out.println("                             ");
				System.out.println("3 - Exit game  :( ");
				System.out.println("                             ");

			}

				

			if (credits==0){
				System.out.println("GAME OVER");
				System.exit(0);                            
			}


		}
			
}


}