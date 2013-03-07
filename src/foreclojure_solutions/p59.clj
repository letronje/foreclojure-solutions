;Take a set of functions and return a new function that takes a variable number of arguments and returns a sequence containing the result of applying each function left-to-right to the argument list.
(fn myjuxt [& fs]
  (fn [& args]
    (map #(apply % args) fs)))