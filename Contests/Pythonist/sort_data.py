#!/usr/bin/python3

M, N = list(map(int, input().split()))
table = []
for i in range(M):
    table.append(list(map(int, input().split())))
K = int(input())
table.sort(key=lambda x: x[K])
for i in range(M):
    print(' '.join(str(x) for x in table[i]))
