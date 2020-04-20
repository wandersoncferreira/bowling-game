(ns bowling-game.core)

(def game-rolls (atom []))

(defn run-game []
  (reset! game-rolls []))

(defn roll [game pins-down]
  (swap! game-rolls conj pins-down))

(defn score [game]
  (let [cursor (atom 0)
        score (atom 0)]
    (dotimes [i 10]
      (if (= (+ (nth @game-rolls @cursor) (nth @game-rolls (+ 1 @cursor))) 10)
        ;;spare happening
        (do
          (swap! score (partial + 10 (nth @game-rolls (+ 2 @cursor))))
          (swap! cursor (partial + 2)))
        (do
          (swap! score (partial + (+ (nth @game-rolls @cursor)
                                     (nth @game-rolls (+ 1 @cursor)))))
          (swap! cursor (partial + 2)))))
    @score))

