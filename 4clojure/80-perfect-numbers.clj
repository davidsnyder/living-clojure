(fn perfect? [n] (= n (reduce + (filter #(zero? (mod n %)) (range 1 n)))))
