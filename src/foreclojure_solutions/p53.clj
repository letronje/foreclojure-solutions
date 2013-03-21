;Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify
(fn [coll]
  (sequence
   (first
    (filter #(apply < %)
            (mapcat #(partition % 1 coll)
                    (reverse (range 2 (count coll))))))))


