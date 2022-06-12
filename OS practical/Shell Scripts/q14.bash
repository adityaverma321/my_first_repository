read -p "Enter cost price : " c
read -p "Enter selling price : " s
if [ $s -gt $c ]
then
    profit=$(( s-c ))
    echo "The seller made a profit of $profit"
elif [ $s -lt $c ]
then
    loss=$(( c-s ))
    echo "The seller made a loss of $loss"
else
    echo "Cost price and Selling price are same"
fi