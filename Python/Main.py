array = ["hello", "2", "world", ":-)"]
i=0
result=""
for arr in array:
    if len(array[i]) <= 3:
        result+=",\"" + array[i] + "\""
    i+=1
result = "[" + result.replace(',', '', 1) + "]"
print(result)

