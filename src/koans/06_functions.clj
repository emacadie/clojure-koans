(defn multiply-by-ten [n]
  (* 10 n))

(defn square [n] (* n n))

(meditations
  "Functions are often defined before they are used"
  ; ORIG: (= __ (multiply-by-ten 2))
  (= 20 (multiply-by-ten 2))

  "But they can also be defined inline"
  ; ORIG: (= __ ((fn [n] (* __ n)) 2))
  (= 10 ((fn [n] (* 5 n)) 2))

  "Or using even shorter syntax"
  ; ORIG: (= __ (#(* 15 %) __))
  ; I figured this out in the REPL, but I am having a hard time
  ; figuring out what # and % do
  ; I did this on the REPL:
  ; user=> (macroexpand '(#(* 15 %) 2))
  ; ((fn* [p1__115#] (* 15 p1__115#)) 2)
  ; But: The * character is already present as multiplication
  (= 30 (#(* 15 %) 2))

  "Short anonymous functions may take multiple arguments"
  ; ORIG: (= __ (#(+ %1 %2 %3) 4 5 6))
  ; so the % sign is for args. The previous did not need numbers
  ; since there was only one
  (= 15 (#(+ %1 %2 %3) 4 5 6))

  "One function can beget another"
  ; ORIG:
  ; (= __ ((fn []
  ;          ((fn [a b] (__ a b))
  ;           4 5))))
  (= 9 ((fn []
            ((fn [a b] (+ a b))
             4 5))))

  "Higher-order functions take function arguments"
  ; ORIG:
  ; (= 25 (___
  ;        (fn [n] (* n n))))
  (= 25 ((fn [f] (f 5))
         (fn [n] (* n n))))

  "But they are often better written using the names of functions"
  ; ORIG: (= 25 (___ square)))
  (= 25 ((fn [f] (f 5)) square))
  )
  