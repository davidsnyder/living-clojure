(fn sym-wrap [[a b c]] ((fn symmetric? [t1 t2] (if (and (nil? t1) (nil? t2))
                                                 true
                                                 (let [[v1 l1 r1] t1 [v2 l2 r2] t2] (if (= v1 v2)
                                                                                      (and (symmetric? l1 l2) (symmetric? r1 r2))
                                                                                      false))))
                        b c))

