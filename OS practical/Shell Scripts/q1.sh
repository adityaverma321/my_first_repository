read -p "Enter first number : " a
read -p "Enter second number : " b
option=0
while [ $option -ne 5 ]
do  
    echo "Type 1 for addition"
    echo "Type 2 for subtraction"
    echo "Type 3 for multiplication"
    echo "Type 4 for division"
    echo "Type 5 to Exit"
    echo "Select your option"
    read option
    case "$option" in
        1)
            res=$(($a + $b))
            echo "Sum of $a and $b is $res";;
        2)
            res=$(($a - $b))
            echo "Subtraction of $a and $b is $res";;
        3)
            res=$(($a * $b))
            echo "Multiplication of $a and $b is $res";;
        4)
            res=$(($a / $b))
            echo "Division of $a and $b is $res";;
        5)
            echo "Exiting..."
            exit
    esac
done
