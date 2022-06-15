echo -e "Files in current directory having read, write, and execute permission are\n"
for file in *
do
    if [ -f $file ]
    then
        if [ -r $file -a -w $file -a -x $file ]
        then
            ls -l $file
        fi
    fi
done