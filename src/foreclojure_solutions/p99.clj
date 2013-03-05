;Write a function which multiplies two numbers and returns the result as a sequence of its digits.
(fn [a b]
  (map #(- (int %) 48) (str (* a b))))