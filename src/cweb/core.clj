(ns cweb.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes routes2
           (route/not-found "<h1>Page not found</h1>"))

(defroutes app-routes
           (GET "/" [] "<h1>Hello World</h1>"))

(def app
  (wrap-defaults (apply routes [app-routes routes2]) site-defaults))