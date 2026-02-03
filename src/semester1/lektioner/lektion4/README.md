### Opgave 1

a) Lav en metoder der udskriver tallene fra 5 til 20 ved brug af en while løkke

### Opgave 2 

a)

Implementerer en metoden evenNumbers, så den returnerer summen af alle lige tal mellem
2 og 100, begge inklusiv.

Resultatet skulle gerne være 2550.

b)

Implementerer en metoden qubicNumbers, så den returnerer summen af alle kvadrattal mindre end 100. 

Et kvadrattal er kvadratet af et heltal, de første er 1, 4, 9,...

Resultatet skulle gerne give 385

Ekstraopgave

Kan I modificerer de to metoder, så de tager en parameter der angiver hvornår man skal
stoppe, så man for eksempel kan angive at man vil have summen af alle lige tal optil 200?

### Opgave 3

Lav en metode der tager en parameter og udskriver den lille tabel for den parameter.

Så for 7 udskrives.

7 14 21 28 35 42 49 56 63 70

Du kan bruge metoden

System.out.printf("%4d", number);

Til at udskrive et heltal der fylder fire tegn.

**Ekstra opgave**

Lav en metode der kan udskrive den lille tabel og som gør brug af den metode du lige har
lavet.


     1   2   3   4   5   6   7   8   9  10
     2   4   6   8  10  12  14  16  18  20
     3   6   9  12  15  18  21  24  27  30
     4   8  12  16  20  24  28  32  36  40
     5  10  15  20  25  30  35  40  45  50
     6  12  18  24  30  36  42  48  54  60
     7  14  21  28  35  42  49  56  63  70
     8  16  24  32  40  48  56  64  72  80
     9  18  27  36  45  54  63  72  81  90
    10  20  30  40  50  60  70  80  90 100


### Opgave 4

Lav en metoder power der tager to parameter og returnere den parameter opløftet 
til en potens af den anden parameter. Med andre ord skal I implementerer Math.pow 
metoden. Og I må selvfølgelig ikke bruge Math.pow metoden, men skal bruge en while løkke. 

Prøv at kalde din metode med parameterne 2 og 31 altså udregn $2^{31}$. Overvej hvorfor 
du får det resultat. 

### Opgave 5 - Loops i loops

Lav metoder der udskriver følgende fire mønstre.

    Mønster A     Mønster B   Mønster C    Mønster D
    *             *****              *         *****
    **            ****              **          ****
    ***           ***              ***           ***
    ****          **              ****            **
    *****         *              *****             *

Du får brug for et loop inden i et loop.

**Ekstra opgave**

Kan du samle de fire metoder til en enkelt metode der tager to boolean parameter
der fortæller om mønsteret skal vokse oppefra og ned eller omvendt og om mønsteret 
skal være højrestillet eller venstrestillet. 

### Opgave 6 - Tværsum

Lav en metode der kan beregne tværsummer af et tal. En tværsum af et tal er hvert 
ciffer lagt sammen. 

Så tværsummen af 345 er 3 + 4 + 5 = 12

Hint: 345 % 10 er 5 og 345 / 10 er 34 ved heltalsdivision.

### Opgave 7 - Reverse

Lav en metode der reverse der tager et heltal som parameter og returnere et heltal 
hvor alle ciffer er byttet om.

Så 5678 bliver til 8765

Hintet fra opgave 6 kan også bruges her. 

### Opgave 8 - Pallidrom tal

Et pallidrom tal er et heltal som er ens hvad enten det læses fra højre eller fra venstre.

Så 34543 og 9779 er palidromer, men 37723 er ikke.

Lav en metode der kontrollere om et tal er et pallidrom tal.

### Opgave 9* - approximerer $pi$ 

Lav en metode der tager et heltal som parameter og bruger denne formel til at
aproximere $pi$ 

$pi = 4(1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \frac{1}{9} ...)$

med x led, hvor x er den parameter som metoden har fået.

Hvert led kan udregnes med 

$\frac{(-1)^{x+1}}{2x -1}$

Så for første led x = 1, $\frac{(-1)^{1+1}}{2*1-1} = \frac{(-1)^2}{2-1} = \frac{1}{1} = 1$





