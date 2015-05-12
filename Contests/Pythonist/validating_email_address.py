#!/usr/bin/python3
import re

N = int(input())
emails = []
for i in range(N):
    emails.append(input())
print(sorted(list(filter(lambda email: re.search("^[\w-]+@[a-zA-Z\d]+\.[a-zA-Z\d]{1,3}$", email), emails))))
