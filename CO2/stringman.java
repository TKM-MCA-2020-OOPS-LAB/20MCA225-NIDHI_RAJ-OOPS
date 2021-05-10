class stringman
{
	public static void main(String args[])
	{
		String str1="Hello World";
		String str2="Hi World";
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		String str3=str1.concat(str2);
		System.out.println("Concatenated:"+str3);
		System.out.println("Conactenated string's length:"+str3.length());
		System.out.println("Charecter at position 6 of str1:"+str1.charAt(6));
		System.out.println("Comapring str1 & str2:"+str1.compareTo(str2));
		System.out.println("str2 in lower case:"+str2.toLowerCase());
		System.out.println("str2 in upper case:"+str2.toUpperCase());
		System.out.println("str2 replacing:"+str2.replace('W','w'));
		System.out.println("str1 triming:"+str1.trim()+",Welcome");
		System.out.println("Checking if str1 is empty :"+str1.isEmpty());
	}
}