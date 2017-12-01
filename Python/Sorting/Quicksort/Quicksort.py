def quickSort(unsorted):
	sort(unsorted,0,len(unsorted)-1)
	
def sort(arr, left, right):
  if left < right:
    partitionValue = partition(arr, left, right)
    sort(arr, left, partitionValue-1)
    sort(arr, partitionValue+1, right)

def partition(arr,left,right):
  leftPointer = left - 1
  pivot = arr[right]
  for i in range(left, right):
    if arr[i] <= pivot:
      leftPointer +=1
      arr[leftPointer], arr[i] = arr[i], arr[leftPointer]
  arr[leftPointer+1], arr[right] = arr[right],arr[leftPointer+1]
  return leftPointer+1
      

	
arr = [5, 7, 4, 2, 9, 66, 22, 6, 11, 33]
print("Original Array")
print(arr)
quickSort(arr)
print("Sorted Array")
print(arr)