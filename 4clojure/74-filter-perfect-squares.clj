(fn perfect-squares [nums] (clojure.string/join ","
                                                (map (comp #(* % %) int)
                                                          (filter #(zero? (mod % 1))
                                                                  (map (comp #(Math/sqrt %) read-string)
                                                                            (clojure.string/split nums #","))))))
