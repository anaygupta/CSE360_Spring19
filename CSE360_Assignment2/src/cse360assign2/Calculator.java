//Author: Anay Gupta
//Class ID: 390
//Assignment #1: In Calculator.java, basic calculator functions are outlined and implemented.  

package cse360assign2;
public class Calculator 
{
	//declaring instance field total
	private int total;
	
	/* The default constructor sets instance field total to 0. */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/* The getTotal method returns the current total value.
	 * @return  the total value 
	 */
	public int getTotal () 
	{
		//return 0;
		return total;
	}
	
	/* The add method adds the parameter to the total variable.
	 * @param  value  the value to add to total
	 */
	public void add (int value) 
	{
		total = total + value;
	}
	
	/* The subtract method subtracts the parameter from the total variable.
	 * @param  value  the value to subtract from total
	 */
	public void subtract (int value) 
	{
		total = total - value;
	}
	
	/* The multiple method multiplies the total variable by the parameter.
	 * @param  value  the value to multiply total by 
	 */
	public void multiply (int value) 
	{
		total = total * value;
	}
	
	/* The divide method divides the total variable by the parameter. 
	 * It uses integer division.
	 * If the parameter is zero, total is set to zero. 
	 * @param  value  the value to divide total by 
	 */
	public void divide (int value) 
	{
		if (value == 0)
		{
			total = 0;
		}
		total = total / value;
	}
	
	/* The getHistory method returns an empty string.
	 */
	public String getHistory () 
	{
		return "";
	}
}