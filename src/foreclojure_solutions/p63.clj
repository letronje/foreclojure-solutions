;Given a function f and a sequence s, write a function which returns a map. The keys should be the values of f appliedto each item in s. The value at each key should be a vector of corresponding items in the order they appear in s.

(fn gby [f s]
  (reduce (fn [m, i]
            (update-in m
                       [(f i)]
                       (fnil #(conj % i) [])))
          {}
          s))