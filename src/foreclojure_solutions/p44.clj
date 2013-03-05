;Write a function which can rotate a sequence in either direction.
(fn [shift, coll]
  (let [n (mod shift c)]
    (concat (drop n coll) (take n coll))))