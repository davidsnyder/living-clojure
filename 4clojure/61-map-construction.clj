#(reduce conj {} (map vec (partition 2 (interleave % %2))))



; #(apply hash-map (interleave %1 %2))