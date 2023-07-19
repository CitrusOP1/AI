void help(int s,int h,int d,int n,vector<vector<int>>&toh){
    if(n==1){
        toh.push_back(vector<int>{s,d});
        return;
    }
    help(s,d,h,n-1,toh);
    toh.push_back(vector<int>{s,d});
    help(h,s,d,n-1,toh);
    return;
}
vector<vector<int>> towerOfHanoi(int n)
{
    vector<vector<int>>toh;
     help(1,2,3,n,toh);
     return toh;

}
