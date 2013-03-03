;Write a higher-order function which flips the order of the arguments of an input function.
(defn flipargs [f]
  (fn [& args]
    (apply f (reverse args))))