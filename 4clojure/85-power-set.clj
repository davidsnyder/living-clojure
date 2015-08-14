(fn powerset [s] (reduce (fn [ps e] (reduce #(conj %1 (conj %2 e)) ps ps)) #{#{}} s))
                    
