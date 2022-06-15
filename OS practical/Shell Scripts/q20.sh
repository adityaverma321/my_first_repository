for i in $@
do
	if [ -f $i ]
	then
		echo "$i is a file"
		echo -e "Number of lines in file $i is : $(wc -l < $i)\n"
	elif [ -d $i ]
	then
		echo -e "$i is a directory\n"
	else
		echo -e "$i is not a file or directory\n"
	fi
done
