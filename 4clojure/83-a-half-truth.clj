(fn [& args] (= 2 (count (distinct args))))

; not= --> (not (= args))