#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    long double ans = (a + b + c + d) / 2.0;

    printf("%.8lf\n", sqrt((ans - a) * (ans - b) * (ans - c) * (ans - d)));
    return 0;
}
