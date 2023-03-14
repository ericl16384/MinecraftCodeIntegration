#!/bin/bash

#if [ $# -eq 0 ]; then
#  echo "Error: missing argument"
#  exit 1
#fi
#MESSAGE=$1

git status
echo "Continue by adding all these files? (y/n)"
while true; do
    read -r yn
    case $yn in
        [Yy]* ) echo "You chose to continue."; break;;
        [Nn]* ) echo "You chose to quit."; exit;;
        * ) echo "Please answer y or n.";;
    esac
done

git add *
git status

echo "Type commit message to commit and push."
IFS= read -r -e msg
echo "Starting commit and push."

git commit -m "$msg"
git push

echo "Starting build and run."

./gradlew build && ./gradlew runClient