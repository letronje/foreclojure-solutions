;A number is "perfect" if the sum of its divisors equal the number itself. 6 is a perfect number because 1+2+3=6. Write a function which returns true for perfect numbers and false otherwise.
(fn perfect [n]
  (let [divisors (filter #(zero? (mod n %))
                         (range 1 (inc (/ n 2))))]
    (= (reduce + divisors) n)))
