(ns bowling-game.k1-test
  (:require  [clojure.test :refer :all]
             [bowling-game.k1 :refer :all]))

(deftest can-we-create-a-game?
  (is (= (:game (create-game)) :bowling-game)))
