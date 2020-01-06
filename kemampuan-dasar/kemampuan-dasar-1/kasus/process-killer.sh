#!/bin/bash

echo "Masukkan nama proses yang akan dimatikan"
read proses

ps -ef | grep $proses | grep -v grep | awk '{print $2}' | xargs kill
