

// User function Template for Java

class Solution {
    public long minIncrements(int[] arr, int N) {
        // Code here
        Arrays.sort(arr);
        int count = 0;
        for(int i=1; i<N; i++ ){
            if(arr[i] <= arr[i-1]){
                int temp = arr[i-1]-arr[i]+1;
                arr[i] = arr[i] + temp;
                count += temp;
            }
        }
        return (long)count;
    }
}

