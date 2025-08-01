class Solution {
public:
    int dp[1001][1001];
    int lcs(string &text1, string &text2, int i, int j)
    {
        if(i==text1.size()|| j==text2.size())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(text1[i]==text2[j])return lcs(text1,text2,i+1,j+1)+1;
        return dp[i][j]=max(lcs(text1,text2,i,j+1),lcs(text1,text2,i+1,j));
    }
    int longestCommonSubsequence(string text1, string text2) {
        memset(dp,-1,sizeof(dp));
        return lcs(text1,text2,0,0);
    }
};