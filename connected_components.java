//Function should return the number of islands.
class GFG
{
    static Boolean check(int a[][],boolean visited[][],int i,int j,int n,int m)
    {
        return i>=0 && i<n && j>=0 && j<m && visited[i][j]==false && a[i][j]==1; 
    }
    static void dfs(int a[][],boolean visited[][],int i,int j,int n,int m)
    {
        visited[i][j]=true;
        int arr1[]={-1,-1,-1,0,0,1,1,1};
        int arr2[]={1,0,-1,1,-1,-1,0,1};
        for(int k=0;k<8;k++)
        {
            if(check(a,visited,i+arr1[k],j+arr2[k],n,m))
            dfs(a,visited,i+arr1[k],j+arr2[k],n,m);
        }
    }
    public static int findisland(int[][]a,int n,int m)
    {   
        boolean visited[][]=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1 && visited[i][j]==false)
                {
                    count++;
                    dfs(a,visited,i,j,n,m);
                }
            }
        }
        return count;
    }
}
