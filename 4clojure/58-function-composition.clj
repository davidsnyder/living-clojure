(fn [& fns] (fn compose [& args] (letfn [(comp-builder [fs] (if (= 1 (count fs)) (apply (first fs) args) ((first fs) (comp-builder (rest fs)))))] (comp-builder fns))))

