#include<bits/stdc++.h>
using namespace std;
const int n = 1e5+7;
int parent[n],sz[n];
void make(int v){
    parent[v]=v;
    sz[v]=1;
}

int find(int v){
    if(parent[v]==v) return v;
    return parent[v] = find(parent[v]);
}

void Union(int u,int v){
    u=find(u);
    v=find(v);
    if(u!=v){
        if(sz[u]<sz[v]){
            swap(u,v);
        }
        parent[v]=u;
        sz[u]+=sz[v];
    }
}
int main(){
    int k;
    int m;
    vector<pair<int,pair<int,int>>>g;
    cin>>k>>m;
    for(int i=0;i<m;++i){
        int u,v,w;
        cin>>u>>v>>w;
        g.push_back({w,{u,v}});
    }
    sort(g.begin(),g.end());
    for(int i=0;i<k;++i){
        make(i);
    }
    int co = 0;
    for(auto& i:g){
        int wt = i.first;
        int s = i.second.first;
        int d = i.second.second;
        if(find(s)==find(d)) continue;
        Union(s,d);
        co+=wt;
    }
    cout<<endl<<co;
    return 0;
}