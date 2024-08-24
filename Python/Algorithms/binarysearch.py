def binarysearch(arr,n,key):
    left=0
    right=n-1
    
    while left<=right:
        mid=left+(right-left)//2
        if key<int(arr[mid]):
            right = mid - 1
        elif key>int(arr[mid]):
            left = mid + 1
        else:
            return mid
    return -1
n=int(input("Enter the length of the array"))
arr = []
print("Enter the elements")
for i in range(0,n):
    x=input()
    arr.append(x)
print(arr)
key = int(input("Enter the search key"))
result = binarysearch(arr,n,key)
if result == -1:
    print("Element not present in the list")
else:
    print("Element is present in the list at the position ",result+1)

