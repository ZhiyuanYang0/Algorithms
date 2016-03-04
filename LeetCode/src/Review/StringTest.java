package Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringTest {
    public static void main(String[] args) 
    {  
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	long nn = (long) Integer.MAX_VALUE + 1;
    	
    	
    	
    	
    	int n = 100;
    	String str = Integer.toString(n);
    	str += 100;
    	System.out.println(str);
    	
    	
    	
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        
        for (String s : map.keySet()) {
        	
        }
        
        List<Integer> list1 = new ArrayList<Integer>(){
        	{
        		add(0); add(1);
        	}
        };
        
        map.put("ss", new ArrayList<Integer>(){
        	{
        		add(0); add(1);
        	}
        });
        
    	
    	String a = "      bbb     ";
    	System.out.println(a.trim());
    	
    	Integer i = 44444;
        System.out.println(i.toString());
    	
    	
        //静态初始化两个长度不同的数组 
        int src[] = {1,2,3,4,5,6}; 
        int dest[] = {10,9,8,7,6,5,4,3,2,1}; 
        
        //将数组src的4个元素copy到数组dest中 
        System.arraycopy(src,1,dest,2,4); 
        
        System.out.println(Arrays.toString(dest));
    } 

}
