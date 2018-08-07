;(fn drop-nth [xs,n] (keep-indexed #(if (not= 0 (mod (inc %1) n)) %2) xs))

#(remove nil? (mapcat drop-last (partition %2 %2 (repeat nil) %)))

;#(apply concat (partition-all (dec %2) %2 %)) 

; with partition-all you don't need to jump through hoops 
; to fill out partitions with fewer than n items
; this solution uses the partition stride length to drop the nth item cleanly
