#include <stdio.h>
#include <limits.h>

int main()
{
    int szam = 2147483649;
    printf("Adjon meg egy egész számot:");
    scanf("%d", &szam);
    
    if (szam <= INT_MAX || szam >= INT_MIN)
    {
        printf("A program sikeresen lefutott %d\n", szam);

    }
    else
    {
        printf("ERROR! túlcsordulás\n");
        return 1;
    }
    return 0;
}
