(ns cweb.schema
  (:require [yesql.core :refer [defqueries]]))

(def db-spec {:classname "org.gjt.mm.mysql.Driver"
              :subprotocol "mysql"
              :subname "//localhost:3306/blog?useunicode=true&amp;characterEncoding=UTF-8&amp;zeroDateTimeBehavior=convertToNull"
              :user "root"
              :password "root"})

(defqueries "sql/test.sql" {:connection db-spec})
