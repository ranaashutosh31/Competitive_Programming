/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an array of size N. The task is to sort the array elements by completing functions heapify() and buildHeap() which are used to implement Heap Sort.

Example 1:
Input:
N = 5
arr[] = {4,1,3,9,7}
Output:
1 3 4 7 9
Explanation:
After sorting elements
using heap sort, elements will be
in order as 1,3,4,7,9.
*/

class Solution
{
    //Function to build a Heap from array.
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        // Your code here
            int largest = i, li = 2*i+1, ri = 2*i+2;
            if(li<n && arr[li]>arr[largest]) largest = li;
            if(ri<n && arr[ri]>arr[largest]) largest = ri;
            if(largest!=i){
                swap(arr,largest,i);
                heapify(arr,n,largest);
            }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr,n);
        for(int i=n-1;i>0;i--){
            swap(arr,0,i);
            heapify(arr,i,0);
        }
    }
 }
