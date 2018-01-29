(ns clj-tdd.part1.money-test
  (:require [clj-tdd.part1.money :as sut]
            [clj-tdd.part1.money.specs]
            [clj-tdd.test-util :as test-util]
            [clojure.test :as t]))

(t/use-fixtures
  :once test-util/instrument-specs)

(t/deftest test-multiplication
  (let [five (sut/->Dollar 5)
        amount (-> five (sut/* 2) :amount)]
    (t/is (= 10 amount))))
