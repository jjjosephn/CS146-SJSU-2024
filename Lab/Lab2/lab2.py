def anagram(s, t):
    lettersMap = {}

    s = s.lower()
    t = t.lower()
    sRange = len(s)
    tRange = len(t)
    sLength = 0
    tLength = 0

    #checking lengths
    for i in range(sRange):
        if s[i] == ' ':
            continue
        else:
            sLength += 1

    for i in range(tRange):
        if t[i] == ' ':
            continue
        else:
            tLength += 1

    if sLength != tLength:
        return False
    
    #input into dictionary if there isn't a key already
    for i in range(sRange):
        if not s[i] in lettersMap:
            if s[i] == ' ':
                continue
            else: 
                lettersMap.update({s[i]: 1})
        else:
            count = lettersMap.get(s[i]) + 1
            lettersMap.update({s[i]: count})
        
    #decrement key value if the same letter is found in string t
    for i in range(tRange):
        if t[i] in lettersMap:
            minus = lettersMap.get(t[i]) - 1
            lettersMap.update({t[i]: minus})
        if lettersMap.get(t[i]) == None:
            continue
        if lettersMap.get(t[i]) == -1:
            return False

    #condition to ensure that all key values = 0
    for i in range(sRange):
        if lettersMap.get(s[i]) == None:
            continue
        if lettersMap.get(s[i]) != 0:
            return False
        
    return True

print(anagram(" Dormitory", "Dirty Room"))

