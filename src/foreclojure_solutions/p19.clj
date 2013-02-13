;;Write a function which returns the last element in a sequence.
(fn [x] 
  (let [rem (next x)]
    (if rem
      (recur rem)
      (first x)) 
    ))
