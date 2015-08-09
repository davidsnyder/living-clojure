(fn pascals-trapezoid [r] (lazy-seq (iterate (fn [c] (flatten [(first c) (map (partial apply +') (partition 2 1 c)) (last c)])) r)))

