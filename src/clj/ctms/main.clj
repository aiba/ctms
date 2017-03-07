(ns ctms.main
  (:gen-class))

(defn -main [& args]
  (dotimes [i 100]
    (System/currentTimeMillis)))
