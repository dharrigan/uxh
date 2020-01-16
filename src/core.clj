(ns core)

(Thread/setDefaultUncaughtExceptionHandler
 (reify Thread$UncaughtExceptionHandler
   (uncaughtException [_ thread ex]
     (println "foooobar"))))

(defn -main
  [& args]
   ;; you go bang now
  (/ 1 0))
