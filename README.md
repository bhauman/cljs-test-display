# cljs-test-display

`cljs-test-display` is a library that produces a visual display of an
in browser `cljs.test` run.

<img src="https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-screenshot.png" width="500"/>

## Overview

`cljs-test-display` is a ClojureScript library that you can use
along with your browser based test runner to provide visual and system
feedback for you test runs.

If you have tests written with `cljs.test` and you can run them in the
browser you can use `cljs-test-display`.

## Features

### fully compatible with `cljs.test`

### favicon feedback

<img src="https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-tab.png" width="500"/>

### provides numbered stacktraces for errors in the browser console

<img src="https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-error-stacktrace.png" width="500"/>

### toggle visibility of passing tests with a keypress

<img src="https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-toggle-visible.png" width="500"/>

### provides system notifications for passing and failing test runs

<img src="https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-system-notifications.png" width="300"/>

### easy to integrate

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

### Small understandable codebase

### Only a ClojureScript library no server side component

### No dependencies

## Usage




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
