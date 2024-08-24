def sort(lst=[]):
    n=len(lst)
    for i in range(0,n-1):
        for j in range(0,n-i-1):
            if lst[j]>lst[j+1]:
                lst[j],lst[j+1]=lst[j+1],lst[j]
    print("the sorted lsit is \n",lst)

arr=[]
n=int(input("Enter the no of elemnts in the list to be sorted: "));
print("Enter the lements of the list")
for i in range(0,n):
    x=int(input())
    arr.append(x)
sort(arr)
