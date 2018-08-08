;#(into (vector (take % %2)) (vector (drop % %2)))

(fn [n c] [(take n c) (drop n c)])