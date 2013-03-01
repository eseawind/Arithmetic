package com.zcwfeng.utils.arithmetic.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 
 * @author zcwfeng
 * 
 */
public class BubbleSortArithmetic {

	/**
	 * 简单冒泡排序
	 * 
	 * 从后向前
	 * 
	 * @param pData
	 * @return
	 */
	public static int[] bubbleSort(int pData[]) {
		int temp;
		for (int i = 0; i < pData.length; i++) {
			for (int j = pData.length - 1; j > i; j--) {
				if (pData[j] < pData[j - 1]) {
					temp = pData[j];
					pData[j] = pData[j - 1];
					pData[j - 1] = temp;
				}
			}
		}
		return pData;

	}

	public static void main(String[] args) {
		int pData[] = new int[] { 27, 13, 49, 76, 38, 97, 65, 100 };
		int ret[] = bubbleSort(pData);
		System.err.println(Arrays.toString(ret));
	}
}
