(ns com.fulcrologic.guardrails.core-stubbed
  #?(:cljs (:require-macros com.fulcrologic.guardrails.core-stubbed)))

(def => :ret)
(def | :st)
(def <- :gen)

#?(:clj
   (do
     (defmacro ? [& forms] nil)
     ;; TASK: Strip out the argument list
     (defmacro >defn [& forms] `(defn ~@forms))
     (defmacro >defn- [& forms] `(defn- ~@forms))
     (defmacro >def
       ([k spec-form] nil)
       ([k _doc spec-form] nil))
     (defmacro >fdef [& forms] nil)))