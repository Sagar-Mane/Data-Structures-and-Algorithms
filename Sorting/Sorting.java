package sorting;

public class Sorting {

	
	/**
	 * Function for dividing array into single possible value and sorting 
	 * @param Array to be sorted
	 * @return Sorted Array
	 */
	public int [] mergeSort(int arr[]){
		int len=arr.length;
		int mid=len/2;
		int left[]=new int[mid];
		int right[]=new int[len-mid];
		if(len<2){
			return arr;
		}
		else
		{			
			for(int i=0;i<mid;i++){
				left[i]=arr[i];
			}
			for(int i=mid;i<len;i++){
				right[i-mid]=arr[i];
			}
			
		}
		left=mergeSort(left);
		right=mergeSort(right);
		return merge(left,right);
	}
	/**
	 * Merge Function
	 * @param First sorted array
	 * @param Second sorted array
	 * @return	Merged single sorted array
	 */
	public int[] merge(int left[],int right[]){
		int left_len=left.length;
		int right_len=right.length;
		int i=0;	//index of the smallest unpicked element in left array
		int j=0;	//index of the smallest unpicked element in right array
		int k=0;	//index of the position that needs to be filed in resulting array
		int result[]=new int [left_len+right_len];
		while(i<left_len&&j<right_len){
			if(left[i]<=right[j]){
				result[k]=left[i];
				i++;
			}
			else{
				result[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left_len){
			result[k]=left[i];
			i++;
			k++;
		}
		while(j<right_len){
			result[k]=right[j];
			j++;
			k++;
		}
		return result;
	}

}
