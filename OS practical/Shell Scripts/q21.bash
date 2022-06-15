echo -n "Dates falling under Sunday of current month are : "
cal | cut -c 1,2 | tail -5 | tr "\n" " "