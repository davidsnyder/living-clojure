(fn fib-seq [n] (let [fib (fn f [a b] (lazy-seq (cons a (f b (+ a b)))))]
                    (take n (fib 1 1))))
                    

        

