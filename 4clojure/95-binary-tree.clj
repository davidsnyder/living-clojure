(fn binary-tree? [t] (if (nil? t) true
                         (if (and t (= 3 (count t)))
                           (let [[a b c] t] (and a (binary-tree? b) (binary-tree? c)))
                                                     false)))
