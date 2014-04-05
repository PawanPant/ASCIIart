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
			positionArray[i]=characterPosition(inputString.charAt(i));
			i++;
		}

		for(i=0;i<5;i++)
		{
			String temp=br.readLine();
			for(int j=0;j<inputString.length();j++)
			{
				System.out.print(temp.substring(positionArray[j],positionArray[j]+5)+" ");
			}
			System.out.println();
		}

	}

	static int characterPosition(char character)
	{
		if(character==' ')
			return 130;
		return ((int)character-(int)'a')*5;
	}
}