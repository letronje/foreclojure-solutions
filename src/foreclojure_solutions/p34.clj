;Write a function which creates a list of all integers in a given range.
(fn [a b] (take (- b a) (iterate inc a)))