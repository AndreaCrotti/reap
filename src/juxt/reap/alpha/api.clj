;; Copyright © 2020, JUXT LTD.

(ns juxt.reap.alpha.api
  (:require
   [juxt.reap.alpha.rfc7231 :as rfc7231]
   [juxt.reap.alpha.regex :as re]))

(def ^:private precompiled-accept (rfc7231/accept))

(defn accept [s]
  (precompiled-accept (re/input s)))

(def ^:private precompiled-accept-language (rfc7231/accept-language))

(defn accept-language [s]
  (precompiled-accept-language (re/input s)))

(def ^:private precompiled-content-type (rfc7231/content-type))

(defn content-type [s]
  (precompiled-content-type (re/input s)))

(def ^:private precompiled-content-language (rfc7231/content-language))

(defn content-language [s]
  (precompiled-content-language (re/input s)))

(def ^:private precompiled-content-encoding (rfc7231/content-encoding))

(defn content-encoding [s]
  (precompiled-content-encoding (re/input s)))
