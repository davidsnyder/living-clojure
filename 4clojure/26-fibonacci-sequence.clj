 (fn fib [n] (reverse ((fn [c n] 
 	(if (= n (count c)) c 
 						(recur (cons (apply + (take 2 c)) c) n))) 
 						'(1 1) n)))
        

