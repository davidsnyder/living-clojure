(fn anagrams [words] (into #{} (filter #(<= 2 (count %))
                                       (vals (reduce (fn [hsh s]
                                                       (let [k (clojure.string/join (sort s))]
                                                         (assoc hsh k (conj (hsh k #{}) s))))
                                                     {}
                                                                                     words)))))
