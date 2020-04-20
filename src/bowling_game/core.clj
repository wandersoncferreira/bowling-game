(ns bowling-game.core)

(def game-score (atom 0))

(defn run-game []
  (reset! game-score 0))

(defn roll [game pins-down]
  (swap! game-score (partial + pins-down)))

(defn score [game]
  @game-score)
