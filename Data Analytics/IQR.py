# outlier dectection using IQR
import numpy as np
data = [1, 5, 13, 27, 35, 45, 56, 67, 78, 89, 100]
outliers = []
print("Original data: ", data)
data.sort()
print("Sorted data: ", data)
data = np.array(data)
Q1 = np.percentile(data, 25)
Q3 = np.percentile(data, 75)
IQR = Q3 - Q1
lower_bound = Q1 - 1.5 * IQR
upper_bound = Q3 + 1.5 * IQR
for i in data:
    if i < lower_bound or i > upper_bound:
        outliers.append(i)
print("Outliers: ", outliers)