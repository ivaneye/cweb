(ns cweb.controller.index
  (:require [compojure.core :refer :all]
    [compojure.route :as route]))

(defn index []
  "<h1>Hello World</h1>")

(defroutes index-route
           (GET "/" [] (index))
           (route/not-found "<h1>Page not found</h1>"))