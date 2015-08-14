(defn balanced? [num] (let [v (map #(- (int %) 48) (seq (str num))) size (/ (count v) 2)]
                        (= (reduce + (take (Math/floor size) v)) (reduce + (drop (Math/ceil size) v)))))
