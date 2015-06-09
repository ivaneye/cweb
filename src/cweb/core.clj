(ns cweb.core
  (:require [compojure.core :refer :all]
            [cweb.routes :as r]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(def app
  (wrap-defaults (apply routes r/routes) site-defaults))