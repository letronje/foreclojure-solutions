;Given a function f and an input sequence s, return a lazy sequence of (f x) for each element x in s.
(fn [f, [fst & rem]]
  (lazy-seq
   (cons (f fst)
         (if rem (mmap f rem)))))