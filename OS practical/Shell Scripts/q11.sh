read -p "Enter basic salary : " sal
da=$(( sal*40/100 ))
hra=$(( sal*20/100 ))
gross_salary=$(( sal+da+hra ))
echo "Gross Salary of the person is : $gross_salary"