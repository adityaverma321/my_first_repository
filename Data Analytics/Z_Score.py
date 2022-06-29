# Outlier decision making using Z-Score
import numpy as np
data = [1, 5, 13, 27, 35, 45, 56, 67, 78, 89, 100]
outliers = []
print("Original data: ", data)
mean = sum(data)/len(data)
mean_dev = [i - mean for i in data]
std_dev = np.std(mean_dev)
print("Mean deviation: ", mean_dev)
print("Standard deviation: ", std_dev)
for i in mean_dev:
    z_score = i/std_dev
print("Outliers: ", outliers)