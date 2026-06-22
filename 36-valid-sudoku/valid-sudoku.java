class Solution {
    public boolean isValidSudoku(char[][] board) {
        //for the rows
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length-1; j++){
                for(int k=j+1; k<board[i].length; k++){
                    if(board[i][j] == board[i][k] && board[i][j]!= '.'){
                        return false;
                    }
                }
            }
        }

        //for the columns
        for(int j=0; j<board.length; j++){
            for(int i=0; i<board.length-1; i++){
                for(int k=i+1; k<board.length; k++){
                    if(board[i][j] == board[k][j]&& board[i][j]!= '.'){
                        return false;
                    }
                }
             }
        }

        //for boxes
        
        
        for(int i=0; i<=6; i+=3){
            for(int j= 0; j<=6; j+=3){
                int[] box = new int[9];
                int counter = 0;
                //for the inner boxes
                for(int l=i; l<=i+2;l++){
                    for(int r=j; r<=j+2; r++){
                        box[counter]=board[l][r];
                        counter++;
                    }
                }
            for(int p=0; p<8; p++){
            for(int o=p+1; o<9; o++){
                if(box[p] == box[o] && box[p]!='.'){
                    return false;
                }
            }
        }
            }
        }



        return true;


        



        
    }
}