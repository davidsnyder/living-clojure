(defn balanced? [str] (let [brackets (#(re-seq #"[\(\)\[\]{}]" %) str)
                            open-set #{"{" "[" "("}
                            lookup {"}" "{",")" "(", "]" "["}
                            ]
                        (loop [[a & args] brackets
                               stack '()]
                        (if (nil? a)
                          (empty? stack)
                          (if (open-set a)
                            (recur args (conj stack a))
                            (if (= (peek stack) (lookup a))
                              (recur args (pop stack))
                              false))))))
