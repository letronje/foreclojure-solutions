                                        ;Write a function which flattens a sequence.
(fn f [coll]
  (reduce (fn [acc, e]
            (if (coll? e)
              (into acc (f e))
              (conj acc e))) [] coll))

(comment
  (fn f [coll]
    (mapcat (fn [x]
              (if (coll? x)
                (f x)
                [x])
              ) coll)))