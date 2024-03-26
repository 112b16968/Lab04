public class Lab04JPA05 {
    public static void main(String[] args) {
        String  [] A = new String[]{"A","B","C","D","E","F","G","H","I","J"};
        System.out.print("反轉陣列資料之前: ");
        for(int i = 0 ; i < A.length; i++){
            System.out.print(A[i]+" ");
        } 
        System.out.println();
        System.out.print("反轉陣列資料之後: ");
        for (int i = A.length-1 ; i >= 0; i--){
            System.out.print(A[i]+" ");
        }
    }
    
}
