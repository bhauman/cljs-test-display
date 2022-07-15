(ns cljs-testing.core-test
  (:require
   [cljs.test :refer [deftest is testing]]))

(defn this-throws-an-error [msg]
  (throw (js/Error. msg)))

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
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))        
    )
  

  )

(deftest test-b
  (testing "a mouse"
    (testing "a should be like b"
      (is (= 45 (reduce + (range 10))))
      (is (= 45 (reduce + (range 10))))
      (is (this-throws-an-error "ouch"))      
      (is (= 45 (reduce + (range 10))))
      (is (= 45 (reduce + (range 10))))
      (is (= 45 (reduce + (range 10))))
      (is (= 45 (reduce + (range 10))))    
      )

    (testing "a should be like b"
      (is (= 45 (reduce + (range 10))))
      (is (= 5 (reduce + (range 10))) "it should be equal to 45")
      (is (= 5 (reduce + (range 10))))
      (is (= 45 (reduce + (range 10))))
      (is (= 45 (reduce + (range 10))))
      (is (= 45 (reduce + (range 10))))    
      ))
    )

(deftest test-c
  (testing "a should be like b"
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= 45 (reduce + (range 10))))
    (is (= (range 20) (range 19)))
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
