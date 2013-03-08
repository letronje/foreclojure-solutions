;Write a function which returns a sequence of lists of x items each. Lists of less than x items should not be returned.
(fn [x coll]
  (let [numparts (quot (count coll) x)]
    (take numparts (map #(take x (drop % coll))
                        (iterate (partial + x) 0)))))