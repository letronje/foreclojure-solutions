;Write a function which takes a function f and a variable number of maps. Your function should return a map that consists of the rest of the maps conj-ed onto the first. If a key occurs in more than one map, the mapping(s) from the latter (left-to-right) should be combined with the mapping in the result by calling (f val-in-result val-in-latter)
(fn merge-with-fn-all [f m & maps]
  (let [merge-with-fn (fn [f ma mb]
                        (into ma (for [[k v] mb :let [v1 (ma k)]]
                                      [k (if v1 (f v1 v) v)])))]
    (reduce (fn [m1 m2]
              (merge-with-fn f m1 m2)) m maps)))