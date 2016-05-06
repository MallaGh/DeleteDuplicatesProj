/**
 * 
 */
package com.sei.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


/**
 * @author Malla
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(DeleteDuplicatesUtil.class)
public class DeleteDuplicatesUtilTest {

	int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4,
			9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6, 19, 13,
			5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
	int[] expectedResult = { 1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43, 10000, 11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10,
			14, 12, 13, 7 };
	
	 @Before public void initMocks() {
         MockitoAnnotations.initMocks(this);
     }

	/**
	 * Test method for
	 * {@link com.sei.test.DeleteDuplicatesUtil#deleteDuplicates(int[])}.
	 */
	@Test
	public final void testDeleteDuplicates() {

		PowerMockito.mockStatic(DeleteDuplicatesUtil.class);
		BDDMockito.given(DeleteDuplicatesUtil.deleteDuplicates(randomIntegers)).willReturn(expectedResult);

		Assert.assertArrayEquals(expectedResult, DeleteDuplicatesUtil.deleteDuplicates(randomIntegers));

		PowerMockito.verifyStatic();
		DeleteDuplicatesUtil.deleteDuplicates(Mockito.any());

	}

	/**
	 * Test method for
	 * {@link com.sei.test.DeleteDuplicatesUtil#removeDuplicates(int[])}.
	 */
	@Test
	public final void testRemoveDuplicates() {
		PowerMockito.mockStatic(DeleteDuplicatesUtil.class);
		BDDMockito.given(DeleteDuplicatesUtil.removeDuplicates(randomIntegers)).willReturn(expectedResult);

		Assert.assertArrayEquals(expectedResult, DeleteDuplicatesUtil.removeDuplicates(randomIntegers));

		PowerMockito.verifyStatic();
		DeleteDuplicatesUtil.removeDuplicates(Mockito.any());
	}

	/**
	 * Test method for
	 * {@link com.sei.test.DeleteDuplicatesUtil#eliminateDuplicates(int[])}.
	 */
	@Test
	public final void testEliminateDuplicates() {
		PowerMockito.mockStatic(DeleteDuplicatesUtil.class);
		BDDMockito.given(DeleteDuplicatesUtil.eliminateDuplicates(randomIntegers)).willReturn(expectedResult);

		Assert.assertArrayEquals(expectedResult, DeleteDuplicatesUtil.eliminateDuplicates(randomIntegers));

		PowerMockito.verifyStatic();
		DeleteDuplicatesUtil.eliminateDuplicates(Mockito.any());
	}

}
