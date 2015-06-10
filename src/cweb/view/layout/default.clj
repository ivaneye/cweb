(ns cweb.view.layout.default
  (:require [hiccup.core :refer :all])
  (:import (java.util Date)
           (java.text SimpleDateFormat)))

(defn- now []
  (.format (SimpleDateFormat. "yyyy") (Date.)))

(defn- footer []
  (html [:footer.page-footer
         [:div.container
          [:div.row
           [:div.col.l6.s12
            [:h5.white-text "Footer Content"]
            [:p.grey-text.text-lighten-4 "You can use rows and columns here to organize your footer content."]]
           [:div.col.l4.offset-l2.s12
            [:h5.white-text "Links"]
            [:ul [:li [:a.grey-text.text-lighten-3 {:href "#!"} "Link 1"]]
             [:li [:a.grey-text.text-lighten-3 {:href "#!"} "Link 2"]]
             [:li [:a.grey-text.text-lighten-3 {:href "#!"} "Link 3"]]
             [:li [:a.grey-text.text-lighten-3 {:href "#!"} "Link 4"]]]]]]
         [:div.footer-copyright [:div.container (str "&copy; " (now) " Copyright Text") [:a.grey-text.text-lighten-4.right {:href "#!"} "More Links"]]]]))

(defn- header []
  (html [:head [:link {:rel "stylesheet" :type "text/css" :href "/css/materialize.min.css"}]
         [:script {:src "/js/materialize.min.js"}]]))

(defn- body [& cont]
  (apply #(html [:body %]) cont))

(defn layout [& cont]
  (str (header) (body cont) (footer)))