(ns cweb.controller.index
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [cweb.view.index :as view]
            [cweb.layout :refer [view]]))

(defn index []
  (view/index))

(defn selmer []
  (view "/home.html"))

(defroutes index-route
           (GET "/" [] (index))
           (GET "/selmer" [] (selmer))
           (route/not-found (view/not-found)))