#!/bin/bash

mkdir -p logs
clojure -m shadow.cljs.devtools.cli watch app >> logs/shadow-cljs.log 2>&1
