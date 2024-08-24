def search(x,lst1):
    n=len(lst1)
    flag=0
    for i in range(0,n):
        if x==lst1[i]:
            flag=1
    if flag==1:
        print("The element",x,"is present in the list")
    if flag==0:
        print("The element",x,"is not present in the list")

l=int(input("Enter the no of elements in the array"))
arr=[]
print("Enter the elements")
for i in range(0,l):
    y=int(input())
    arr.append(y)
n=int(input("enter the element to be searched for"))
search(n,arr)