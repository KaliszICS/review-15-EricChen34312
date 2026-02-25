public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(goodString("abcdfedree"));
	}

	public static int goodString(String str){
		//this is an amateur O(n^2) solution, I was not cooking

		int length = str.length();

		//iterate through the string from the front
		for(int i = 0; i < length; i++){
			System.out.println(i);

			//iterate through the string from the end
			for(int j = 0; j < length-i; j++){
				System.out.println(j);

				//if charat i and charat length-j are the same (and meets the length criteria) we now have the largest good string 
				if(str.charAt(length-j-1) == str.charAt(i) && length-j-i >= 2){
					return i + j;
				}
			}
		}
		//return -1 if no good string can be made
		return -1;

		//still doesn't complete all of the test cases because (i think) testcase 6 is wrong RAAAAAAAAAHHHHH
	}

}
