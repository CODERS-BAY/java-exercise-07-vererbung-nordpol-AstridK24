# Task1 Santa's App :santa:

Die Digitalisierung hat nun auch den Nordpol erreicht. Aus diesem Grund möchte Santa, dass die Kinder ihre Wunschzettel digital schreiben. Das erleichtert auch die Arbeit der
Elfen, diese müssen jetzt nicht mehr unleserliche Handschriften entziffern und können direkt mit dem Beladen des Schlittens starten.

# Requirements
Santa hat folgende Anforderungen definiert:
* Es soll ein Login möglich sein der zwischen `Elf`, `Santa` und `Child` unterscheidet.
* Die Anwendung soll rein im Terminal möglich sein, denn die Bedienung eines Touchpads oder Maus ist mit Handschuhen sehr schwierig.
* Leider konnte sich Santa nicht für eine Datenbank entscheiden, deshalb reicht es aus Daten in Arrays zu speichern. 
* Es gibt eine fixe Anzahl von Kindern und Geschenken. Ein Geschenk pro Kind. Die Krise betrifft auch Santa....

## View Child
* Das Kind soll hier seine Daten eingeben und das Geschenk, welches es sich wünscht.
* Diese Daten sollen in Arrays gespeichert werden. Die Geschenke werden üblicherweise in einem Lager abgelegt, bevor der Schlitten beladen wird.

## View Elf
* Elfen sind dazu da den Schlitten zu beladen. 
* Sind sortieren auch die Geschenk nach Wohnort des Kindes um eine schnellere Verteilung zu ermöglichen.
* Vielleicht können Elfen noch weitere Aufgaben erledigen? 
* Alle Fähigkeiten der Elfen werden in der `ElfUtil` Klasse gespeichert.
* Elfen sollen natürlich auch einen Namen usw. besitzen.

## View Santa
* Santa sieht alle Geschenke der Kinder und die Kinder selbst.
* Außerdem sieht er, ob der Schlitten schon beladen wurde oder nicht.
* Er kann auch nach dem Namen eines Kindes suchen und sehen was es sich wünscht.

--- 
Bitte verwende das Vorgegeben Skeleton. Erweitere es um weitere Klassen um maximale Abstraktion zu erhalten. Setzte auf die Vererbung, um Code Duplizierung zu verhindern.

> Versuche zuerst eine funktionierende Software zu entwickeln und anschließend zu verbessern. 
