(ns cljs-testing.other-test
  (:require
   [cljs.test :refer [deftest is testing]]))

(deftest test-a
  (testing "a should be like b"
    (is (= 45 (reduce + (range 10))) "This should work")
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))    
    )

  
  (testing "a should be like b"
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))    
    )
  )

(deftest test-b
  (testing "a should be like b"
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))    
    )

  (testing "a should be like b"
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))    
    )
  )

(deftest test-c
  (testing "a should be like b"
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))    
    )

  (testing "a should be like b"
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))    
    )
  )
