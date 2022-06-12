echo "Files in directory are"
ls
echo " "
choice=0
while [ $choice -ne 5 ]
do
    echo "Type 1 to delete a file"
    echo "Type 2 to rename a file"
    echo "Type 3 to copy a file"
    echo "Type 4 to modify a file"
    echo "Type 5 exit"
    read -p "Enter your choice : " choice
    case "$choice" in
    1)
        read -p "Enter filename : " fname
        if [ -e $fname ]
        then
            rm $fname
            echo "File deleted successfully"
        else
            echo "File does not exists"
        fi
        echo " "
        ls
        echo " ";;
    2)
        read -p "Enter filename : " fname
        if [ -e $fname ]
        then
            read -p "Enter new filename : " newfname
            mv $fname $newfname
            echo "File renamed successfully"
        else
            echo "File does not exists"
        fi
        echo " "
        ls
        echo " ";;
    3)
        read -p "Enter filename : " fname
        read -p "Enter new filename : " newfname 
        if [ -e $fname ]
        then
            cp $fname $newfname
            echo "File copied successfully"
        else
            echo "File does not exists"
        fi
        echo " "
        ls
        echo " ";;
    4)
        read -p "Enter filename : " fname
        if [ -e $fname ]
        then
            vi $fname
        else
            echo "File does not exists"
        fi
        ls
        echo " ";;
    5)
        echo "Exiting..."
        exit;;
    *)
        echo "Invalid choice"
    esac
done
