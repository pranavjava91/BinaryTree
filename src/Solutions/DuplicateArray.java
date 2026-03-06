package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class DuplicateArray {

	public List<Integer> findDuplicates(int[] nums) {

		List<Integer> reList = new ArrayList<Integer>();
		List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());

		Set<Integer> resultSet = numList.stream().filter(i -> Collections.frequency(numList, i) > 1).collect(Collectors.toSet());
		reList.addAll(resultSet);
		return reList;

	}
	
	public List<Integer> findDuplicatesNew(int[] nums){
		
		List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
		HashSet<Integer> seen = new HashSet<Integer>();
		
		List<Integer> result = numList.stream().filter(i->!seen.add(i)).collect(Collectors.toList());
		return result;
		
	}

	public static void main(String[] args) {

		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

		DuplicateArray duplicateArray = new DuplicateArray();
		List<Integer> numbers = duplicateArray.findDuplicatesNew(nums);
		for (Integer number : numbers) {
			System.out.println(number);
		}

	}

}
