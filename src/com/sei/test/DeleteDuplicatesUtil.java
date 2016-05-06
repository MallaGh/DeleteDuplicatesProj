/**
 * 
 */
package com.sei.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Malla
 *
 */
public class DeleteDuplicatesUtil {

	/**
	 * This is the least preferable way of doing it, since we have to check if
	 * the element already exists in list or before adding it to the list.
	 * Positive side: Easily understandable. Negative side: Not a wise way of
	 * coding, it is very basic level.
	 * 
	 * @param nmberArray
	 * @return int[]
	 */
	public static int[] deleteDuplicates(int[] nmberArray) {
		List<Integer> listWithoutDupes = null;
		for (int i : nmberArray) {
			if (listWithoutDupes == null) {
				listWithoutDupes = new ArrayList<>();
			}
			if (listWithoutDupes.indexOf(i) == -1) {
				listWithoutDupes.add(i);
			}
		}
		int[] result = new int[listWithoutDupes.size()];
		for (int i = 0; i < listWithoutDupes.size(); i++) {
			result[i] = listWithoutDupes.get(i);
		}
		return result;
	}

	/**
	 * In this model we don't have to check for the element existence in the
	 * list. Since by default set won't keep duplicates. Positive side: Since we
	 * are using set no need of explicit check required. Negative side: Again
	 * this is basic level of coding.
	 * 
	 * @param nmberArray
	 * @return int[]
	 */
	public static int[] removeDuplicates(int[] nmberArray) {
		Set<Integer> setValues = null;
		for (int i = 0; i < nmberArray.length; i++) {
			if (setValues == null) {
				setValues = new LinkedHashSet<Integer>();
			}
			setValues.add(nmberArray[i]);
		}
		int[] result = new int[setValues.size()];
		int index = 0;
		for (Integer i : setValues) {
			result[index] = i;
			index++;
		}
		return result;
	}

	/**
	 * This is the most efficient way of removing duplicates from given array.
	 * As we can use Java8 features to converting primitive array to object
	 * array and by using stream and distinct method we can remove duplicated
	 * without any other comparisons. Positive side: Using Java8 lambdas and
	 * streams it is very easy to code. It avoids lot of boiler plate coding.
	 * Negative side: Difficult to understand who didn't work with Java8.
	 * 
	 * @param nmberArray
	 * @return int[]
	 */
	public static int[] eliminateDuplicates(int[] nmberArray) {
		List<Integer> listWithoutDups = new ArrayList<>();
		List<Integer> arrayAsList = IntStream.of(nmberArray).boxed().collect(Collectors.toList());
		arrayAsList.stream().distinct().forEach(i -> listWithoutDups.add(i));
		int[] arrayWithoutDupes = listWithoutDups.stream().mapToInt(i -> i).toArray();
		return arrayWithoutDupes;
	}

}
