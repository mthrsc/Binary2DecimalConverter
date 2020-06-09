/*
Computeb2d.java
@author MthRsc
6 2 2020
*/

public class Computeb2d{
	String input;
	public int result;
	b2d main=new b2d();

	public void applyInput(String a)
	{
		input=a;
	}

	public void Conversion()
	{
		int bitToWrite=0;
		result=0;
		String characterTreated=null;
		System.out.println("input lenght: " + input.length());

		for (int i=0; i<input.length(); i++)
		{
			characterTreated=Character.toString(input.charAt(input.length()-i-1));
			System.out.println("characterTreated: " + characterTreated);

			if(characterTreated.equals("0"))
			{
				bitToWrite=0;
				//System.out.println("bitToWrite=" + characterTreated);

			}
			else if (characterTreated.equals("1"))
			{
				bitToWrite=1;
				//System.out.println("bitToWrite=" + characterTreated);
			}

			if(i==0&&bitToWrite==1)
			{
				main.bit1=bitToWrite;
				result=result+1;
			}
			else if(i==1&&bitToWrite==1)
			{
				main.bit2=bitToWrite;
				result=result+2;
			}
			else if(i==2&&bitToWrite==1)
			{
				main.bit3=bitToWrite;
				result=result+4;
			}
			else if(i==3&&bitToWrite==1)
			{
				main.bit4=bitToWrite;
				result=result+8;
			}
			else if(i==4&&bitToWrite==1)
			{
				main.bit5=bitToWrite;
				result=result+16;
			}
			else if(i==5&&bitToWrite==1)
			{
				main.bit6=bitToWrite;
				result=result+32;
			}
			else if(i==6&&bitToWrite==1)
			{
				main.bit7=bitToWrite;
				result=result+64;
			}
			else if(i==7&&bitToWrite==1)
			{
				main.bit8=bitToWrite;
			 	result=result+128;
			}
			else if(i==8&&bitToWrite==1)
			{
				main.bit9=bitToWrite;
				result=result+256;
			}
			else if(i==9&&bitToWrite==1)
			{
				main.bit10=bitToWrite;
				result=result+512;
			}
			else if(i==10&&bitToWrite==1)
			{
				main.bit11=bitToWrite;
				result=result+1024;
			}
			else if(i==11&&bitToWrite==1)
			{
				main.bit12=bitToWrite;
				result=result+2048;
			}
			else if(i==12&&bitToWrite==1)
			{
				main.bit13=bitToWrite;
				result=result+4096;
			}
			else if(i==13&&bitToWrite==1)
			{
				main.bit14=bitToWrite;
				result=result+8192;
			}
			else if(i==14&&bitToWrite==1)
			{
				main.bit15=bitToWrite;
				result=result+16384;
			}
			else if(i==15&&bitToWrite==1)
			{
				main.bit16=bitToWrite;
				result=result+32768;
			}
	}
}












    /*void removeLastChar(String str)
    {
        input=str.substring(0,str.length()-1);
    }
    */
}