;Write a function which takes a collection of integers as an argument. Return the count of how many elements are smaller than the sum of their squared component digits
(fn [coll]
  (letfn [(digits [n]
            (map #(Character/digit % 10) (str n)))
          (sum-sqr [n]
            (reduce #(+ %1 (* %2 %2)) 0 (digits n)))]
    (count (filter #(< % (sum-sqr %)) coll))))