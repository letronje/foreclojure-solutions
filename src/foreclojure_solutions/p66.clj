;Given two integers, write a function which returns the greatest common divisor.
(fn gcd [a b]
  (letfn [(factors [x]
            (filter #(zero? (rem x %)) (range 1 (inc x))))]
    (apply max
           (clojure.set/intersection
            (set (factors a))
            (set (factors b))))))