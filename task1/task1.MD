# Das ist eine Wiederholung der objektorientierten Konzepte.

Bitte versuche als Übung alles in Markdown zu beantworten. Hier ist ein [Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

1. Was ist das Ziel der Objektorientierung?

AW: Programme zu strukturieren und Funktionalität bereitzustellen
 * 

2. Gibt es OOP nur in Java?

AW: Objektorientierte Programmiersprachen

    Java.
    JavaScript.
    Python.
    C++
    Visual Basic . NET.
    Ruby.
    Scala.
    PHP.
 * 

3. Was ist der Unterschied zwischen Objekt und Klasse?

AW: Klasse beschreibt die Eigenschaften und die Methoden der Objekte, Objekte sind dagegen im   wesentlichen kleine Klumpen von member-variablen, die sich so verhalten, wie ihre Klasse es ihnen vorschreibt.
 * 

4. Wie erzeuge ich eine neue Instanz? (Welches Schlüsselwort gibt es dafür)

AW: Keyword new
    Keks keks1 = new Keks();
 * 
 
5. Was bedeutet das Schlüsselwort `static` und wo kann es überall verwendet werden?

AW: zeigt an, das etwas direkt zu einer Klasse gehört: Ein statisches Feld gehört zu einer Klasse; eine statische Methode ebenso.

Static kann bei Feldern, Methoden und Statements verwendet werden und kennzeichnet  Programmstrukturen, die nicht an ein Objekt gebunden sind.  
 * 

6. Wozu dient die Vererbung?

AW: Vererbung gibt uns die Möglichkeit, Eigenschaften vorhandener Klassen auf neue Klassen zu übertragen.
 * 

7. Kann in Java von mehreren Klassen geerbt werden? Wenn ja wie?

AW: Java ist auf eine Einfachvererbung begrenzt, das heißt eine neue Klasse kann maximal von einer anderen Klasse abgeleitet werden.
Mit Hilfe der Interfaces wird eine Mehrfachvererbung geschaffen.
 * 

8. Welche Vererbungshierarchien kennst du? (Ein Bild reicht aus)

AW: 

Class     Interface     Interface
  |           |            |
  extends    impements    impements
         \    |          /
            Class

            und:

Interface   Interface
      |        |
      extends  extends
         \    /
         Interface            

  * 
9. Was bedeutet Casten und wie ist die Syntax in Java dafür?

AW: Typeumwandlung. Einen Datentypen in einen andern Datentyp (zwingen) zum Umwandeln. z.b. 
int in einen long. Syntax: Datentyp_neu Variablenname=(Datentyp_neu) Variable mit Datentyp_alt
  * 

10. Was ist der Unterschied zwischen explizieten und implizieten Typecasting?

AW: Implizites Casting: Kein Operator notwendig und wird von Java automatisch erledigt.
    int zahl = 10;
    System.out.println(zahl); // 10
    double zahl2 = zahl; 
    System.out.println(zahl2); // 10.0

    Explizites Casting: Wir müssen "von Hand" die Typumwandlung mithilfe des Cast-Operators durchführen.
    double zahl = 7.9;
    int zahl2 = (int) zahl;  
    System.out.println(zahl2); // 7
 * 

11. Erkläre die folgenden Schlüsselwörter: `super`, `this`

AW: Konstruktoren der Oberklasse aufgerufen werden sollen, die Parameter besitzen; Objekt-Methoden oder Attribute der Oberklasse und Unterklasse gleiche Namen haben. Zur Unterscheidung der aktuellen Klasse von der Oberklasse dient das Schlüsselwort super.

This adressiert die Objekte(z.B Methoden und Variablen) der Erzeugerklasse.
 * 
12. Für was dient der `instanceof` Operator. Gib ein sinnvolles Beispiel.

AW: Der Operator instanceof wird verwendet, um zu prüfen, ob das Objekt eine Instanz des angegebenen Typs (Klasse oder Unterklasse oder Schnittstelle) ist.

Bsp: Simple1 s=new Simple1();  
 System.out.println(s instanceof Simple1);//true  
 * 

