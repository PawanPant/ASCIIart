import java.io.*;
class ASCII
{
	public static void main(String args[]) throws IOException 
	{
		String inputString= args[0].toLowerCase();							//converting to lowercase for uncomplicated comparision
		int positionArray[]= new int[inputString.length()];					//array to store initial index for every character art
		BufferedReader br= new BufferedReader(new FileReader("./ASCII"));	//buffering the file
		
		int i=0;
		while(i!=inputString.length())
		{
			positionArray[i]=characterPosition(inputString.charAt(i));		//feeding initial index of every character in the array which will be later used to refer character replacements with ASCII art in the file ASCII
			i++;
		}

		for(i=0;i<5;i++)
		{
			String temp=br.readLine();										//temp file, holds a line of the ASCII file, NOTE: readLine(), jumps to the next line after it is run
			for(int j=0;j<inputString.length();j++)
			{																//printing substring of the whole first line
				System.out.print(temp.substring(positionArray[j],positionArray[j]+5)+" ");
			}																//length of each ascii art=5 characters
			System.out.println();
		}

	}

	static int characterPosition(char character)
	{
		if(character==' ')													//special case for space
			return 130;
		return ((int)character-(int)'a')*5;									//returns index of the character relative to a
	}
}