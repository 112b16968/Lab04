public class Lab04JPA03 {
    public static void main(String[] args) {
        int A[][] = new int[][]{{1,2,3},{4,5,6}};
        int B[][] = new int[][]{{7,8,9},{10,11,12}};
        int C[][] = new int[A.length][A[0].length];
        for (int i= 0; i <A.length;i++){
            for(int j =0 ; j < A[i].length ; j++){
                C[i][j] = A[i][j] + B[i][j]; 
            }
        }
        System.out.println("陣列A的內容為(3x3):");
        for(int i = 0; i < A.length ; i++){
            for(int j = 0; j < A[0].length; j++){
            
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("陣列B的內容為(3x3):");
        for(int i = 0; i < B.length ; i++){
            for(int j = 0; j < B[0].length; j++){
            
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("陣列A+B=C，陣列C的內容為(3x3):");
        for(int i = 0; i < C.length ; i++){
            for(int j = 0; j < C[0].length; j++){
            
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
