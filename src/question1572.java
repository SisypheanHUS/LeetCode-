public class question1572 {
    public int diagonalSum(int[][] mat) {
        int mainDiag = 0;
        int anotherDiag = 0;
        for(int i = 0; i < mat.length; i++){
            mainDiag += mat[i][i];
        }
        for(int i = 0; i < mat.length; i++){
            anotherDiag += mat[i][mat.length - 1 - i];
        }
        if(mat.length % 2 == 0){
            return mainDiag + anotherDiag;
        }
        return mainDiag + anotherDiag - mat[mat.length / 2][mat.length / 2];
    }
}
