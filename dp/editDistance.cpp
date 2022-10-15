class Solution {
public:
    int fun(int i,int j,string &s1,string &s2,vector<vector<int>>&dp){
    if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
    if(s1[i]==s2[j]){
        
        return fun(i-1,j-1,s1,s2,dp);
    }
    int a=fun(i,j-1,s1,s2,dp)+1;
   int b=fun(i-1,j,s1,s2,dp)+1;
        int c=fun(i-1,j-1,s1,s2,dp)+1;
        return dp[i][j]=min(a,min(b,c));
    }
    int minDistance(string word1, string word2) {
        int x=word1.length();
        int y=word2.length();
        vector<vector<int>>dp(x+1,vector<int>(y+1,-1));
        return fun(x-1,y-1,word1,word2,dp);
        
    }
};
