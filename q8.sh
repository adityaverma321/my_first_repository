echo "Enter a String"
read string
rev=""
len=${#string}
for ((i = $len - 1; i >= 0; i--))
do
	rev=$rev${string:$i:1}
done
if [ $string == $rev ]
	then
	echo  "Palindrome"
else
	echo "Not palindrome"
fi

