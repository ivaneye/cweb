(ns cweb.view.index
  (:require [hiccup.core :refer :all]
            [cweb.view.layout.default :refer [layout]]))

(defn index []
  (layout (html
            [:head [:link {:rel "stylesheet" :type "text/css" :href "/css/materialize.min.css"}]
             [:script {:src "/js/materialize.min.js"}]]
            [:body [:a.waves-effect.waves-light.btn "Test"]])))
