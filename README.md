# IMDB
A copy of the IMDB site

Clasele/Interfetele/Enumerarile implementate(ordine alfabetica):

AccountType
-	Enumerare ce contine tipurile de cont Regular, Admin,Contributor
Actor
- Clasa ce implementeaza InterfataAux(interfata care m a ajutat in gestionarea elementelor de tip Production si Actor pentru gestionarea favoritelor)
- In aceasta clasa am numele, rolurile si biografia pentru actori, un constructor cu acelasi nume, functii de get si de set
- De asemenea se mai gasesc si functiile: compareTo(functie necesara caci InterfataAux foloseste Comparable, functii de update pt detaliile actorilor, functii de adaugare si eliminare a rolurilor actorilor si displayInfo care printeaza informatiile actorilor
- Clasa Role m-a ajutat sa folosesc numele rolului si daca e Movie sau Series
ActorLoader
-	In aceasta clasa ma ocup de citirea fisierului actors.json si de adaugare a datelor din json in lista de actori
Admin
-	Aceasta clasa extinde Staff si implementeaza Observer si are un constructor cu acelasi nume cu parametri necesari clasei ce gestioneaza tipul de user Admin
-	Contine functie de updatare a notificarilor, de notificare a Adminilor, de adaugare si stergere a productiilor/actorilor, de updatare a productiilor/actorilor



AutentificareGUI
-	Clasa reprezintă o interfață grafică pentru autentificarea într-un sistem IMDB. Este implementată în limbajul de programare Java folosind biblioteca Swing pentru interfața grafică.
-	Are camp de introducere pentru adresa de email, pentru parola si eticheta pentru status
-	Constructorul inițializează fereastra de autentificare, setează dimensiunile și aspectul UI-ului.
-	Are o metoda care verifica credentialele, buton pt autentificare , stil si dimensiuni alese pentru structurarea paginii de autentificare
ClasaStrategie
-	Implementeaza ExperienceStrategy si contine calculateExperience
ConcreteMovie
-	Clasa concreta pt clasa abstracta Movie ce contine si un displayInfo
ConcreteProduction
-	Clasa concreta pt clasa abstracta Production ce contine si un displayInfo
ConcreteUser
-	Clasa concreta pt clasa abstracta User
Contributor
-	Subclasa a clasei Staff ce implementeaza Observer si RequestManager
-	Contine un constructor cu detaliile specific tipului de user Contributor
-	Are metode de updatare a notificarilor, adaugarea si stergerea productiilor/actorilor, updatare a actorilor si productiilor, adaugare si eliminare a cererilor
Credentials
-	Stocheaza credentialele unui utilizator
-	Are metode de get si set pentru parola si email
-	Are si metoda generatePassword pt o parola puternica
Episode
-	Stocheaza informatii despre episoadele serialelor
-	Are metode de get pentru titlu si durata
-	Contine un displayInfo pt afisarea detaliilor episoadelor
ExperienceStrategy
-	Interfata pentru strategia de adaugare a experientei ce contine metoda abstracta calculateStrategy
Factory
-	Clasa este proiectată pentru a servi ca șablon pentru fabricarea și crearea de obiecte de tip "User" într-un system
-	Metoda createUser  primește o varietate de parametri care includ informații despre utilizator, tipul de cont, nume de utilizator, experiența utilizatorului, notificări, favorite, cereri ale utilizatorului și liste pentru contribuții la producții și actori.
Genre
-	E o enumerare cu genurile productiilor 

IMDB
-	Clasa principală in are se afla mainul care gestionează utilizatorii, actorii, cererile și producțiile pe platforma IMDB. 
-	Aceasta are metode pentru încărcarea datelor din fișiere JSON, autentificarea utilizatorilor prin terminal sau interfață grafică, și inițierea fluxului de utilizator în funcție de tipul de cont
-	setExperienceStrategy – metoda pentru stabilirea experientei
-	chooseAuthentication – metoda pentru alegerea autentificarii in terminal sau interfata
-	authenticateUser- metoda care verifica credentialele si daca sunt valide Userul e autentificat
-	runUser – metoda care initiaza fluxul userului in functie de tipul de cont
-	runRegular – metoda in care se alege si se executa fiecare actiune pe care o poate face userul de tip Regular
-	runContributor - metoda in care se alege si se executa fiecare actiune pe care o poate face userul de tip Contributor
-	runAdmin - metoda in care se alege si se executa fiecare actiune pe care o poate face userul de tip Admin
-	run – metoda care initiaza totul prin metoda chooseAuthentication
-	getInstance – metoda care face un singleton pentru instanta clasei IMDB
-	metode de get pt listele de actori, productii, cereri, conturi
-	addUserSystem/removeUserSystem adauga si sterge un user
-	getByName- metoda care returneaza un InterfataAux(Production+ Actor),  folosindu- se doar de nume si cautand in lista de productii si actori
-	viewChosenDetails- metoda pentru afisarea unor anumite detalii ale unui actor sau productii alese dupa nume
-	findContributorForActor/ findContributorForMovie + notifyContributor– metoda de gasire a contribuitorul si metoda de notificare
-	displayRequestDescriptions – metoda care afiseaza descrierile cererilor disponibile
-	isInProductionList/ isIn ActorList – metoda care verifica daca o productie/actor se afla in lista
-	getUserByUsername – gaseste un user dupa username
-	adminSolveRequest – metoda pentru rezolvarea cererilor
InterfataAux
-	interfata auxiliara care ajuta la gestionarea favoritelor de tip Production si Actor
-	contine compareTo si getTitle
ListaActorilorGUI
-	interfata grafica pentru afisarea si cautarea actorilor
-	contine buton pentru cautare actor, un JList pt afisarea listei de actori, panou pentru filtrare, buton pentru vizualizarea tuturor actorilor, bara de search
-	are metodele: openListaActorilorGUI, loadActorsFromJson, searchActors, UpdateActorsDisplay, ActorCellRender si un main
Movie
-	clasa ce extinde Production
-	Stocheaza informatii despre filme
-	Are metode de get si set pentru an, durata, titlu, genuri, actori si alte detalii ale filmelor
-	Contine un displayInfo pt afisarea detaliilor 
-	Un compareTo pentru ca extinde Production ce implementeaza Comparable
Notification
-	Gestioneaza notificarile folosind Observer
-	Are metoda getInstance pt o singura instanta deci se regaseste si Singleton Pattern
-	Contine liste pentru observatory si notificari
-	Foloseste metode pentru adaugarea, stergerea si notificarea unui observer si o metoda addNotification
Observer
-	Interfata pentru observer( userii)
-	Are o metoda abstracta updateNotifications


PaginaPrincipalaGUI
-	Interfata grafica pentru pagina principala
-	In constructor, sunt încărcate actorii și producțiile din fișierele JSON specificate
-	Se gasesc un buton de vizualizat actorii, lista de imagini, JSplitPane pentru a imparti pagina in productii cu imagini si detaliile lor
-	Metoda applyFilters e pentru sortarea productiilor dupa diferite criterii, loadProductionsFromJson ia datele actorilor din Json si openListaActorilorGUI deschide o fereastra catre lista actorilor

ImagineCuDetalii
-	Această clasa encapsulează o imagine și detalii despre productie
-	Imaginea este încărcată din calea specificată și afișată în lista
ImagineCellRender
-	Aceasta este o clasă internă care implementează ListCellRender pentru a personaliza afișarea elementelor din lista de imagini
Production
-	Aceasta este o clasa Java abstracta, care este destinata să fie extinsa de alte clase care reprezinta diferite tipuri de productii
-	Are constructor pentru titlu, genuri, actori ratinguri descriere etc + metode get si set pentru ele
-	Metoda mediaCalculator e pentru a calcula media ratingurilor
-	Se gaseste si un displayInfo pentru printarea detaliilor productiei si un compareTo 
-	Contine metoda pentru updatarea productiilor si de adaugare a ratingurilor
ProductionDetails
-	Preia detalii importante ale productiilor pentru a fi afisate in pagina principala langa imaginea productiei
ProductionLoader
-	In aceasta clasa ma ocup de citirea fisierului production.json si de adaugare a datelor din json in lista de productii
Rating
-	Clasa reprezintă un obiect care stochează informații despre evaluarile acordate productiilor cinematografice de către utilizatori
-	Clasa implementeaza, de asemenea, interfața  Subject, permițand inregistrarea și notificarea observatorilor despre modificări în obiectul Rating
-	Ofera  funcționalități precum adăugarea și eliminarea de observatori, notificarea acestora despre evenimente importante (notifyObservers), precum și posibilitatea de a elimina un rating dintr-o listă de rating-uri bazat pe numele de utilizator
-	Metodele equals si hashCode sunt suprascrise pentru comparare
Regular
-	Aceasta clasa extinde User si implementeaza Observer si are un constructor cu acelasi nume cu parametri necesari clasei ce gestioneaza tipul de user Regular
-	Contine functie de updatare a notificarilor, de adaugare si stergere a cererilor, de adaugare rating
Request
-	Clasa reprezintă un obiect care stochează informații despre cererile utilizatorilor
-	Clasa implementeaza, de asemenea, interfața  Subject, permițand inregistrarea și notificarea observatorilor despre modificări în obiectul Request
-	Ofera  funcționalități precum adăugarea și eliminarea de observatori, notificarea acestora despre evenimente importante (notifyObservers)
-	Contine un displayInfo pentru afisarea detaliilor cererilor
RequestLoader
-	In aceasta clasa ma ocup de citirea fisierului request.json si de adaugare a datelor din json in lista de cereri
RequestHolder
-	Clasă statică ce contine o listă cu toate cererile pe care toată echipa de admini trebuie să le resolve
-	Are o lista de geteri, o metoda de get si metode pentru adaugare si stergerea unei cereri
RequestManager
-	Interfata cu metode abstracte de adaugare si stergere cerere
Series
-	clasa ce extinde Production
-	Stocheaza informatii despre seriale
-	Are metode de get si set pentru an, numar sezoane, sezoane,  titlu, genuri, actori si alte detalii ale serialelor
-	Contine un displayInfo pt afisarea detaliilor 
-	Un compareTo pentru ca extinde Production ce implementeaza Comparable
Staff
-	Clasa extinde User si implementeaza StaffInterface
-	E extinsa de Admin si Contributor
-	Contine metode abstracte de updatare/ adaugare si stergere din system a productiilor/actorilor
StaffInterface
-	Interfata pentru Staff
Subject
-	Această interfata Java definește un obiect care poate fi observat de alțe obiecte (observatori). 
-	Interfața conține trei metode: addObserver, removeObserver si notifyObservers
User
-	Clasa care implementeaza Comparable si Observer
-	Contine informatii despre useri, tipul contului, numele, experienta userului, notificari, favorite si contributii
-	Are o metoda de displayInfo pentru printarea detaliilor despre useri, precus si metode de get si set( inclusive setExperienceStrategy)
-	Metode pentru adaugarea si stergerea de la favorite 
-	performAction pt patternul Strategy
-	metoda de delogare, de generare a unui username, compareTo, adaugare si updatare a notificarilor, increaseExperience
Information
-	clasa interna care foloseste patternul Builder
-	Contine credentialele utilizatorului, numele, tara, varsta, sexul, ziua de nastere + metode get pentru ele
InformationBuilder
-	Clasa prin intermediul careia se utilizeaza patternul Builder
-	Are aceleasi detalii ca Information + metode de set oentru ele
-	Metoda build ce returneaza o noua instanta Information
UserFactory
-	Implementeaza interfata Factory
-	Se creeaza in metoda createUser instante ale utilizatorilor dupa tipul contului(Regular, Contributor, Admin)
UserLoader
-	Aceasta clasa se ocupa de citirea fisierului accounts.json si de adaugare a datelor din json in lista de useri
















