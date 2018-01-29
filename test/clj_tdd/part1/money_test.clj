(ns clj-tdd.part1.money-test
  (:require [clj-tdd.part1.money :as sut]
            [clojure.spec.test.alpha :as stest]
            [clojure.test :as t]))

(t/use-fixtures
  :once
  (fn [f]
    (stest/instrument)
    (f)
    (stest/unstrument)))

(t/deftest test-multiplication
  (let [five (sut/->Dollar 5)
        amount (-> five (sut/* 2) :amount)]
    (t/is (= 10 amount))))
