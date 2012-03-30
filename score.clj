(ns bowling)

(def score 0)

(defn take-input [fst snd]
  (list fst snd))


(defn check-for-spare [lst]
  (if (= (+ (first lst) (second lst)) 10)
    (def score (+ score 10 5))
    (def score (+ (first lst) (second lst)))))


(defn check-for-strike [lst]
  (if (= (first lst) 10)
    (def score (+ score 10 10))
    (check-for-spare lst)))





