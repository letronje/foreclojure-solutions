;;Write a function which takes a collection and returns one of :map, :set, :list, or :vector - describing the type of collection it was given.
;;You won't be allowed to inspect their class or use the built-in predicates like list? - the point is to poke at them and understand their behavior.
(fn [coll]
  (let [k (gensym)
        v (gensym)
        x [k, v]
        ncoll (conj coll x)]
    (cond
     (= (get ncoll x) x) :set
     (= (get ncoll k) v) :map
     (= (first (apply conj coll x)) v) :list
     :else :vector)))