(ns main (:gen-class))


(defn checkStep [game, i , j, row, col]
  (if (and (and (and (>= i 0) (< i row)) (and  (>= j 0) (< j col))) (or (= (compare (aget game i j) \-) 0) (= (compare (aget game i j) \@) 0)))
    (do true)
    (do false)
    )
  )



(defn findingPath [game, i, j, row, col,  visitedArray]

  (def status (checkStep game, i, j, row, col))


  (if (and (= status true) (= (compare (aget game i j) \@) 0))

    (do
      (aset game i j \@)
      (println "Woo hoo, I found the treasure :-) ")
      (doseq [ x (range row)
              y (range col)]

        (if (=  y (- col 1))
                 (do (print (aget game x y))
                     (println)

                     )
                 (do
                   (print (aget game x y ))
                   )
                 )

        )


      (System/exit 0)
      )

    (do
      (if (= status true)
        (do
          (aset game i j  "+")
          (aset visitedArray i j 1)

          (if (and (and (< (+' j 1)  col) (not= (aget visitedArray i (+' j 1))1) (findingPath game, i, (+' j 1) , row, col, visitedArray)))
            true
            )

          (if (and (and (< (+' i 1)  row) (not= (aget visitedArray (+' i 1) j)1) (findingPath game, (+' i 1) , j, row, col, visitedArray)))
            true

            )

          (if (and (and (>= (-' i 1)  0) (not= (aget visitedArray (-' i 1) j)1) (findingPath game, (-' i 1) , j, row, col, visitedArray)))
            true
            )

          (if (and (and (>= (-' j 1) 0) (not= (aget visitedArray i  (-' j 1) )1) (findingPath game, i , (-' j 1), row, col, visitedArray)))
            true
            )

          (aset game i j  "!")

          )
        (do false)

        )

      )
    )


  )

(defn readFile []
  (def string (slurp "map.txt"))

  (def gameBoard (to-array-2d (clojure.string/split  string #"\n"))
    )

  (def row
    (alength gameBoard)
    )
  (def col
    (alength (aget gameBoard 0))
    )
  (def r row)
  (def c (- col 1))

  (def vistedArray (to-array-2d (repeat r (repeat c 0))))

  (findingPath gameBoard, 0, 0, r, c, vistedArray)


  (println "uh Oh, I could not found the treasure :-( ")
  (doseq [ x (range r)
          y (range c)]

    (if (=  y (- c 1))
      (do (print (aget gameBoard x y))
          (println)

          )
      (do
        (print (aget gameBoard x y ))
        )
      )

    )



  )

(readFile)




