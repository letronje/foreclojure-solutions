;Write a function which removes consecutive duplicates from a sequence.
(fn [coll]
  (reduce (fn [ccoll, x]
            (if (= x (peek ccoll))
              ccoll
              (conj ccoll x)))
          [] coll))