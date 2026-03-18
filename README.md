# Übung 19 - Rekursionen

## 1. Aufgabe

Schreiben Sie eine rekursive Methode `papierschnitt`, die alle Möglichkeiten visualisiert, wie ein Papierbogen der ganzzahligen Länge `n` in Papierbahnen der Länge `1` und `2` geschnitten werden kann. D.h. man stelle eine natürliche Zahl `n` auf alle möglichen Weisen als Summe $n = \sum_{j = 1}^{k}{\sigma_j}$ mit Summanden $\sigma_j \in \{1,2\}$ dar. Dabei soll die Reihenfolge beachtet werden. Für `n = 4` gibt es beispielsweise 5 Möglichkeiten:
- 4 = 2 + 2
- 4 = 2 + 1 + 1
- 4 = 1 + 2 + 1
- 4 = 1 + 1 + 2
- 4 = 1 + 1 + 1 + 1

## 2. Aufgabe

Das Sierpinski-Dreieck-Algorithmus ist ein bekanntes Beispiel für einen fraktalen Musterbildungsalgorithmus. Dabei wird ein Dreieck in immer kleinere Dreiecke unterteil, sodass ein Muster entsteht. Im Folgenden finden Sie eine Lösungsidee: 
- **Basisfall:** Der einfachste Fall tritt auf, wenn die Tiefe (oder Rekursionsebene) gleich `0` ist. In diesem Fall zeichnen wir ein einzelnes gleichseitiges Dreieck mit den gegebenen Eckpunkten. 
- **Rekursionsschritt:** Wenn die Tiefe größer als `0` ist, teilen wir das aktuelle Dreieck in drei kleinere gleichseitige Dreiecke auf, indem wir die Mittelpunkte der Seiten des Dreiecks berechnen. Diese neuen Dreiecke sind die nächsten Stufen der Sierpinski-Dreiecksstruktur.  
- **Rekursion:** Wir rufen den Algorithmus nun rekursiv für jedes der drei kleineren Dreiecke auf. Die Tiefe wird in jedem rekursiven Schritt um eins verringert. Dadurch wiederholen wir den Prozess, bis die Tiefe den Basisfall erreicht. 
- **Abbruchbedingungen:** Der Basisfall tritt ein, wenn die Tiefe gleich `0` ist. In diesem Fall zeichnen wir das kleine Dreieck und beenden die Rekursion. 

Schreiben Sie nun eine rekursive Methode, welchen den Algorithmus umsetzt. 
