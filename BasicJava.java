import java.util.ArrayList;

public class BasicJava{
    public void print1to255() {
        for(int i=1; i<256; i++){
            System.out.println(i);  
        }
    }
    public void printodd1to255() {
        for(int i=1; i<256; i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }
    public void printsum(){
        int sum = 0;
        for(int i=0; i<256; i++){
            sum += i;
            System.out.println(i);
            System.out.println(sum);
        }
    }
    public void interating(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void findmax(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public void getavg(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int avg = sum/arr.length;
        System.out.println(avg);
    }
    public void arraywithodd(){
        ArrayList<Object> list =new ArrayList<Object>();
        for(int i =1; i< 256; i++){
            if(i % 2 == 1){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    public void greaterthany(int[]arr, int y){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > y){
                count ++;
            }
        } 
        System.out.println(count);
    }
    public void squarevalue(int[] arr){
        ArrayList<Object> mylist = new ArrayList<Object>();
        for(int i=0; i<arr.length; i++){
            arr[i]= arr[i]*arr[i];
            mylist.add(arr[i]);
        }
        System.out.println(mylist);
    }
    public void eliminate(int[] arr){
        ArrayList<Object> positivelist = new ArrayList<Object>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<0){
                arr[i]=0;
            }
            positivelist.add(arr[i]);
        }
        System.out.println(positivelist);
    }
    public void maxminavg(int[] arr){
        ArrayList<Object> newlist = new ArrayList<Object>();
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = sum/arr.length;
        newlist.add(max);
        newlist.add(min);
        newlist.add(avg);
        System.out.println(newlist);
    }
    public void shiftingarr(int[] arr){
        ArrayList<Object> shiftlist = new ArrayList<Object>();
        for(int i =0; i<arr.length; i++){
            try{
            arr[i] = arr[i+1];
            shiftlist.add(arr[i]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                arr[i] = 0;
            }
        }
        System.out.println(shiftlist);
    }
}
