(ns bowling-game.core-test
  "First attempt following this Java tutorial: https://youtu.be/OPGTPQ4kURU"
  (:require [clojure.test :refer :all]
            [bowling-game.core :refer :all]))

(deftest can-make-game?
  (testing "can I create a new game?"
    (is (some? (run-game)))))

(deftest can-roll-a-ball?
  (testing "I need to be able to run a ball!"
    (let [game (run-game)]
      (roll game 0))))

(deftest can-score-gutter-game?
  (testing "verify the score after sending the ball to the gutter."
    (let [game (run-game)]
      ;; I made 20 rolls all directly to the gutter, no pins should be knocked out
      (dotimes [_ 20]
        (roll game 0))
      (is (= (score game) 0)))))

(deftest can-score-a-game-of-ones?
  (testing "verify the score after knocking only one pin in each roll."
    (let [game (run-game)]
      (dotimes [_ 20]
        (roll game 1))
      (is (= (score game) 20)))))

(deftest can-score-space-followed-by-three?
  (let [game (run-game)]
    (roll game 5)
    (roll game 5)
    (roll game 3)
    (dotimes [_ 17]
      (roll game 0))
    (is (= 16 (score game)))))

(deftest can-score-a-strike-followed-by-three-then-three?
  (let [game (run-game)]
    (roll game 10)
    (roll game 3)
    (roll game 3)
    (dotimes [_ 17]
      (roll game 0))
    (is (= 22 (score game)))))

(deftest can-score-perfect-game?
  (let [game (run-game)]
    (dotimes [_ 12]
      (roll game 10))
    (is (= 300 (score game)))))
