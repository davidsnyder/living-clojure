(fn part [size coll] (loop [n [] c coll] (if (>= (count c) size) (recur (conj n (take size c)) (drop size c)) n)))
