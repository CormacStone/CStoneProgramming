import random

prefixes = [
    "anti", "de", "dis", "en", "em", "fore", "in", "im", "il", "ir", "inter",
    "ultra", "mid", "mis", "non", "over"
]  #16

preDef = [
    "against", "opposite", "not", "cause to", "cause to", "before", "in", "in",
    "not", "not", "between", "extreme", "middle", "wrongly", "not", "over"
]

suffixes = [
    "able", "ful", "ing", "less", "ity", "ment", "ness", "er", "est", "ly",
    "phobic", "ty", "y", "ous", "ion", "tion"
]  #16

sufDef = [
    "can be", "full of", "doing", "without", "state of", "state of being",
    "state of", "more", "the most", "how something is", "fear", "state of",
    "characterized by", "having qualities of", "act", "act"
]

roots = [
    "anthropo", "auto", "bio", "chron", "dyna", "dys", "geo", "hydro", "hypo",
    "homo", "logy", "phil", "phys", "psycho", "quasi", "radio"
]  #16

rootDef = [
    "man", "self", "life", "time", "power", "bad", "earth", "water", "below",
    "same", "study of", "love", "nautre", "mind", "partly or almost", "radius"
]

ammount = int(input("How many words do you want? "))
for i in range(ammount):
  x = random.randint(0,15)
  y = random.randint(0,15)
  z = random.randint(0,15)
  word = (prefixes[x] + roots[y] + suffixes[z])
  print("\n",word,"means:\n", sufDef[z],preDef[x],rootDef[y])
#suf pre root
