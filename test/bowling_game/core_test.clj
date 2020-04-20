(ns bowling-game.core-test
  (:require [clojure.test :refer :all]
            [bowling-game.core :refer :all]))

(deftest can-make-game?
  (testing "can I create a new game?"
    (is (some? (run-game)))))

(deftest can-roll-a-ball?
  (testing "I need to be able to run a ball!"
    (let [game (run-game)]
      (roll game 0))))
