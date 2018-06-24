# cljs-test-display

`cljs-test-display` is a library that produces a visual display of an
in browser `cljs.test` run.

![cljs-test-display screen shot](https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-screenshot.png)

## Overview

`cljs-test-display` is a light simple library that displays your
ClojureScript tests as they run.

## Features

### favicon feedback

![red favicon visual feedback](https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-tab.png)

### adds valuable stacktraces for errors in the browser console

![stacktrace in devtools console](https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-error-stacktrace.png)

### uses the Web Notification API to provide system notifications

![clojurescript tests system notifications](https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-system-notifications.png)

### Easy to integrate

Example: `test.example/test_runner.cljs`

```clojure
(ns example.test-runner
  (:require 
    [cljs.test]
	[cljs-test-display.core :as display]  
    [example.foo-test]
    [example.bar-test]
    [example.baz-test])
  (:require-macros
    [cljs.test :refer [run-tests]]))
	
(defn test-run []
  ;; where "app" is the html node where you want to mount the tests
  (run-tests (display/init! "app")
             'example.foo-test 
             'example.bar-test 
             'example.bax-test))
```




* 

## Development

To get an interactive development environment run:

    clojure -A:fig:build

This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    rm -rf target/public

To create a production build run:

	rm -rf target/public
	clojure -A:fig:min


## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
