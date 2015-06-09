(ns cweb.routes
  (:require [cweb.controller.index :refer [index-route]]))

(def routes [index-route])