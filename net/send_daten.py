import urllib.request, urllib.parse

pnn=input("Nachname: ")
pvn=input("Vorname: ")
dc={b"nn":pnn,b"vn":pvn}    # nn ist Freitextfeld, was eingegeben wird zur Variable übernommen (wie %d in C)    --> dc ... decode?

data=bytes(urllib.parse.urlencode(dc), "UTF-8")

try: 
    u = urllib.request.urlopen("http://localhost/FSST/dateneingabe/send_post.php", data)
except:
    print("Fehler")

li=u.readlines()
u.close()
for element in li: 
    print(element)
