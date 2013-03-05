;Write a function which reverses the interleave process into x number of subsequences.
(fn revil [coll n]
  (let [cc (count coll)
        ps (/ cc n)]
    (partition ps (apply interleave (partition n coll)))))

#(apply map vector (partition %2 %))