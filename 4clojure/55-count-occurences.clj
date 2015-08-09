#(into {} (for [i (partition-by identity (sort %))] [(first i) (count i)]))
