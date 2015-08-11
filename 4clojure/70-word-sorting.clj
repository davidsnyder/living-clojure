(fn [str] (let [toks (clojure.string/split str #"\s|\.|\,|\?|\!") tokmap (zipmap (map clojure.string/lower-case toks) toks)] (map #(tokmap %) (sort (keys tokmap)))))
