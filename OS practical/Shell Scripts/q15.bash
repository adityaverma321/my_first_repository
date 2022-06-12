read -p "Enter name of first file : " file1
read -p "Enter name of second file : " file2
echo "Files in current directory are"
ls
if cmp -s "$file1" "$file2"
then
    echo "Files are same"
    echo "Deleting the second file"
    $(rm $file2)
    echo "Second file deleted successfully "
    echo "Files in current directory are"
    ls
else
    echo "Files are different"
fi
