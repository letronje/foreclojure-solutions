;Write a function which duplicates each element of a sequence.
(fn [s] (mapcat vector s s))