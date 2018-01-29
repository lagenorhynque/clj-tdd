(ns clj-tdd.part1.money.specs
  (:require [clj-tdd.part1.money :as money]
            [clojure.spec.alpha :as s])
  (:import (clj_tdd.part1.money Dollar)))

(s/def ::amount int?)

(s/def ::multiplier pos-int?)

(s/def ::dollar #(instance? Dollar %))

(s/fdef money/->Dollar
  :args (s/cat :amount ::amount)
  :ret ::dollar)

(s/fdef money/*
  :args (s/cat :multiplicand ::dollar
               :multiplier ::amount)
  :ret ::dollar)
