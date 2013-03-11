;Write a predicate which checks whether or not a given sequence represents a binary tree. Each node in the tree must have a value, a left child, and a right child.
(fn isbin [[v l r :as tree]]
  (and
   (= 3 (count tree))
   v
   (if (coll? l) (isbin l) (nil? l))
   (if (coll? r) (isbin r) (nil? r))))
