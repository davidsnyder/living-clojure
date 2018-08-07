;(= (__ 1 4) '(1 2 3))

(fn [a b] ((fn [l h c] (if (= l h) c
                (recur (inc l) 
                	h 
                	(conj c l)
                ))) a b []))