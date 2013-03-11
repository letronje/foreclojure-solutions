(fn infix [v & rem]
  (reduce (fn [v1, [f v2]]
            (f v1 v2))
          v (partition 2 rem)))