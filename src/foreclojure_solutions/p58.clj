;Write a function which allows you to create function compositions. The parameter list should take a variable number of functions, and create a function applies them from right-to-left.
(fn [& fs]
  (let [[f & fs] (reverse fs)]
    (fn [& args]
      (reduce #(%2 %1)
              (apply f args) fs))))