public class TimeCalc {
    public static void main(String[] args) 
    {
        // Replace this comment with your code
        int newHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int newMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt("" + args[1]);


        int totalMinutes=0;
        int totalHours=0;
        System.out.println(totalMinutes +" " +totalHours+" "+newHours+" "+newMinutes);
        totalMinutes = newHours*60 + newMinutes + minutesToAdd;
        totalHours = totalMinutes/60;
        newHours = totalHours%24;
        newMinutes= totalMinutes-(totalHours*60);
        System.out.println(totalMinutes +" " +totalHours+" "+newHours+" "+newMinutes);

        if (newHours<12)  //if the hours is less than 12
			{
			if ((newHours>10)  || (newHours==10)) //if the hours is more than 10 or equal to 10
			 	{
					if (newMinutes<10) //if the hours is less than 10
					{
						System.out.println(newHours+":"+"0"+newMinutes); //printing of the hours
					}
					else //if the hours isnt less than 10
						{
						System.out.println(newHours+":"+newMinutes); //printing of the hours
						}
				}
			else  //if the hours isnt more than 10 or doesnt equal to 10
					{
						if (newHours==0) //if the hours is 0
						{
							if (newMinutes<10) //if the minutes is less than 10
							{
								System.out.println("0"+newHours+":"+"0"+newMinutes); //printing of the hours
							}
							else //if the minutes isnt less than 10
								{
								System.out.println("0"+newHours+":"+newMinutes); //printing of the hours
								}
						}
						else //if the hours isnt 0
						{
							if (newMinutes<10) //if the minutes is less than 10
							{
								System.out.println(newHours+":"+"0"+newMinutes); //printing of the hours
							}
							else //if the minutes isnt less than 10
								{
								System.out.println(newHours+":"+newMinutes); //printing of the hours
								}
						}
		
					}
			}
		else ///if the hours isnt less than 12
			{
					if (newHours==12) //if the hours equals to 12
						{
						if (newMinutes<10) //if the minutes is less than 10
						{
							System.out.println(newHours+":"+"0"+newMinutes); //printing of the hours
						}
						else //if the minutes isnt less than 10
							{
							System.out.println(newHours+":"+newMinutes); //printing of the hours
							}
						}
				  else if (newMinutes<10) //if the hours doesnt equals to 12 and less than 10 and if the minutes is less than 10
				   {
					   System.out.println(newHours-12+":"+"0"+newMinutes); //printing of the hours
				   }
				   else //if the minutes isnt less than 10
					   {
					   System.out.println(newHours-12+":"+newMinutes); //printing of the hours
					   }
			   
			}			
	}


    
}
