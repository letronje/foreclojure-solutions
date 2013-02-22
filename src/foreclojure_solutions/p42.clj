;Write a function which calculates factorials.
(fn [n]
  (reduce * (range 2 (inc n))))