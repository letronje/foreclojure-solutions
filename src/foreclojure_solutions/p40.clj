;Write a function which separates the items of a sequence by an arbitrary value.
#(butlast (interleave %2 (repeat %1)) )