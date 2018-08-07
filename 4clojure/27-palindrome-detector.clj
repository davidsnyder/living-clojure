;(fn palindrome? [xs] (if (>= 1 (count xs)) true (and (= (first xs) (last xs)) (palindrome? (drop-last (rest xs))))))

(= (clojure.string/join %) (clojure.string/join (reduce conj '() %)))