#!/bin/sh
echo "
 ______  ___  _ _____ 
|__  / |/ / || |___  |
  / /| ' /| || |_ / / 
 / /_| . \|__   _/ /  
/____|_|\_\  |_|/_/   

Uptime     : $(uptime)
Hostname   : $(hostname)
Disk Usage : $(df -h | awk '/\/$/ {print $3 " used of " $2}')
Memory     : $(free | awk '/Mem:/ {printf "%.1fMB used of %.1fMB", $3/1024, $2/1024}')
"