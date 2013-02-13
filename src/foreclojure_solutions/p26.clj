;;Write a function which returns the first X fibonacci numbers.
(fn [n]
  (letfn [(f [a b n]
            (if (> n 0)
              (cons a (f b (+ a b) (dec n)))))]
    (f 1 1 n)))