;Write a function which replicates each element of a sequence a variable number of times.
(defn replicate [coll n] 
  (mapcat #(repeat n %) coll))