package com.systex.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LotteryService {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		String exludeString = args[1];
		Random random = new Random();
		
		String[] exludeNum = exludeString.split(" ");
		TreeSet<Integer> excludeNumSet = new TreeSet<>();
		
		for(int i=0; i<exludeNum.length ; i++) {
			excludeNumSet.add(Integer.parseInt(exludeNum[i]));
		}

//		for (int n : excludeNumSet) {
//            System.out.println(n);
//        }
		System.out.println("Excluded Number: "+excludeNumSet);
		System.out.println();
		TreeSet<Integer> generatedSet = new TreeSet<>();
		
		for(int i=0; i<num ;i++) {
			while(generatedSet.size()<6) {
				int n = random.nextInt(49) + 1;
				
				for(int j=0; j<excludeNumSet.size() ;j++) {
					if(!excludeNumSet.contains(n)){
						generatedSet.add(n);
					}
				}
			}
	
			System.out.println("Generated Number Set"+(i+1)+": "+generatedSet);
			generatedSet.clear();
		}
		
		
	}
*/	
	public List<List<Integer>> getNumbers(int groupNum, Set<Integer> excludeNumbers) {
        List<List<Integer>> result = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < groupNum; i++) {
            Set<Integer> group = new TreeSet<>();
            while (group.size() < 6) {
                int num = random.nextInt(49) + 1;  
                if (!excludeNumbers.contains(num)) {
                    group.add(num);
                }
            }
            result.add(new ArrayList<>(group));
        }
        
        return result;
    }
}
