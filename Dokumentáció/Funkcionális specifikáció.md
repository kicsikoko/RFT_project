Funkcionális specifikáció

1.Áttekintés

Az alkalmazás JAVA nyelvben íródik és a NetBeans 8.2 verziójú fejlesztőkörnyezetnek a segítségével készül.
Egy kalkulátort szeretnénk létrehozni, mely a 4 alap műveleten kívül még százalék számítást tud számítani.
A rendszer kinézete Windows Calculátorhoz hasonló lesz. Későbbiekben szeretnénk androidos alkalmazást is
fejleszteni.

2. Jelenlegi helyzet

Manapság a fiataloknak a digitális világ miatt nem megy túl jól a fejben számolás képessége, 
ezért inkább előveszik a telefonjukat vagy a számítógépen a számológépet, és azt használják.
Ezért gondoltunk arra, hogy készítünk egy számológépet a Java programnyelv segítségével, hogy
megkönnyítsük a fiatalok helyzetét. Azért választottuk a Java nyelvet, mert az platformfüggetlen.

3. Követelménylista

K01:Összeadás művelete: A felhasználó számokat tud összadni
K02:Kivonás művelete: A felhasználó számokat tud kivonni egymásból
K03:Szorzás művelete: A felhasználó számokat tud összeszorozni
K04:Osztás művelete: A felhasználó számokat tud elosztani egymással
K05:Százalék művelete: A felhasználó a százelék műveletét tudja megvalósítani
K06:Törlés művelete: A felhasználó a beviteli mezőből képes kitörölni egy karaktert
K07:Clear művelete: A felhasználó a teljes beviteli mező értékét törli
K08:Beviteli mező: A felhasználó képes számokat bevinni a műveletekhez
K09:Eredmény mező: A felhasználó látja a bevitt műveleteket
K10:On/Off gombok: A felhasználó ki-be tudja kapcsolni a számológépet

4. Jelenlegi üzleti folyamatok modellje

A programunkkal szeretnénk segíteni a diákoknak, hogy könnyebben megvalósíthassák a
négy alapműveletet, illetve a százalék műveletét.

5. Igényelt üzleti folyamatok modellje

A megrendelő a bekapcsoló gombon keresztül bekapcsolja a számológépet, és az adott műveletet amit szeretne azt 
elkezdi a megadott számokkal.

6. Használati esetek
Ha a felhasználó nem tud fejben számolni vagy csak gyakorolni szeretné a számolást, akkor ezen a felületen
képes lesz az összeadás, kivonás, szorzás és osztás, valamint a százalékszámítás műveletét elvégezni.

7. Megfeleltetés, hogyan fedik le a használati esetek a követelményeket

8. Képernyő tervek

![alt text](https://github.com/kicsikoko/RFT_project/blob/main/Dokumentáció/pictures/szamologep_terv.PNG)

9. Forgatókönyv

A rendszerünknek egy időben egyszerre csak egy felhasználója lehet, aki a műveleteket használja a számológépen.
Bármilyen művelet elvégzéséhez legalább 2 számra lesz szükség. Ezek szinte bármilyen számok a lehetnek, kivéve egy esetben,
ha 0-val szeretn az osztás műveletét elvégezni, akkor arra hibát fog dobni a számológép.

10. Funkció - követelmény megfeleltetés

Összeadás gomb és a hozzá tartozó OnClick metódus -->Összeadás művelete
Kivonás gomb és a hozzá tartozó OnClick metódus -->Kivonás művelete
Szorzás gomb és a hozzá tartozó OnClick metódus -->Szorzás művelete
Osztás gomb és a hozzá tartozó OnClick metódus -->Osztás művelete
Százalék gomb és a hozzá tartozó OnClick metódus -->Százalék művelete
Törlés gomb és a hozzá tartozó OnClick metódus -->Törlés művelete
Clear gomb és a hozzá tartozó OnClick metódus -->Clear művelete
Textfield elhelyezése -->Beviteli mező
Label elhelyezése -->Eredmény mező

11. Fogalomszótár
