(fn flat [x] (if (sequential? x) (apply concat (map flat x)) [x]))