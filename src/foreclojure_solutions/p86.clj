;;Happy numbers are positive integers that follow a particular formula: take each individual digit, square it, and then sum the squares to get a new number. Repeat with the new number and eventually, you might get to a number whose squared sum is 1. This is a happy number. An unhappy number (or sad number) is one that loops endlessly. Write a function that determines if a number is happy or not.
(fn [n]
  (letfn [(sum-dig-sqrs [y]
            (reduce + (map #(* % %)  (map #(Character/digit % 10) (str y)))))]
    (= 1 (some #{1 4} (next (iterate sum-dig-sqrs n))))))

