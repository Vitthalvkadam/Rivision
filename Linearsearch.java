public class Linearsearch{
    public static void main(String[] args) {
        int[] arr = {2,1,4,2,1,5,1};
        lsearch(arr, 5);
    }
    public static void lsearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.print("we got the element :" + target + "at index:" +i);
            }
        }
    }
}