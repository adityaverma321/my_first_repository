read -p "Enter filename : " fname
if [ -e $fname ]
then
    echo "Filename : $fname"
    echo "File permissions : $(ls -l $fname | cut -c 2-10)"
    echo "Number of links : $(ls -l $fname | cut -c 12)"
    echo "File owner name : $(ls -l $fname | cut -d " " -f 3)"
    echo "Group to which file belongs : $(ls -l $fname | cut -d " " -f 4)"
    echo "Size of file : $(ls -l $fname | cut -d " " -f 5)"
    echo "Modification date : $(ls -l $fname | cut -d " " -f 6,7)"
    echo "Modification time : $(ls -l $fname | cut -d " " -f 8)"
fi