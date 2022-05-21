​Kadane's Algorithm

//Keeps track of largest experienced contiguous windows bound (while forgetting if a new one overtakes it) when adding a new element to the mix
localSum = Max(currentElement,currentElement+localSum)

//keeps track of largest contiguous sum ever seen

globalSum = Max(localSum, globalSum)
