reduce #(if (= (last %) %2) % (conj % %2)) []

; last runs in linear time on vectors...

;#(map first (partition-by identity %))