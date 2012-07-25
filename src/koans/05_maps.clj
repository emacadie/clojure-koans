(meditations
  "There are two ways to create maps"
  ; ORIG:  (= __ (hash-map))
  (= {} (hash-map))

  "Maps in clojure associate keys with values"
  ; ORIG:  (= __ (count (hash-map)))
  (= 0 (count (hash-map)))

  "A value must be supplied for each key"
  ; ORIG:  (= {:a 1} (hash-map :a __))
  (= {:a 1} (hash-map :a 1))

  "The size is the number of entries"
  ; ORIG:  (= __ (count {:a 1 :b 2}))
  (= 2 (count {:a 1 :b 2}))

  "You can look up the value for a given key"
  ; ORIG:  (= __ (get {:a 1 :b 2} :b))
  (= 2 (get {:a 1 :b 2} :b))

  "Maps can be used as lookup functions"
  ; ORIG:  (= __ ({:a 1 :b 2} :a))
  (= 1 ({:a 1 :b 2} :a))

  "And so can keywords"
  ; ORIG:  (= __ (:a {:a 1 :b 2}))
  (= 1 (:a {:a 1 :b 2}))

  "But map keys need not be keywords"
  ; ORIG:  (= __ ({2006 "Torino" 2010 "Vancouver" 2014 "Sochi"} 2010))
  (= "Vancouver" ({2006 "Torino" 2010 "Vancouver" 2014 "Sochi"} 2010))

  "You may not be able to find an entry for a key"
  ; ORIG:  (= __ (get {:a 1 :b 2} :c))
  (= nil (get {:a 1 :b 2} :c))

  "But you can provide your own default"
  ; ORIG:  (= __ (get {:a 1 :b 2} :c :key-not-found))
  (= :key-not-found (get {:a 1 :b 2} :c :key-not-found))

  "You can find out if a key is present"
  ; ORIG:  (= __ (contains? {:a nil :b nil} :b))
  (= true (contains? {:a nil :b nil} :b))

  "Or if it is missing"
  ; ORIG:  (= __ (contains? {:a nil :b nil} :c))
  (= false (contains? {:a nil :b nil} :c))

  "Maps are immutable, but you can create a new, 'changed' version"
  ; ORIG:  (= {1 "January" 2 __} (assoc {1 "January" } 2 "February"))
  (= {1 "January" 2 "February"} (assoc {1 "January" } 2 "February"))

  "You can also 'remove' an entry"
  ; ORIG:  (= {__ __} (dissoc {1 "January" 2 "February"} 2))
  (= {1 "January"} (dissoc {1 "January" 2 "February"} 2))

  "Often you will need to get the keys (which will be in hash order)"
  (= (list 2006 2010 2014)
     (sort (keys {2006 "Torino" 2010 "Vancouver" 2014 "Sochi"})))
  ; ORIG:  (= (list __ __ __)
  ;    (sort (keys {2006 "Torino" 2010 "Vancouver" 2014 "Sochi"})))

  "Or the values"
  (= (list "Sochi" "Torino" "Vancouver")
     (sort (vals {2006 "Torino" 2010 "Vancouver" 2014 "Sochi"}))))
  ; ORIG:  (= (list "Sochi" "Torino" __)
  ;    (sort (vals {2006 "Torino" 2010 "Vancouver" 2014 "Sochi"}))))
