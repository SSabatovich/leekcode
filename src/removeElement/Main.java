package removeElement;

public class Main {

    public static void main(String[] args) {
        int[] arr1 ={3, 2, 2, 3};
        int val1=3;
        Solution s1 = new Solution(arr1,val1);
        System.out.println(s1.removeElement(arr1,val1));
        //Solution2 ss1 = new Solution2(arr1,val1);
        //System.out.println(ss1.removeElement(arr1,val1));
    }
}
