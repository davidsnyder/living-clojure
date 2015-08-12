(fn classify [n] (let [char (first (str n))] (cond (= \ char) :map (= \# char) :set (= \[ char) :vector :else :list))) ;cheater! the key is knowing about the 'empty' function
