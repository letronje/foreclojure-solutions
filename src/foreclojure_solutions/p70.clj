;Write a function that splits a sentence up into a sorted list of words. Capitalization should not affect sort order and punctuation should be ignored.
(fn [s]
  (sort-by clojure.string/lower-case
           (re-seq #"\w+" s)))