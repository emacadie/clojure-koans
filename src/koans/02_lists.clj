(meditations
  "Lists can be expressed by function or a quoted form"
  ; ORIG: (= '(__ __ __ __ __) (list 1 2 3 4 5))
  (= '(1 2 3 4 5) (list 1 2 3 4 5))

  "They are Clojure seqs (sequences), so they allow access to the first"
  ; ORIG: (= __ (first '(1 2 3 4 5)))
  (= 1 (first '(1 2 3 4 5)))

  "As well as the rest"
  ; ORIG: (= __ (rest '(1 2 3 4 5)))
  (= '(2 3 4 5) (rest '(1 2 3 4 5)))
  

  "The rest when nothing is left is empty"
  ; ORIG: (= __ (rest '(100)))
  (= '() (rest '(100)))

  "And construction by adding an element to the front is simple"
  ; ORIG: (= __ (cons :a '(:b :c :d :e)))
  (= '(:a :b :c :d :e) (cons :a '(:b :c :d :e)))

  "Conjoining an element to a list can be done in the reverse order"
  ; ORIG: (= __ (conj '(:a :b :c :d :e) 0))
  (= '(0 :a :b :c :d :e) (conj '(:a :b :c :d :e) 0))

  "You can use a list like a stack to get the first element"
  ; ORIG: (= __ (peek '(:a :b :c :d :e)))
  (= :a (peek '(:a :b :c :d :e)))

  "Or the others"
  ; ORIG: (= __ (pop '(:a :b :c :d :e)))
  (= '(:b :c :d :e) (pop '(:a :b :c :d :e)))

  "But watch out if you try to pop nothing"
  (= "No dice!" (try
          (pop '())
          (catch IllegalStateException e "No dice!")))

; ORIG:  (= __ (try
;          (pop '())
;          (catch IllegalStateException e "No dice!")))

  "The rest of nothing isn't so strict"
  (= '() (try
          (rest '())
          (catch IllegalStateException e "No dice!"))))
; ORIG: 
;  (= __ (try
;          (rest '())
;          (catch IllegalStateException e "No dice!"))))
