class Solution {

    public boolean checkRow(char[] board)
    {
        boolean[] check=new boolean[10];
        for(int i=0;i<9;i++)
        {
            if(board[i]=='.')
            {
                continue;
            }
            int c=board[i]- '0';
            if(check[c])
            {
                return false;
            }
            check[c]=true;

        }
        return true;
    }
    public boolean checkCol(char[][] board,int j)
    {
        boolean[] check=new boolean[10];
        for(int i=0;i<9;i++)
        {

            if(board[i][j]=='.')
            {
                continue;
            }
            int c=board[i][j]- '0';
            if(check[c])
            {
                return false;
            }
            check[c]=true;

        }
        return true;
    }
    public boolean checkBox(char[][] board, int boxNum)
    {
        int i=3*(boxNum/3);
        int j=3*(boxNum%3);
        boolean[] check=new boolean[10];
        for(int a=i;a<(i+3);a++)
        {
            for(int b=j;b<(j+3);b++)
            {
                if( board[a][b]=='.')
                {
                    continue;
                }
                int c=board[a][b]-'0';
                if(check[c])
                {
                    return false;
                }
                check[c]=true;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        // check row

        for(int i=0;i<9;i++)
        {
            if(!checkRow(board[i]))
            {
                return false;
            }
        }

        // check col

        for(int j=0;j<9;j++)
        {
            if(!checkCol(board,j))
            {
                return false;
            }
        }

        // ccheck boxes

        for(int k=0;k<9;k++)
        {
            if(!checkBox(board,k))
            {
                return false;
            }
        }
        return true;
    }
}
