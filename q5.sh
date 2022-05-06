ctime=$(date +'%H')
if [ $ctime -ge 00 -a $ctime -le 12 ]
	then
	echo "Good Morning"
elif [ $ctime -ge 12 -a $ctime -le 18 ]
	then
	echo "Good Afternoon"
elif [ $ctime -ge 18 -a $ctime -le 24 ]
	then
	echo "Good Evening"
fi
