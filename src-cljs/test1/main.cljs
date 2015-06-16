(ns test1.main
  (:require [clojure.browser.repl :as repl]))

(defn main
  []
  (let [content "Hello World from ClojureScript"
        element (js/$ "main")]
    (.html element content)))

(main)