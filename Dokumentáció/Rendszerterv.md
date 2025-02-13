1. A rendszer célja
A rendszer célja, hogy a mai fiataloknak segítsen az alapvető számolási műveletek elvégzésében.
A rendszer használható számítógépen is, és a későbbiekben Androidos eszközökön is.

2. Projektterv
	
a, Követelmény specifikáció:
	Szereplők: csapat tagjai
	Prioritás: 0, 
	Becslés: 1 óra
	Eltelt idő: 2óra

b, Funkcionális specifikáció:
	Szereplők: csapat tagjai
	Prioritás: 0
	Becslés: 1 óra
	Eltelt idő: 1 óra
	
c, Rendszerterv:
	Szereplők: csapat tagjai
	Prioritás: 0
	Becslés: 2 óra
	Eltelt idő: 2 óra
	
d, Számológép felületének létrehozása:
	Szereplők: Ungi Keve, Kovács Bence
	Prioritás: 1
	Becslés: 1 óra
	Eltelt idő: 1 óra

e, Számológép funkcióinak kódolása:
	Szereplők: csapat tagjai
	Prioritás: 1
	Becslés: 2 óra
	Eltelt: 2 óra
	

3. Üzleti folyamatok modellje

![alt text](https://github.com/kicsikoko/RFT_project/blob/main/Dokumentáció/pictures/üzletimodell.PNG)

4. Követelmények

Az alapvető matematikai műveletek kiszámításában nyújt segítséget. 
Funkcionális követelmények:
Teljesíteni tud összeadást, kivonást, szorzást, osztást. Illetve ezen műveletek végeredményét mutatja. 

5. Funkcionális terv

Rendszerszereplők:
	Felhasználó

Rendszerhasználati esetek és lefutásaik:
	Felhasználó:
		Képes ki/be kapcsolni a számológépet.
		Képes elvégezni rajta a 4 alapműveletet és a százalékszámítást.	

6. Fizikai környezet

Az alkalmazás windows platformra készül, majd továbbá szeretnénk android készülékre is fejleszteni.
Nincsenek megvásárolt komponenseink.
Fejlesztői eszközök:
	-GitHub
	-Notepad++ 
	-NetBeans 8.2 RC
	-Trello

7. Absztrakt domain modell

A rendszerünk nem tartalmaz ilyen modellt.

8. Architekturális terv

A rendszerünk nem használ adatbázis szervert, ezért szimplán csak frontend fejlesztést végzünk.

9. Adatbázis terv

Nem használunk adatbázis szervert a rendszerünkhöz.

10.Implementációs terv

A felület Java nyelven fog készülni a NetBeans 8.2 környezet segítségével.
Egy panelen helyezzük el a szükséges gombokat(Button) illetve a beviteli mezőt(Label).
A gombok illetve a panel dizájnját elkészítjük.
A gombokhoz Action-t adunk ami azt fogja megmondani, hogy az adott gomb lenyomására mi történjen.

11.Tesztterv

A tesztelések célja, hogy vizsgáljon meg a számológépen minden gombot, hogy megfelően működik-e.
A számok illetve a műveletek lenyumásukkor megjelennek a Label-ben.
Az egyenlőség gomb megnyomása után a számológép a Label-ben levő műveletet helyesen végezze el.
Az On/Off gombok megfelően működjenek.
Unit tesztek:
Minden gomb Action-jét leteszteljük, hogy megfelelően működnek-e.

12.Telepítési terv

Ha webes felületről(Google Chrome, Opera, Safari stb) szeretné letölteni akkor,akkor nem szükséges más illesztő
program. 
Ellenkező esetben ha Androidos vagy IOS platformról szeretné letölteni akkor a megfelelő "Store"-ból
(Play áruház,App store) engedélyezi és letölti. Továbbá ha nem ezeket az áruházakat akarja használni,
akkor engedélyezni kell önnek  "Harmadik féltől származó tartalmakat" a beállításoknál. A harmadik opció pedig hogy a "XYZ.apk"
kiterjesztésű elemet a készülékre rakja majd futassa.   

13.Karbantartási terv

A felhasználók hiba jelentéseit folyamatosan figyeljük és javításokat adunk ki.
Egy éven belül új műveleteket, funkciókat szeretnénk adni a számológéphez.