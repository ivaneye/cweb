(ns cweb.layout
  (:require [selmer.parser :refer :all]))

;selmer
(cache-off!)
(set-resource-path! (clojure.java.io/resource "templates"))

(defn view
  ([file] (view file {}))
  ([file args] (render-file file args)))
