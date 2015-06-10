(ns cweb.view.index
  (:require [hiccup.core :refer :all]
            [cweb.view.layout.default :refer [layout]]
            [cweb.view.comp :refer :all]))

(defn index []
  (layout (button {:name "ddd" :s "sss"} "YYY")
          (button "ssss")))
