;Convert a binary number, provided in the form of a string, to its numerical value.
(fn [s]
  (reduce (fn [n, d]
            (+ (* 2 n) d)) 
          (map #(- (int %) 48) s)))