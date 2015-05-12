N = int(input())
width = len("{0:b}".format(N))
for i in range(1, N+1):
    for base in 'doXb':
        print('{0:{width}{base}}'.format(i, base=base, width=width), end=' ')
    print('')
