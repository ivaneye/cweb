(ns cweb.view.index
  (:require [hiccup.core :refer :all]))

(defn index []
  (html
    [:head [:link {:rel "stylesheet" :type "text/css" :href "https://cdnjs.cloudflare.com/ajax/libs/materialize/0.96.1/css/materialize.min.css"}]
           [:script {:src "https://cdnjs.cloudflare.com/ajax/libs/materialize/0.96.1/js/materialize.min.js"}]]
    [:body [:a.waves-effect.waves-light.btn "Test"]]))
