(fn [m]
 (letfn [(flatten-map->seq
           ([prefix m]
              (mapcat (fn [[k, v]]
                        (let [next-prefix (if prefix
                                            (conj prefix k)
                                            k)]
                          (if (map? v)
                            (flatten-map->seq next-prefix v)
                            [next-prefix v])
                          )
                        ) m))
           ([m]
              (flatten-map->seq [] m)))]
   (apply hash-map (flatten-map->seq m))))
