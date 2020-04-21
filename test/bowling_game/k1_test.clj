(ns bowling-game.k1-test
  (:require  [clojure.test :refer :all]
             [bowling-game.k1 :refer :all]))

(deftest can-we-create-a-game?
  (is (= (:game (create-game)) :bowling-game)))

(deftest can-we-get-info?
  (testing "how many frames there is in a single game?"
    (is (= 10 (:total-frames (create-game))))))

(defn game-loop [rolls]
  (reduce
   (fn [game pins-down]
     (roll game pins-down))
   (create-game)
   rolls))

(deftest can-we-simulate-game-scores?
  (testing "all the games had throws going to the gutter, therefore 0 scores."
    (let [game (game-loop (repeat 20 0))]
      (is (= (score game) 0))))

  (testing "let's try to score two rolls."
    (let [game (game-loop (concat [5 4] (repeat 18 0)))]
      (is (= (score game) 9))))

  (testing "let's face the first special case, the spare."
    (let [game (game-loop (concat [5 5 3] (repeat 17 0)))]
      (is (= 16 (score game)))))

  (testing "let's face the second special case, the strike."
    (let [game (game-loop (concat [10 3 3] (repeat 17 0)))]
      (is (= 22 (score game)))))

  (testing "score a spare in the last frame."
    (let [game (game-loop (concat (repeat 18 0) [5 5 7]))]
      (is (= 17 (score game))))))
