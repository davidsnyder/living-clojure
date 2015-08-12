(fn into-camel-case [s] (let [toks (clojure.string/split s #"-")] (clojure.string/join "" (conj (map clojure.string/capitalize (rest toks)) (first toks)))))
