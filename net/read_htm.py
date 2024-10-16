# um URL einzulesen
import sys, urllib.request

try:
    u=urllib.request.urlopen("http://127.0.0.1/FSST/start.htm") # Datei in XAMPP -> htdocs -> FSST
except:
    print("Fehler")
    sys.exit(0)

li=u.readlines()
u.close()
for element in li: 
    print(element)