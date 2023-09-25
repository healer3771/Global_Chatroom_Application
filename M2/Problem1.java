//Name: Qadeer Ahmad
//UCID: qa9 
//Date: 25/09/2023
//I am atteming to find the odd number from the given arrays and spearate them and add them in a newly created array and finaly print the elements of that array.


import java.util.Arrays;
public class Problem1 {
    public static void main(String[] args) {
        //Don't edit anything here
        int[] a1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] a2 = new int[]{0, 1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] a3 = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] a4 = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10};
        
        processArray(a1);
        processArray(a2);
        processArray(a3);
        processArray(a4);
    }
    static void processArray(int[] arr){
        System.out.println("Processing Array:" + Arrays.toString(arr));
        System.out.println("Odds output:");
        //hint: use the arr variable; don't diretly use the a1-a4 variables
        //TODO add/edit code here
        int count = arr.length; 

        //create a new variable that is going to count population of odd numbers in a array
        int oddnumber = 0;
        //create a new array that is going to store the founded off number using the for loop
        int[] oddno = new int[arr.length];
        for (int i = 0; i < count; i++){
            //use if statement to find the odd number by diving array value by number and checking their remainder
            if(arr[i]%2 != 0){
                oddno[oddnumber] = arr[i];
                oddnumber++;
            }
        }
        //now create a new int array with the length of the how many odd number are in the array
        int[] finaloddnumbers = new int[oddnumber];
        //use the for loop to add the founded odd number from one array to other
        for(int i = 0; i < oddnumber; i++){
            finaloddnumbers[i] = oddno[i];
        }
        //end add/edit section
        //print the elements that finaloddnumbers array contain.
        System.out.println(Arrays.toString(finaloddnumbers));
        System.out.println("End process");
    }
    
}