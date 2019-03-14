(defproject dda/clj-schema "1.0.1-SNAPSHOT"
  :min-lein-version "2.0.0"
  :description "Schemas for Clojure data. With validation, example data for tests, and simple contracts support."
  :url "https://github.com/runa-dev/clj-schema"
  :mailing-list {:name "Clj-schema Google Group"
                 :subscribe "https://groups.google.com/forum/?fromgroups#!forum/clj-schema"}
  :license {:name "MIT License"
            :url "http://mit-license.org/"}
  :dependencies [[robert/hooke "1.3.0"]]
  :profiles {:dev {:dependencies [[jonase/kibit "0.0.3"]
                                  [print-foo "0.3.3"]
                                  [slamhound "1.3.0"]
                                  [org.clojure/tools.trace "0.7.3"]]
                   :plugins [[codox "0.6.4"]
                             [jonase/eastwood "0.0.2"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.10 {:dependencies [[org.clojure/clojure "1.10.0"]]}}
  :aliases {"run-tests" ["with-profile" "1.3:1.4:1.5" "test"]
            "slamhound" ["run" "-m" "slam.hound"]}
  :codox {:src-dir-uri "https://github.com/runa-dev/clj-schema/blob/master"
          :src-linenum-anchor-prefix "L"
          :exclude [clj-schema.internal.utils]}
  :deploy-repositories [["snapshots" :clojars]
                        ["releases" :clojars]])
