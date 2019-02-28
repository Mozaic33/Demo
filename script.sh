#!/bin/bash
input="git.txt"
while read -r git path
do
  echo "$git"
  echo "$path"
done < "$input"

echo "done"

