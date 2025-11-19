# Opgaver lektion 24

Hent projektet fra [https://github.com/benn-christensen/Prog1Lektion24.git](https://github.com/benn-christensen/Prog1Lektion24.git)

## Opgave 1
Implementer metoden `containsUnevenNumber`, så den returnerer `true`, hvis listen af heltal indeholder mindst et ulige tal og `false` ellers.

## Opgave 2
Skriv en metode der givet en liste af heltal returnerer indekset af det første tal der ligger i intervallet mellem 10 og 15, begge tal inklusiv. Hvis der ikke er nogle tal i det interval, skal metoden returnere -1.

Ekstra opgave: Generaliser metoden, så den tager to ekstra variabler for intervallet der skal søges i.

## Opgave 3
Lav en metode der givet en liste af heltal, afgør om der er to på hinanden efterfølgende tal der er ens.

## Opgave 4
Lav en metode i `CarsStorage` klassen der tager et heltal som parameter og returnerer det første `Car` objekt der har en højere tophastighed. Hvis der ikke er et `Car` objekt med højere tophastighed, så skal `null` returneres.

Lav en metode i `CarsStorage` klassen der tager en streng som parameter og returnerer det første `Car` objekt hvis brand attribut matcher den streng. Hvis der ikke findes et match, skal der returneres `null`.

Test dine metoder.

## Opgave 5
Skriv en metode, der (uden brug af operationen for kvadratrod: `Math.sqrt`) kan beregne heltalskvadratroden af et heltal n≥0. Metoden skal altså returnere det største heltal r, der opfylder: r² ≤ n < (r+1)²

Her er nogle eksempler:

| n   | r  |
|-----|----|
| 0   | 0  |
| 1   | 1  |
| 3   | 1  |
| 4   | 2  |
| 7   | 2  |
| 8   | 2  |
| 9   | 3  |
| 10  | 3  |
| 111 | 10 |

Skriv en metode der anvender **lineær søgning**.

Skriv en metode der anvender **binær søgning**.

Hint: der skal hverken anvendes array eller ArrayList, der skal blot søges blandt tallene 0 til n.

## Opgave 6
I `main` metoden i klassen `Opgave6Test` er der en lokal variable `spells` af type `ArrayList<Spell>`. `Spell` klassen har to attributter `name` og `description`.

```
+-----------------+
|      Spell      |
+-----------------+
| -name           |
| -description    |
+-----------------+
| +getName()      |
| +getDescription()|
+-----------------+
```

Lav en metode der givet en streng søger `spells` igennem og returnerer den `Spell` hvis navn matcher input og `null` ellers. `ArrayList`en af `Spell` er sorteret alfabetisk på navn.

Tilføj funktionalitet, så man kan indtaste et navn på en spell, og få udskrevet beskrivelsen hvis den findes.

Eksempler på navne er Silencio, Riddikulus og Ascendio.

## Opgave 7
Lav en metode der givet en streng `s`, og et positivt tal `k`, kan afgøre om der findes `k` på hinanden følgende ens karakterer i `s`. Du skal anvende princippet i Strengsøgning.

F.eks. er `kens(”Jubiiii”,4)` sandt hvorimod `kens(”Jubiiii”,5)` er falsk.
