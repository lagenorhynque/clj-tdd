(ns clj-tdd.part1.money
  (:require [clojure.core :as core])
  (:refer-clojure :exclude [*]))

(defrecord Dollar [amount])

(defn * [multiplicand multiplier]
  (-> multiplicand
      :amount
      (clojure.core/* multiplier)
      ->Dollar))
