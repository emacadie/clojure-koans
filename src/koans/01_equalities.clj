(meditations
  "We shall contemplate truth by testing reality, via equality."
  ; ORIG:  (= __ true)
  (= true true)

  "To understand reality, we must compare our expectations against reality."
  ; ORIG:  (= __ (+ 1 1))
  (= 2 (+ 1 1))

  "You can test equality of many things"
  ; ORIG:  (= (+ 3 4) __ (+ 2 __))
  (= (+ 3 4) 7 (+ 2 5))

  "Some things may appear different, but be the same"
  ; ORIG:  (= 2 2/1 __)
  (= 2 2/1 4/2)

  "You cannot generally float to heavens of integers"
  ; ORIG:  (= __ (= 2 2.0))
  (= false (= 2 2.0))

  "But a looser equality is also possible"
  ; ORIG:  (== 2.0 2 __)
  (== 2.0 2 4/2)

  "When things cannot be equal, they must be different"
  ; ORIG:  (not= :fill-in-the-blank __))
  (not= :fill-in-the-blank :look-up-symbols))
