;Write a function that, for any given input vector of numbers, returns an infinite lazy sequence of vectors, where each next one is constructed from the previous following the rules used in Pascal's Triangle. For example, for [3 1 2], the next row is [3 4 3 2].
(fn [row]
  (iterate #(map +' `[0 ~@%] `[~@% 0]) row))