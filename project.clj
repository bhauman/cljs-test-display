(defproject com.bhauman/cljs-test-display "0.1.0-SNAPSHOT"
  :description "Provides a visual display for ClojureScript tests."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.7.1"

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"] :scope :provided]

  :source-paths ["src"]

  :aliases {"fig"       ["trampoline" "run" "-m" "figwheel.main"]
            "fig:build" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]
            "fig:min"   ["run" "-m" "figwheel.main" "-O" "advanced" "-bo" "dev"]}

  :profiles {:dev {:dependencies [[com.bhauman/figwheel-main "0.1.2"]
                                  [com.bhauman/rebel-readline-cljs "0.1.3"]
                                  [org.clojure/clojurescript "1.10.238"]]
                   :source-paths ["src" "dev"]
                   :resource-paths ["resources" "dev-resources" "target"]
                   ;; need to add the compliled assets to the :clean-targets
                   :clean-targets ^{:protect false} ["target/public" :target-path]}})

