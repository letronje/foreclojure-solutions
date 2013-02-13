;;Write a function which returns the total number of elements in a sequence.
(fn [coll]
  (reduce (fn [cnt _] (inc cnt)) 0 coll))