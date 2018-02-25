#!/usr/bin/env bash

rm -rf project/project/
rm -rf project/target/
rm -rf target/
rm -rf build/
rm -rf .sbtserver/
rm -rf project/.sbtserver
rm -rf project/.sbtserver.lock
rm -rf project/sbt-ui.sbt

sbt clean stage