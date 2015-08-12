(defn happy? [n] (letfn [(square [n] (* n n))
                         (split-num [n] (map #(- (int %) 48) (str n)))
                         (happify [n] (reduce + (map square (split-num n))))] 
                   (loop [seen #{}, num n] (cond (= num 1) true
                                                 (contains? seen num) false
                                                 :else (recur (conj seen num) (happify num))))))

