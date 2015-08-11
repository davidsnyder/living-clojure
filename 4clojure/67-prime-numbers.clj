(fn [n] (take n ((fn sieve [s] (cons (first s) (lazy-seq (sieve (filter #(not= 0 (mod % (first s)))
                                                                        (rest s)))))) (iterate inc 2)
                                                                                         )))
