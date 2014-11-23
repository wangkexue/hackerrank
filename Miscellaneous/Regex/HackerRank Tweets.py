import re

n = int(input())
count = 0
for i in range(n):
    if re.search('hackerrank', input(), re.IGNORECASE):
        count += 1
print(count)
