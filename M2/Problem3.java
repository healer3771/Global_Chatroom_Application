//Name: Qadeer Ahmad
//UCID: qa9 
//Date: 25/09/2023
//I am atteming to get the output the print all then negative value to positve with their datatypes
import java.util.Arrays;
public class Problem3 {
    public static void main(String[] args) {
        //Don't edit anything here
        Integer[] a1 = new Integer[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        Integer[] a2 = new Integer[]{-1, 1, -2, 2, 3, -3, -4, 5};
        Double[] a3 = new Double[]{-0.01, -0.0001, -.15};
        String[] a4 = new String[]{"-1", "2", "-3", "4", "-5", "5", "-6", "6", "-7", "7"};
        
        bePositive(a1);
        bePositive(a2);
        bePositive(a3);
        bePositive(a4);
    }
    // <T> turns this into a generic so it can take in any datatype, it'll be passed as an Object so casting is required
    static <T> void bePositive(T[] arr){
        System.out.println("Processing Array:" + Arrays.toString(arr));
        //your code should set the indexes of this array
        Object[] output = new Object[arr.length];
        //create a new int variable that is going to store the converted string value.
        int value;
        //hint: use the arr variable; don't diretly use the a1-a4 variables
        for(int i= 0; i < arr.length; i++){
        //TODO convert each value to positive
        //set the result to the proper index of the output array
            if(arr[i].getClass() == Integer.class){
                output[i] = Math.abs((int) arr[i]);
            }
            else if(arr[i].getClass() == Double.class){
                output[i] = Math.abs((Double) arr[i]);
            }
            else if(arr[i].getClass() == String.class){
                value = Integer.parseInt((String) arr[i]);
                //hint: don't forget to handle the data types properly, the result datatype should be the same as the original datatype
                output[i] = Integer.toString(Math.abs(value));
            } }
        //end edit section
        StringBuilder sb = new StringBuilder();
        for(Object i : output){
            if(sb.length() > 0){
                sb.append(",");
            }
            sb.append(String.format("%s (%s)", i, i.getClass().getSimpleName().substring(0,1)));
        }
        System.out.println("Result: " + sb.toString());
    }
}