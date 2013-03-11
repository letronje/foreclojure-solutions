;Write a function that accepts a variable length mathematical expression consisting of numbers and the operations +, -, *, and /. Assume a simple calculator that does not do precedence and instead just calculates left to right.
(fn infix [v & rem]
  (reduce (fn [v1, [f v2]]
            (f v1 v2))
          v (partition 2 rem)))