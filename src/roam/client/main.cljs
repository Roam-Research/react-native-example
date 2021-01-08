(ns roam.client.main
  (:require ["react-native" :as rn]
            [applied-science.js-interop :as j]
            [helix.core :refer [defnc $]]))

(defnc Root []
  ($ rn/View {:style (j/lit {:flex 1
                             :alignItems "center"
                             :justifyContent "center"})}
     ($ rn/Text {} "Hello world")))

(defn init []
  (j/call rn/AppRegistry :registerComponent "RoamResearch"
          (fn [] Root)))
