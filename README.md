# cljs-test-display

[![Clojars Project](https://img.shields.io/clojars/v/com.bhauman/cljs-test-display.svg)](https://clojars.org/com.bhauman/cljs-test-display)

`cljs-test-display` is a library that produces a visual display of an
in-browser ClojureScript test run.

<img src="https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-screenshot.png" width="500"/>

## Overview

`cljs-test-display` is a ClojureScript library that you can use
along with your web-based test runner to provide visual and system
feedback for your test runs.

If you have tests written with `cljs.test` and you can run them in the
browser you can use `cljs-test-display`.

## Features

* Fully compatible with `cljs.test`
* Small understandable codebase
* Only a ClojureScript library, no server-side component
* No dependencies

* Red/green favicon feedback

<img src="https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-tab.png" width="500"/>

* Numbered stacktraces for test exceptions in the dev console

<img src="https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-error-stacktrace.png" width="500"/>

* Hide/show passing tests with a key-press

<img src="https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-toggle-visible.png" width="500"/>

* System notifications for passing and failing test runs

<img src="https://s3.amazonaws.com/bhauman-blog-images/cljs-test-display-system-notifications.png" width="300"/>

* Straightforward integration

```clojure
;; where "app" is the HTML node where you want to mount the tests
(cljs.test/run-tests 
  (cljs-test-display.core/init! "app") ;;<-- initialize cljs-test-display here
  'example.foo-test 
  'example.bar-test 
  'example.baz-test)
```

# Usage

> You will need to be familiar with how to create a ClojureScript
> application and run it in a browser.

### Dependencies

You will need to add `[com.bhauman/cljs-test-display "0.1.0"]` to your
project's dependencies *along with* a recent version of
ClojureScript. It has been tested with
`[org.clojure/cojurescript 1.10.238]` and above, but it should work
with almost any version of ClojureScript that includes `cljs.test`.

### Test runner integration

First, you will need to require `cljs-test-display.core` in your test
runner, then call the `cljs-test-display.core/init!` function.
`init!` returns a `cljs.test` environment much like
`cljs.test/empty-env` initialized so that `cljs-test-display` is
engaged.

Example: `test.example/test_runner.cljs`

```clojure
(ns example.test-runner
  (:require 
    [cljs.test]
    [cljs-test-display.core]
    [example.foo-test]
    [example.bar-test]
    [example.baz-test])
  (:require-macros
    [cljs.test]))
	
(defn test-run []
  ;; where "app" is the HTML node where you want to mount the tests
  (cljs.test/run-tests 
    (cljs-test-display.core/init! "app") ;;<-- initialize cljs-test-display here
    'example.foo-test 
    'example.bar-test 
    'example.baz-test))
```

Providing `init!` the element id is optional: `app` is the default.

It is important to note that the `cljs-test-display.core/init!`
function is designed to be called repeatedly in the same environment,
to facilitate hot reloading and test re-runs.

> For the best development experience, invoke your test
> runner after every hot reload.

### HTML host file

The HTML that hosts the tests can be very simple.

Example `resources/public/tests.html` file:

```html
<html>
  <!-- the head element is required as this is where we add CSS and favicon elements -->
  <head></head>
  <body>
    <div id="app"></div>
    <script src="[path to your compiled cljs]" type="text/javascript"></script>
  </body>
</html>
```

## Configuration

You can configure `cljs-test-display` by adding keys to the
`:closure-defines` key in your ClojureScript compiler options.

```clojure
{:main example.core
 :output-to "main.js"
 ...
 :closure-defines {
    ;; set the element id of where the tests will mount
    cljs-test-display.core/root-node-id "test-app" ;; default "app"
	
    ;; disable the favicon changing behavior
    cljs-test-display.core/change-favicon false    ;; default true
	
    ;; disable the system notifications
    cljs-test-display.core/notifications  false    ;; default true
	
    ;; enable the printing of test results
    cljs-test-display.core/printing       true     ;; default false
 }}
```

### Providing your own style 

You can override the injected CSS by supplying your own CSS via an HTML tag
with an id `cljs-test-display-style`.

For Example:

```html
<html>
  <head>
    <!-- override injected css -->
	<link id="cljs-test-display-style" type="text/css" href="css/my-css.css">
  </head>
  <body>
  
	;; you can also place CSS here if you only wish to ammend the CSS
	
    <div id="app"></div>
    <script src="[path to your compiled cljs]" type="text/javascript"></script>
  </body>
</html>
```


## Development

You should be able to work on `cljs-test-display` by forking/cloning
this repo and then `cd`ing into the `cljs-test-display` directory and
running.

    clojure -A:build

This will auto-compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

This should cause an alert to pop up in the browser window.

You will now be able to live edit the code in
`src/cljs-test-display/core.cljs` and live edit the CSS in
`resources/public/com/bhauman/cljs-test-display/css/style.css`.

To clean all compiled files:

    rm -rf target/public

## License

Copyright © 2018 Bruce Hauman

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
