def collatz(n):
    len=0
    if n==1:
        print("The length of the sequence is",1)
    while n>1:
        while n%2==1:
            n=int(n*3+1)
            len+=1
            print(n,end=" ")
            if n==1:
                break
        while n%2==0:
            n=int(n/2)
            len+=1
            print(n,end=" ")
            if n==1:
                break
    return len
n=int(input("Enter the value of n"))
ans=collatz(n)
print("\n",ans)
