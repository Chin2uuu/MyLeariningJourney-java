n=int(input())
i=1
while i<=n:
    j=n
    while j>=1:
        if(i%2==0):
            print("0",end='')
        else:
            print("1",end='')
        j=j-1
    print()
    i=i+1

N=int(input())
i=1
while i<=N:
    j=N
    while j>=i:
        if(i%2==0):
            print("0",end='')
        else:
            print("1",end='')
        j=j-1
    print()
    i=i+1
