(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (or (= x nil) (= x false))))

(defn abs [x]
  ":(")

(defn divides? [divisor n]
  ":(")

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (and (< age 20) (> age 12)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
