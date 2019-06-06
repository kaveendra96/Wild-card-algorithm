import java.util.Scanner;

class WildCard{
	public static void main(String args[]){
		
		System.out.println("Enter String to match :"); //get user input string for maching
		Scanner input=new Scanner(System.in);
		String string = input.nextLine();
		String pattern= input.nextLine();
		input.close();
		
		int val=new WildCard().machingText(string.toCharArray(),pattern.toCharArray());
		System.out.println("Equal pattern count is :"+val);	
	}
	public int machingText(char string[],char pattern[]){
		int i=0;
		int count=0;
		while(string[i] != '\0'){
			System.out.println("i :"+i);
			int j=0;
			while(pattern[j] != '\0'){
				if(string[i+j] == pattern[j]){
					System.out.println("j :"+j);
					j++;
					if(pattern.length == j+1){
						count++;
						System.out.println("count :"+count);
						
					}
				}
				else{
					break;	
				}
			}
			i++;
		}
		return count;
	}


}
