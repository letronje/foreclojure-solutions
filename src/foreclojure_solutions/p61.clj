;Write a function which takes a vector of keys and a vector of values and constructs a map from them.
(defn zm [c1 c2]
  (reduce #(assoc %1 (first %2) (second %2))
          {}
          (map vector c1 c2)))