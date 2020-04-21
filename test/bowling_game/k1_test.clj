(ns bowling-game.k1-test
  (:require  [clojure.test :refer :all]
             [bowling-game.k1 :refer :all]))

(deftest can-we-create-a-game?
  (is (= (:game (create-game)) :bowling-game)))

(deftest can-we-get-info?
  (testing "how many frames there is in a single game?"
    (is (= 10 (:total-frames (create-game))))))
