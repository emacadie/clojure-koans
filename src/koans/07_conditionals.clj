(defn explain-defcon-level [exercise-term]
  (case exercise-term
        :fade-out          :you-and-what-army
        :double-take       :call-me-when-its-important
        :round-house       :o-rly
        :fast-pace         :thats-pretty-bad
        :cocked-pistol     :sirens
        :say-what?))

(meditations
  "You will face many decisions"
  (= :a (if (false? (= 4 5))
          :a
          :b))
  ;  (= __ (if (false? (= 4 5))
  ;        :a
  ;        :b))


  
  "Some of them leave you no alternative"
  (= [] (if (> 4 3)
          []))
  ;(= __ (if (> 4 3)
  ;        []))

  "And in such a situation you may have nothing"
  (= nil (if (nil? 0)
          [:a :b :c]))
  ;(= __ (if (nil? 0)
  ;        [:a :b :c]))

  "In others your alternative may be interesting"
  (= :glory (if (not (empty? ()))
              :doom
              :glory))
  ;(= :glory (if (not (empty? ()))
  ;            :doom
  ;            __))

  "You may have a multitude of possible paths"
  ;(let [x 5]
  ;  (= :your-road (cond (= x __) :road-not-taken
  ;                      (= x __) :another-road-not-taken
  ;                      :else __)))

  (let [x 5]
    (= :your-road (cond (= x 4) :road-not-taken
                        (= x 3) :another-road-not-taken
                        :else   :your-road)))

  "Or your fate may be sealed"
  ;(= __ (if-not (zero? __)
  ;        'doom
  ;        'doom))
  ; look this one up
  (= 'doom (if-not (zero? 0)
          'doom
          'doom))

  "In case of emergency, sound the alarms"
  ; (= :sirens
  ;   (explain-defcon-level __))
  (= :sirens
     (explain-defcon-level :cocked-pistol))

  "But admit it when you don't know what to do"
  ;(= __
   ;  (explain-defcon-level :yo-mama)))
  (= :say-what?
     (explain-defcon-level :yo-mama)))
