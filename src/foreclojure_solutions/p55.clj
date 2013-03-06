;Write a function which returns a map containing the number of occurences of each distinct item in a sequence.
(defn freqs [coll]
  (reduce (fn [counts, item]
            (update-in counts [item] (fnil inc 0)))
          {} coll))

(defn freqs2 [coll]
  (map #(vector
         (first %)
         (count (second %)))
       (group-by identity coll)))