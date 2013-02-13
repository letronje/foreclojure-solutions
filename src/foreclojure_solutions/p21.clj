;;Write a function which returns the Nth element from a sequence.

(fn [coll n]
  (if (zero? n)
    (first coll)
    (recur (rest coll) (dec n))))
