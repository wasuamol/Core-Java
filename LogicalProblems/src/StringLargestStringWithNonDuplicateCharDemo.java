import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class StringLargestStringWithNonDuplicateCharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] A = {"co","dil","ity"};
		String[] A = {};
		
		StringLargestStringWithNonDuplicateCharDemo o = new StringLargestStringWithNonDuplicateCharDemo();
		System.out.println(o.solution(A));
	}
	
	public int solution(String[] A){
		List<String> allPossibleCombinationList = new ArrayList<String>();
		
		// if array is null or array length is zero then return 0;
		if(A==null || A.length==0){
			System.out.println("Invalid input !!!");
			return 0;
		}	
		
		// add all possible combination of string in list
		for (int i = 0; i < A.length; i++) {
			StringBuffer sb = new StringBuffer(A[i]);
			for (int j = 0; j < A.length; j++) {
				if(i!=j){
					String s = new String(sb.append(A[j]));
					allPossibleCombinationList.add(s);
				}
					
			}
		}
		
		// sort list on basis of string length so that longest string appear first in list
		Collections.sort(allPossibleCombinationList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		});
		
		// check longest string first for duplicate char and return length of first longest string having non duplicate char
		for (String string : allPossibleCombinationList) {
			if(!checkStringHasDuplicateChar(string))
				return string.length(); 
		}
		return 0;
	}
	
	public boolean checkStringHasDuplicateChar(String s){
		Set<Character> set = new HashSet<Character>();
		for (Character c : s.toCharArray()) {
			if(set.contains(c))
				return true;
			else
				set.add(c);
		}
		return false;
		
	}

}
