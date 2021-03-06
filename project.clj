(defproject
 tic-tac-toe
 "0.1.0-SNAPSHOT"
 :dependencies
 [[org.clojure/clojure "1.6.0"]
  [tailrecursion/boot.core "2.5.1" :exclusions [[org.clojure/clojure]]]
  [tailrecursion/boot.task "2.2.4"]
  [rm-hull/monet "0.2.1"]
  [org.clojure/core.match "0.2.2"]
  [tailrecursion/hoplon "5.10.24"]]
 :source-paths
 [".boot/tmp/26387/_COLON_tailrecursion.boot.task_SLASH_src_inc_out/dir.tmp"
  ".boot/tmp/26387/_COLON_tailrecursion.hoplon.boot_SLASH_cljs_out/dir.tmp"
  ".boot/tmp/26387/_COLON_tailrecursion.hoplon.boot_SLASH_hoplon_src_inc_css/dir.tmp"
  ".boot/tmp/26387/_COLON_tailrecursion.hoplon.boot_SLASH_public_out/dir.tmp"
  "src/hl"
  "src/cljs"
  ".boot/tmp/26387/_COLON_tailrecursion.hoplon.boot_SLASH_hoplon_src/dir.tmp"
  "src/clj"
  "resources"
  ".boot/tmp/26387/_COLON_tailrecursion.boot.task_SLASH_cljs_out/dir.tmp"]
 :min-lein-version "2.0.0"
 :uberjar-name
 "tic-tac-toe-standalone.jar")
