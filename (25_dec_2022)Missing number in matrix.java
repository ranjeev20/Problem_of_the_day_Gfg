//User function Template for Java

class Solution
{
    public long  MissingNo(int[][] matrix)
    {
        // code here 
        int rl = matrix.length;
        int cl = matrix[0].length;
        TreeSet<Long> nonzero = new TreeSet<>();
        TreeSet<Long> zero = new TreeSet<>();
       
        // for rows
        for(int i=0; i<rl; i++){
            long sum = 0;
             boolean isZero = false;
            for(int j=0; j<cl; j++){
                sum += matrix[i][j];
                if(matrix[i][j] ==0){
                    isZero = true;
                }
                
            }
            if(isZero) {
                zero.add(sum);
            }
            if(!isZero)nonzero.add(sum);
            }
            
            
            
        // for column
        for(int i=0; i<cl; i++){
            long sum = 0;
             boolean isZero = false;
            for(int j=0; j<rl; j++){
                sum += matrix[j][i];
                if(matrix[j][i] ==0){
                    isZero = true;
                }
                
            }
            if(isZero) {
                zero.add(sum);
            }
            if(!isZero)nonzero.add(sum);
            }
            
           
        
        
         // for diagonal
         
            boolean isZero = false;
        long sum = 0;
          
        for(int i=0; i<rl; i++){
            sum += matrix[i][i];
            if(matrix[i][i] == 0)
            isZero = true;
        }
              if(isZero) {
                zero.add(sum);
            }
            if(!isZero)nonzero.add(sum);
            
         // for diagonals
         
        isZero = false;
         sum = 0;
          
        // for(int i=0, j = cl-1; j>=0; i++, j--){
        for(int i=0, j = cl-1; j>=0; i++, j--){
            sum += matrix[i][j];
            if(matrix[i][j] == 0)
            isZero = true;
        }
           
           
           
            if(isZero) {
                zero.add(sum);
            }
            if(!isZero)nonzero.add(sum);
            
            
            if(nonzero.size() == 1 && zero.size() == 1){
                long x = nonzero.first();
                long y = zero.first();
                
                if(x<=y){
                    return -1;
                }
                
                return x-y;
                
                
            }
            return -1;
            }
            
}
    