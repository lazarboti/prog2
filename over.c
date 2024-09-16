#include <stdio.h>

void rekurziv_fuggveny(int szamlalo)
{
    printf("Rekurziós lépés: %d\n", szamlalo);
    rekurziv_fuggveny(szamlalo + 1);
}

int main()
{
    rekurziv_fuggveny(1);
    return 0;
}
