read -p "Enter filename : " fname
if [ -e $fname ]
    then
        cat $fname
else
    echo "File does not exists"
fi