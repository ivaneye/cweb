(defproject cweb "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [ring/ring-defaults "0.1.2"]
                           [compojure "1.3.4"]]
            :plugins [[lein-ring "0.8.11"]]
            :ring {:handler cweb.core/app})
