(ns bowling-game.k1)

(defn create-game []
  {:game :bowling-game
   :rolls []
   :total-frames 10})

(defn roll [game pins-down]
  (update game :rolls conj pins-down))

(defn- organize-rolls-into-frame [rolls]
  (letfn [(rest2 [v] ((comp rest rest) v))]
    (loop [frame (range 10)
           roll  rolls
           res   []]
      (cond
        (or (empty? roll) (empty? frame)) res

        (= 10 (first roll))
        (recur (rest frame)
               (rest roll)
               (conj res {:frame (first frame)
                          :rolls (take 3 roll)}))

        (= 10 (reduce + (take 2 roll)))
        (recur (rest frame)
               (rest2 roll)
               (conj res {:frame (first frame)
                          :rolls (take 3 roll)}))
        :else
        (recur (rest frame)
               (rest2 roll)
               (conj res {:frame (first frame)
                          :rolls (take 2 roll)}))))))

(defn score [{:keys [rolls]}]
  (let [frames (organize-rolls-into-frame rolls)]
    (reduce (fn [acc frame]
              (+ acc (reduce + (:rolls frame))))
            0
            frames)))
