(ns cweb.controller.index
  (:require [compojure.core :refer :all]
    [compojure.route :as route]
            [cweb.view.index :as view]))

(defn index []
  (view/index))

(defroutes index-route
           (GET "/" [] (index))
           (route/not-found (view/not-found)))