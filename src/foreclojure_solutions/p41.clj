;Write a function which drops every Nth item from a sequence.
(fn [coll n]
  (->> coll
       (map-indexed #(vector
                      (zero? (mod (inc %1) n))
                      %2))
       (remove #(first %))
       (map second)))