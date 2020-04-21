(ns bowling-game.k1)

(defn create-game []
  {:game :bowling-game
   :rolls []
   :total-frames 10})

(defn roll [game pins-down]
  (update game :rolls conj pins-down))

(defn score [game]
  (reduce + (:rolls game)))
