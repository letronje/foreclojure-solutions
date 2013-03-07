;Write a function which returns the nth row of Pascal's Triangle. 
(fn prow [n]
  (letfn [(pval [r, c]
            (if (or (<= r 1) (= r c) (zero? c))
              1
              (+
               (pval (dec r) (dec c))
               (pval (dec r) c))))]
    (map #(pval (dec n) %) (range n))))

(fn prow [n]
  (if (= 1 n)
    [1]
    `[1 ~@(map #(apply + %) (partition 2 1 (prow (dec n)))) 1]))