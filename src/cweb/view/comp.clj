(ns cweb.view.comp
  (:require [hiccup.core :refer :all]))

(defn- basic
  "基本方法"
  [comp props]
  (vec (concat comp props)))

(defn button [& props]
  (basic [:a.waves-effect.waves-light.btn] props))