;Let us define a binary tree as "symmetric" if the left half of the tree is the mirror image of the right half of the tree. Write a predicate to determine whether or not a given binary tree is symmetric
(fn symtree? [tree]
  (letfn [(mirror-tree [[v l r :as tree]]
            (if (and (nil? l) (nil? r))
              tree
              [v (mirror-tree r) (mirror-tree l)]))]
    (= tree (mirror-tree tree))))