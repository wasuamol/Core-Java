

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSmallestPositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,3,6,4,1,2};
		Solution s = new Solution();
		int solution = s.solution(A);
		System.out.println(solution);
	}

}

class Solution {
    public int solution(int[] A) {
    	
    	if(A.length==0)
    		return 0;
    	
    	
    	List<Integer> l = new ArrayList<Integer>();
    	int mindiff = 0;
    	
    	for (int i = 0; i < A.length; i++) {
			l.add(A[i]);
		}
    	
    		Collections.sort(l);
    	
    	System.out.println(l);
    	
    	for (int i = 0; i < l.size(); i++) {
    		if(l.get(i)>0) {
			int diff  = l.get(i+1) - l.get(i);
			if(diff>1) {
				return l.get(i)+1;
			}	
    		}
			
		}
    	
		return 0;
       
    }
}
