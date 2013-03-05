;Write a function which calculates the Cartesian product of two sets.
(fn [a b] 
  (set 
   (for [ia a, ib b] 
     [ia, ib])))