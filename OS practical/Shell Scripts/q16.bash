choice=0
while [ $choice -ne 5 ]
do
    echo "Type 1 to print all files of the current directory"
    echo "Type 2 to print the current directory"
    echo "Type 3 to print the date"
    echo "Type 4 to print users"
    echo "Type 5 to exit"
    read -p "Enter your choice : " choice
    echo " "
    case "$choice" in
        1)
            echo "List of files in current directory are"
            ls
            echo -e "\n";;
        2)
            echo "Current directory is"
            pwd
            echo -e "\n";;
        3)  
            echo "Today's date is"
            date +"%d/%m/%Y"
            echo -e "\n";;
        4)
            echo "Current user is"
            whoami
            echo -e "\n";;
        5)
            echo "Exiting..."
            exit;;
        *)
            echo "Invalid choice"
            echo -e "\n";;
    esac
done
