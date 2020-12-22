class Armstrongnumber
{
	private boolean findArmStrongNumber(int i)
	{
			
		int[] digit = findDigitFromInt(i);
                if(((digit[0]*digit[0]*digit[0])+(digit[1]*digit[1]*digit[1])+(digit[2]*digit[2]*digit[2]))==i)
        		return true;
                else
			return false;
	}

	static int[] findDigitFromInt(int i)
	{
		int[] digits ={(i/100),((i/10)-((i/100)*10)),(i -((i/100)*100) -(((i/10)-((i/100)*10))*10))};
		return digits;
	}

	public void main(String[] args)
	{
		Armstrongnumber MyObj = new Armstrongnumber();

		//find armstrong number between 100 to 10000
		for(int num=100;num<999;num++)
			if(MyObj.findArmStrongNumber(num))
				System.out.println("Given number is Arm strong number = "+ num);
			else
				System.out.println("Given number isn't Arm strong number = "+ num);
	}
}
