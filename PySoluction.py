import math
import sys
import sys
if len(sys.argv) >= 2 and sys.argv[1] == '#Local ':
    sys.stdin = open('input.txt', 'r')
    sys.stdout = open('output.txt', 'w')

N = int(input())
K = int(input())
arr = []
for i in range(N):
    arr.append(int(input()))
mod = pow(10, 9)+7


def eprint(*a):

    # Here a is the array holding the objects
    # passed as the argument of the function
    print(*a, file=sys.stderr)


def fun(i, k) -> int:
    if i >= N:
        return 1

    if k <= 0:
        mul = 1
        for j in range(i, N):
            mul = mul*arr[j]
        return mul

    maxNO = 0
    for j in range(0, k+1):
        maxNO = max(maxNO, (arr[i]+j) * fun(i+1, k-j))

    return maxNO


print(fun(0, K) % mod)
