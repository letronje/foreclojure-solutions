;Given a string of comma separated integers, write a function which returns a new comma separated string that only contains the numbers which are perfect squares.
(fn [s]
  (let [nums (map #(Integer/parseInt %)
                  (clojure.string/split s #","))
        perf-sqr? (fn [n]
                    (let [sqrt (long (Math/sqrt n))]
                      (= (* sqrt sqrt) n)))]
    (clojure.string/join "," (filter perf-sqr? nums))))

