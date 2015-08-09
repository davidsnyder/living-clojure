(fn [m] (into {} (for [[k v] m] (into {} (for [[k2 v2] v] [[k k2] v2])))))
