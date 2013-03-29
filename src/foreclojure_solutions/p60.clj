;Write a function which behaves like reduce, but returns each intermediate value of the reduction. Your function must accept either two or three arguments, and the return sequence must be lazy.
(fn seq-reds
  ([f i s]
     (if-let [s (seq s)]
       (cons i (lazy-seq (seq-reds f (f i (first s)) (next s))))
       (list i)))
  ([f s]
     (seq-reds f (first s) (rest s))))