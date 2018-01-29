consonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'}

def encode(q):
  output = []

  for c in q:
    if c.upper() in consonants:
      output += [c, 'o', c.lower()]
    else:
      output.append(c)

  return ''.join(output)

while True:
  query = input("Rövarspråket interpreter: Give me some text and I'll translate it to Rövarspråket! ")
  print(encode(query) + "\n")