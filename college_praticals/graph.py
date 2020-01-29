graph = {'a':['c'],'b':['d'],'c':['e'],'d':['a','d'],'e':['b','c'],'f':[]}
edges = []
for i in graph.values():
    for j in i:
        if not (j in edges):
            edges.append(j)
print(edges)
print("Number of edges in graph is ",len(edges))
for i in graph:
    if graph[i] == []:
        print(i, " is isolated vertex")
