;;Write a function which returns the second to last element from a sequence.
(fn [x]
  (let [n (count x)]
    (if (= 2 n)
      (first x)
      (recur (next x)))))