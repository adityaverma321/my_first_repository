read -p "Enter file name : " file
read -p "How many lines you want to read : " n
totallines=$(wc -l $file | cut -d " " -f 1)
i=1
echo -e "\nTop $n lines are (Head functionality)"
while read line
do
    if [ $i -le $n ]
    then
        echo $line
        i=$(( i+1 ))
    else
        break
    fi
done<$file
echo -e "\nBottom $n lines are (Tail functionality)"
while read line
do
    awk "NR>=$(( totallines-n+1 ))"
done<$file