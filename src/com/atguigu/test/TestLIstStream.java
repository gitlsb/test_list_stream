package com.atguigu.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * @author dagai
 *将集合去重，输出大于四的按降序排序的前个数字
 */
public class TestLIstStream {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,14,3,7,7,6,6,6,34,13,2);
		
		list.stream().distinct().sorted(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			} 
		}).filter(p -> p>4).limit(3).forEach(System.out::println);
		
	}

}
