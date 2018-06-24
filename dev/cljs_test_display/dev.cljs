(ns ^:figwheel-hooks cljs-test-display.dev
  (:require
   [cljs-test-display.core :as cljs-display]
   [cljs-testing.core-test]
   [cljs-testing.other-test]))

(defn ^:after-load run []
  (cljs.test/run-tests (cljs-display/init! :apper)
                       'cljs-testing.core-test
                       'cljs-testing.other-test))

(defonce runit (run))
