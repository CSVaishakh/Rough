n=int(input("Enter the no of terms"))
t1=0
t2=1
nxt=t1+t2
print(t1,t2,end=" ")
for i in range(0,n-1):
    print(nxt,end=" ")
    t1=t2
    t2=nxt
    nxt=t1+t2