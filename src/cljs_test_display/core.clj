(ns cljs-test-display.core
  (:require
   [clojure.java.io :as io]))

(defmacro css []
  (slurp (io/resource "public/com/bhauman/cljs-test-display/css/style.css")))

