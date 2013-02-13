;;Write a function which reverses a sequence.
(fn [x] (reduce #(cons %2 %1) '() x))