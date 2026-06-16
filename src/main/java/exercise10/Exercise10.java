package exercise10;

import java.util.ArrayList;
import java.util.List;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> interns = new ArrayList<String>();
		
		interns.add("陳○陞");
        interns.add("吳○筑");
        interns.add("王○慈");
        interns.add("林○宏");
        interns.add("王○瑄");
        interns.add("陳○妤");
        interns.add("曾○彤");
        interns.add("魏○淳");
        interns.add("吳○仙");
        interns.add("李○臻");
        interns.add("黃○瑄");
        interns.add("莊○軒");
        
        interns.sort(null);
        
        System.out.println("目前實習生人數： " + interns.size());
        
        String target = "陳○妤";
        int index = BinarySearch(interns, target);
        if (index > -1)
        	System.out.println(target + " 同學的索引值為 " + index + ", 在第 " + (index + 1) + " 位");
        else
        	System.out.println("找不到 " + target + " 同學");
	}
	
	public static int BinarySearch(List<String> interns, String name) {
		int left = 0, right = interns.size();
		while(left <= right) {
			int mid = (left + right) / 2;
			if(interns.get(mid).equals(name))
				return mid;
			else if (interns.get(mid).compareTo(name) > 0)
				right = mid - 1;
			else if (interns.get(mid).compareTo(name) < 0)
				left = mid + 1;
		}
		return -1;
	}

}
