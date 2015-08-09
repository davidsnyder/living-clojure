(= (reduce + (map count %)) (count (reduce clojure.set/union %)))
   
