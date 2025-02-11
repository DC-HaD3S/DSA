public class Duplicate{
    public static void main(String[] args){
        int a[] = {1,2,3,3,9,0,2,1,5};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length-i-1;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
                
            }
        
        } 
       }

}