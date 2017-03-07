(defproject ctms "1.0.0"
  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :javac-options ["-Xlint:unchecked"]
  :target-path "target/%s/"
  :compile-path "%s/classy-files"
  :main ctms.main
  :aot :all
  :jvm-opts [])
