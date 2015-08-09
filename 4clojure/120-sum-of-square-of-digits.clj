(fn sum-squares [coll] (let [parse #(map read-string (re-seq #"\d" (str %)))
                               squares (map (fn [n] (reduce + (map #(* % %) (parse n)))) coll)]
                           (reduce + (map #(if (> %1 %2) 1 0) squares coll))
                           ))

