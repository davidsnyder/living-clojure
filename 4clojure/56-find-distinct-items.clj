#(reduce (fn [n e] (if (some (partial = e) n) n (conj n e))) [] %)
