(fn [& ratios]
  (let [
        lcm-nums (fn [& nums]
                   (let [start (int (apply max nums))
                         end (+ (apply * nums) start)]
                     (first
                      (filter (fn [multiple]
                                (every? #(zero? (mod multiple %)) nums))
                              (range start end)))))
        denom #(if (ratio? %) (denominator %) 1)
        numer #(if (ratio? %) (numerator %) %)
        denominators (map denom ratios)
        numerators (map numer ratios)
        lcm-denom (apply lcm-nums denominators)]
    (/ (apply lcm-nums (map #(* %1 (/ lcm-denom %2)) numerators denominators))
       lcm-denom)))
