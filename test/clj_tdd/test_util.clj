(ns clj-tdd.test-util
  (:require  [clojure.spec.test.alpha :as stest]))

(defn instrument-specs [f]
  (stest/instrument)
  (f))
