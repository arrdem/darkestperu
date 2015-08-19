(defproject org.clj-grenada/darkestperu "1.0.0-rc.2"
  :description "Currently a tiny library for assembling JAR files"
  :url "https://github.com/clj-grenada/darkestperu"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojars.rmoehn/guten-tag "0.1.5"]
                 [prismatic/schema "0.4.3"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.10"]]
                   :source-paths ["dev"]}}

  :codox {:sources ["src"]
          :output-dir "api-docs"
          :src-dir-uri "https://github.com/clj-grenada/darkestperu/blob/master/"
          :homepage-uri "https://github.com/clj-grenada/darkestperu/tree/master/"
          :src-linenum-anchor-prefix "L"})
