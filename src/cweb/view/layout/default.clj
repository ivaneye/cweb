(ns cweb.view.layout.default
  (:require [hiccup.core :refer :all]))

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
         [:div.footer-copyright [:div.container "&copy; 2015 Copyright Text" [:a.grey-text.text-lighten-4.right {:href "#!"} "More Links"]]]]))

(defn layout [page]
  (str page (footer)))