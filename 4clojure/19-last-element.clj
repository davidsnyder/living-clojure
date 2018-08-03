#(if (empty? (rest %)) (first %) (recur (rest %)))
