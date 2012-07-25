(meditations
  "You can create a set in two ways"
  ; ORIG:  (= #{} (set __))
  (= #{} (set nil))

  "They are another important data structure in clojure"
  ; ORIG:  (= __ (count #{1 2 3}))
  (= 3 (count #{1 2 3}))

  "Remember that a set is a 'set'"
  ; ORIG:  (= __ (set '(1 1 2 2 3 3 4 4 5 5)))
  (= #{1 2 3 4 5} (set '(1 1 2 2 3 3 4 4 5 5)))

  "You can ask clojure for the union of two sets"
  ; ORIG:  (= __ (clojure.set/union #{1 2 3 4} #{2 3 5}))
  (= #{1 2 3 4 5} (clojure.set/union #{1 2 3 4} #{2 3 5}))

  "And also the intersection"
  ; ORIG:  (= __ (clojure.set/intersection #{1 2 3 4} #{2 3 5}))
  (= #{2 3} (clojure.set/intersection #{1 2 3 4} #{2 3 5}))

  "But don't forget about the difference"
  ; ORIG:  (= __ (clojure.set/difference #{1 2 3 4 5} #{2 3 5})))
  (= #{1 4} (clojure.set/difference #{1 2 3 4 5} #{2 3 5})))
