/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiornumeromatriz;

/**
 *
 * @author FilipeBarros
 */
public class MaiorNumeroMatriz {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
		int[] arr = { 0, 3, 4, 6, 9, 8, 7, 2, 1, 5 };
		System.out.println(max(arr, 0, 0));
	}
	public static int max(int[] array, int offset, int max) {
		if (array.length > offset + 1) {
			if (array[offset] > array[offset + 1])
				return max(
					array,
					offset + 1,
					array[offset] > max ? array[offset] : max);
			else
				return max(
					array,
					offset + 1,
					array[offset + 1] > max ? array[offset] : max);
		}
		return max;
	}
    
    
}
