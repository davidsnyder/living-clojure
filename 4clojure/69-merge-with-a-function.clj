(fn merge-with-f [f i-map & o-maps]
  (reduce #(reduce-kv (fn [m k v] (if-let [prev (m k)]
                                    (assoc m k (f prev v))
                                    (assoc m k v))) %1 %2) i-map o-maps))
