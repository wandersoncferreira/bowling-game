(ns bowling-game.k1-test
  (:require  [clojure.test :refer :all]
             [bowling-game.k1 :refer :all]))

(deftest can-we-create-a-game?
  (is (= (:game (create-game)) :bowling-game)))

(deftest can-we-get-info?
  (testing "how many frames there is in a single game?"
    (is (= 10 (:total-frames (create-game))))))

(deftest can-we-simulate-game-scores?
  (testing "all the games had throws going to the gutter, therefore 0 scores"
    (let [game (reduce
                (fn [game pins-down]
                  (roll game pins-down))
                (create-game)
                (range 0 20))]
      (is (= (score game) 0)))))
