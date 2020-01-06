#!/bin/bash

for file in $(sudo find / -type f -name "*.java")
do
	if [ -f $file ]
	then
	echo "ada file java pada direktori $file"
	fi
done
