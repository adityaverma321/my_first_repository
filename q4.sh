option=0
while [ $option -ne 4 ]
do
	echo "Main Menu"
	echo "Press 1 to calculate area of rectangle"
	echo "Press 2 to calculate area of triangle"
	echo "Press 3 to calculate area of circle"
	echo "Press 4 to exit"
	read -p "Enter your choice : " option
	case "$option" in
		1)
			read -p "Enter length of rectangle : " len
			read -p "Enter breadth of rectangle : " bre
			area=$(($len * $bre))
			echo "Area of rectangle is $area\n";;
		2)
			read -p "Enter base length of triangle : " base
			read -p "Enter height of triangle : " height
			area=$((($base * $height)/2))
			echo "Area of triangle is $area\n";;
		3)
			read -p "Enter radius of circle : " r
			area=$((($r * $r)*(22/7)))
			echo "Area of cricle is $area\n";;
		4)
			echo "Exiting..."
			exit
	esac
done
			
