(defproject org.clojars.philoskim/kaocha-test-ns-hook "0.3.0"
  :description "A Kaocha plugin for the test-ns-hook feature in cloure.test"
  :url "https://github.com/philoskim/kaocha-test-ns-hook"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.11.1" :scope "provided"]
                 [lambdaisland/kaocha "1.87.1366" :scope "provided"]
                 [philoskim/debux "0.9.1" :scope "provided"]]
  :aliases {"unit-test" ["run" "-m" "kaocha.runner" ":unit"]})
