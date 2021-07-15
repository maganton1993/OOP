public class Array {
    public static void main(String[] args) {
        int [] Arr1 = new int[5];
        for(int i=0; i < Arr1.length;i++){
            Arr1[i] = i;
            System.out.println("this is i"+" "+i);
            System.out.println("this is arr[i]"+" "+Arr1[i]);
        }
    }
}
