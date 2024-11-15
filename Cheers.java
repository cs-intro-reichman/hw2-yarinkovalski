// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) 
        
        {

	    
            int numberOfCrowd= Integer.parseInt("" + args[1]);
            String anLetter = "AEFHILMNORSX";
        for (int i =0; i<=(args[0].length()-1); i++)
        {
                char letter = args[0].charAt(i);
                int letterPlace =0;
                int j =0;
                boolean flag = false;
                while (j<=(anLetter.length()-1) && flag==false)
                {
                        letterPlace = args[0].indexOf((anLetter.charAt(j)));  
                        if (letterPlace != -1 && letter==anLetter.charAt(j))
                                {
                                        System.out.println("Give me an " + letter + ": " + letter + "!" );
                                        flag = true;
                                }
                        j = j +1;                  
                }
                {
                if (flag == false)
                        System.out.println("Give me a " + letter + ": " + letter + "!" );
                }    

        }

        System.out.println("What does that spell?");
        for (int j=0; j<=numberOfCrowd; j++)
        {
                System.out.println(args[0] + "!!!");
        }
        }
}

