#include <iostream>
#include <map>
#include <string.h>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    map<char, int> mapper;
    string str;
    while(cin >> str)
        mapper[str[0]]++;

    int best = 0;
    for(map<char, int>::iterator it = mapper.begin(); it != mapper.end(); it++)
        best = max(best, it->second);

    cout << best << endl;
    return 0;
}
