;Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
#(mapcat vector %1 %2)
