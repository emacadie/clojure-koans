(meditations
  "You can use vectors in clojure to create an 'Array' like structure"
  ; ORIG: (= __ (count [42]))
  (= 1 (count [42]))

  "You can create a vector in several ways"
  ; ORIG: (= __ (vec nil))
  (= [] (vec nil))

  "And populate it in either of these ways"
  ; ORIG: (= __ (vec '(1)))
  (= [1] (vec '(1)))

  "There is another way as well"
  ; ORIG: (= __ (vector nil))
  (= [nil] (vector nil))

  "But you can populate it with any number of elements at once"
  ; ORIG: (= [1 __] (vec '(1 2)))
  (= [1 2] (vec '(1 2)))

  "And add to it as well"
  ; ORIG: (= __ (conj (vec nil) 333))
  (= [333] (conj (vec nil) 333))

  "You can get the first element of a vector like so"
  ; ORIG: (= __ (first [:peanut :butter :and :jelly]))
  (= :peanut (first [:peanut :butter :and :jelly]))

  "And the last in a similar fashion"
  ; ORIG: (= __ (last [:peanut :butter :and :jelly]))
  (= :jelly (last [:peanut :butter :and :jelly]))

  "Or any index if you wish"
  ; ORIG: (= __ (nth [:peanut :butter :and :jelly] 3))
  (= :jelly (nth [:peanut :butter :and :jelly] 3))

  "You can also slice a vector"
  ; ORIG: (= __ (subvec [:peanut :butter :and :jelly] 1 3))
  (= [:butter :and] (subvec [:peanut :butter :and :jelly] 1 3))

  "Equality with collections is in terms of values"
  ; ORIG: (= (list 1 2 3) (vector 1 2 __)))
  (= (list 1 2 3) (vector 1 2 3)))
