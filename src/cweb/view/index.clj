(ns cweb.view.index
  (:require [hiccup.core :refer :all]))

(defn index []
  (html
    [:head [:link {:rel "stylesheet" :type "text/css" :href "/css/topcoat-mobile-dark.min.css"}]]
    [:body [:div.topcoat-button-bar__item [:button.topcoat-button-bar__button "One"]]]))
