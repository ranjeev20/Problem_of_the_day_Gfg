class Solution {
    long wineSelling(int  Arr[],int N){
        // code here
       
            
     
     long work = 0;
      int s =0;
      int b = 0;
      
      while(s<N && b<N){
          while(Arr[s] >=0){
              s++;
              if(s==N){
                  return work;
              }
          }
          
          while(Arr[b] <= 0){
              b++;
              if(b==N){
                  return work;
              }
          }
          
          if(Math.abs(Arr[s]) < Math.abs(Arr[b])){
              work += Math.abs(Arr[s]) * Math.abs(b-s);
              Arr[b] = Arr[b] + Arr[s];
              Arr[s] =0;
          }
          else{
             work += Math.abs(Arr[b]) * Math.abs(b-s);
              Arr[s] = Arr[b] + Arr[s];
              Arr[b] =0;
          }
          
      }
      return work;
    }
}