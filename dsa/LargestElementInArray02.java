package dsa;
public class LargestElementInArray02 {
    int arr [];
    LargestElementInArray02(){
        arr = new int [] {100,20,900,1000,555,22};
    }
    /*
    In this Approach Compare all the Elements One By One with all 
    Elements if any next element comes greater than exit and 
    choose the next element and compare the same with all and 
    repeat the process
    */
    void approach1(){
        boolean isMax ;        
        for(int i = 0; i<arr.length; i++){
            isMax = true;
            for(int j= 0; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    isMax = false;
                    break; // exit from the current loop
                } // if ends
            } // inner loop ends
            if(isMax){
                System.out.println("Largest Element is "+arr[i]);
                return ; 
            }
        }
    }
    public static void main(String[] args) {
            new LargestElementInArray02().approach1();   
    }
}