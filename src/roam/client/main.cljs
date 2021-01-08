(ns roam.client.main
  (:require ["react-native" :as rn]
            ["react-native-webview" :as wv]
            [applied-science.js-interop :as j]
            [helix.core :refer [defnc $ <>]]))

(defnc Root []

  (<>
   ($ rn/StatusBar {:hidden true})
   ($ wv/WebView {:source (j/lit {:uri "https://roamresearch.com/"})})


   #_($ rn/View {:style (j/lit {:flex 1
                              :alignItems "center"
                              :justifyContent "center"})}
      ($ rn/Text {} "Hello world"))
   )

  #_($ rn/View {:style (j/lit {:flex 1
                             :alignItems "center"
                             :justifyContent "center"})}

     ($ wv/WebView {:source (j/lit {:uri "https://reactnative.dev/"})})

     ;;($ rn/Text {} "Hello world")
     ))

(defn init []
  (j/call rn/AppRegistry :registerComponent "RoamResearch"
          (fn [] Root)))
