 (fn split-type [c] (vals (#(reduce (fn [m e] (assoc m (type e) (conj (m (type e) []) e))) {} %) c)))
