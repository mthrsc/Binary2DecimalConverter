/*
b2d.java
@author MthRsc
5 2 2020
*/

import javax.swing.JOptionPane;

public class b2d{

	public static int bit1, bit2, bit3, bit4, bit5, bit6, bit7, bit8, bit9, bit10, bit11, bit12, bit13, bit14, bit15, bit16;

	public static void main(String args[]){

			//var
			String input;
			bit1=bit2=bit3=bit4=bit5=bit6=bit7=bit8=bit9=bit10=bit11=bit12=bit13=bit14=bit15=bit16=0;

			String htmlHeader="<html><body><table\"style=width:100%; border: 1px solid black;\">";
			String htmlTableR1="<tr><th>32768</th><th>16384</th><th>8192</th><th>4096</th><th>2046</th><th>1024</th><th>512</th><th>256</th><th>128</th><th>64</th><th>32</th><th>16</th><th>8</th><th>4</th><th>2</th><th>1</th></tr>";
			String htmlTableR2=null;
			String htmlClose="</table></body></html>";

			Computeb2d cbd=new Computeb2d();

			//input
			input=JOptionPane.showInputDialog(null,"Enter a binary(16bits max): \n"+"When copy/pasting be careful to not add spaces");
			cbd.applyInput(input);

			//process
			cbd.Conversion();

			//output
			htmlTableR2="<tr><th>"+bit16+"</th><th>"+bit15+"</th><th>"+bit14+"</th><th>"+bit13+"</th><th>"+bit12+"</th><th>"+bit11+"</th><th>"+bit10+"</th><th>"+bit9+"</th><th>"+bit8+"</th><th>"+bit7+"</th><th>"+bit6+"</th><th>"+bit5+"</th><th>"+bit4+"</th><th>"+bit3+"</th><th>"+bit2+"</th><th>"+bit1+"</th></tr>";
			JOptionPane.showMessageDialog(null,htmlHeader+htmlTableR1+htmlTableR2+htmlClose+"\n"+"Result: "+cbd.result);
	}
}