;Write a function which removes the duplicates from a sequence. Order of the items must be maintained.
(fn [coll]
  (reduce (fn [ucoll, item]
            (if (some #{item} ucoll)
              ucoll
              (conj ucoll item)))
          [] coll))