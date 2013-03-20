;Write a function which returns the first x number of prime numbers.
(fn [x]
  (letfn [(is-prime [n]
            (and (> n 1)
                 (empty? (filter #(zero? (mod n %))
                                 (range 2 n))))
            )]
    (take x (filter is-prime (range)))))

