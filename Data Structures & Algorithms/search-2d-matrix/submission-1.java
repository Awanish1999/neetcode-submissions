class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for (int i=0;i<matrix.length;i++){
        //     for (int j=0;j<matrix[i].length;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        int left=0;
        int right=matrix.length*matrix[0].length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int row=mid/matrix[0].length;
            int column=mid%matrix[0].length;
            if(matrix[row][column]==target){
                return true;
            }
            else if (target<matrix[row][column]){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return false;
    }
}
