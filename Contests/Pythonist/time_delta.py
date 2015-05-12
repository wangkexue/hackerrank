#!/usr/bin/python3
import time, datetime

N = int(input())

for i in range(N):
    a = datetime.datetime.strptime(input(), "%a %d %b %Y %H:%M:%S %z")
    b = datetime.datetime.strptime(input(), "%a %d %b %Y %H:%M:%S %z")
    if a < b:
      c = b - a
    else:
      c = a - b
    print(int(c.total_seconds()))
