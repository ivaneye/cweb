(defproject cweb "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [ring/ring-defaults "0.1.2"]
                           [compojure "1.3.4"]
                           [selmer "0.8.2"]
                           [yesql "0.5.0-rc2"]
                           [mysql/mysql-connector-java "5.1.32"]
                           [org.clojure/clojurescript "0.0-2843" :scope "provided"]]
            :plugins [[lein-ring "0.8.11"]
                      [lein-cljsbuild "1.0.6"]]
            :cljsbuild {
                  :builds [{
                         :source-paths ["src-cljs/test1"]
                         :compiler{
                               :output-to     "resources/public/js/main1.js"
                               :optimizations :whitespace
                               :pretty-print  true}}
                           {
                            :source-paths ["src-cljs/test2"]
                            :compiler{
                                      :output-to     "resources/public/js/main2.js"
                                      :optimizations :whitespace
                                      :pretty-print  true}}]}
            :ring {:handler cweb.core/app})
