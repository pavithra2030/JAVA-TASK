import java.lang.String;

public class StringMethodExample{

	public static void main(String args[]){

		String str ="Batch15 is toxic";
                String str2 ="BATCH15 IS TOXIC";	
		String str3 = "kgm@fs@batch15@thursday";

//contains() check whether the given value is available in the given variable along with case senstive.

		System.out.println("contains()"+str.contains("toxic"));

//concat() is used to add two different string and present it as single string.

		System.out.println("concat(): "+str.concat(" by birth"));

//equals() check whether the given variable in given string is equal or not its case sensitive and also space concerned.

		System.out.println("equals(): "+str.equals("Batch15 is toxic"));

//equalsIgnoreCase() ignores the case sensitive and check the value with the specified variable, also space concerned.

		System.out.println("equalsIgnoreCase(): "+str.equalsIgnoreCase("BATCH15 IS TOXIC"));

//toUpperCase() changes all the albhabets to captial
		System.out.println("toUpperCase(): "+str.toUpperCase());

//toLowerCase() changes all the albhabets to small letter

		System.out.println("toLowerCase(): "+str.toLowerCase());

//length() return the legth of the variable along with space

		System.out.println("length(): "+str.length());

//charAt() retruns the character that has been available in the specified index value 

		System.out.println("charAt(): "+str.charAt(5));	

//compareTo() returns the lexicographic positive value if it contains any term that has been available in the variable

		System.out.println("compareTo(): " + str.compareTo(str2));

//compareToIgnoreCase() returns the lexicographic zero value if the variables are same

		System.out.println("compareToIgnoreCase(): " + str.compareToIgnoreCase(str2));

//compareTo() returns negative value  if both the variable are different

		System.out.println("compareTo(): " + str.compareTo("hello"));

//indexOf() returns the index value of specified char

		System.out.println("indexOf(): " + str.indexOf('t'));

//isEmpty() is used to check the given variable is empty or not

		//System.out.println("isEmpty(): " + str.isEmpty());

//replace() used to replace specified word with the specified value

		System.out.println("replace(): " + str.replace("toxic","vedappu"));

//subString() is used to get string that has been mentioned from start index to end index

		System.out.println("substring(): " + str.substring(3,11));

//trim() is used to remove the space from start to end

		System.out.println("trim(): " + str.trim());

//lastIndexOF()returs the index of last occurrence of the given character 

		System.out.println("lastIndexOF(): " + str.lastIndexOf('i'));

//hashCode()returns the key from the hash table which holds variable as values

		System.out.println("hashCode(): " + str.hashCode());

//format() changes the given input in the specified format

		System.out.println("format(): " + str.format("%x",5));

//join() method is used to set a delimiter and join the parameterized values

		System.out.println("join(): " + String.join("-","raja","raji","monisha"));	
//replaceAll()

		System.out.println("replaceAll(): " + str.replaceAll("i","y"));	

//split()
		String[] arr1 = str3.split("@",2);
		System.out.println(arr1);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		for(String a1:arr1){
			System.out.println("pattern1"+a1);
		}			
	




}
}

