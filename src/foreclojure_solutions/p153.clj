;;Given a set of sets, create a function which returns true if no two
;;of those sets have any elements in common and false otherwise. Some
;;of the test cases are a bit tricky, so pay a little more attention
;;to them. Such sets are usually called pairwise disjoint or mutually
;;disjoint.

#(every? empty? (for [s1 % s2 % :when (not= s1 s2)]
                  (clojure.set/intersection s1 s2)))
