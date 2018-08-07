(fn rep [c n] (mapcat #(take n (repeat %)) c))
