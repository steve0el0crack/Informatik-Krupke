Thema: Lineare Datenstrukturen

Datenstruktur: Warteschlangen (Queue)
-> Entspricht eine Akumulierung von Elemente, die miteinander eine bestimmte Beziehung halten; nähmlich Windhundverfahren oder andere Dimension (Maßnahme) des Elementes, die gemessen werden könnte.

Häufige Methoden:
-> push(Elemente E) Neues Element in dem "Schlang" hinzufügen
-> pop() Das vorderste Element aus der Qeue entfernen und zurückliefern.

* Diese Erklärung finden sie unter den Link https://moodle.aloisiuskolleg.de/mod/book/view.php?id=5657

In diesem Projekt wird versucht, eine Implementation dieses Konzepts aufzubauen. Außerdem werden folgende Fragen beantwortet:
; Mithilfe welcher Datenstruktur ist die Wartenschlange hier umgesetzt worden?
 Mithilfe von Arrays (*objs* attribute in der Klasse Queue)
; Erklären Sie, welche Bedeutung den Attributen der Klasse Queue jeweils zukommt.
 Es gibt numElements, der uns sagt, wie viele Elemente an dieser Zeit in der Queue sich befinden. Dann maxNumElements, was die Maximale Anzahl von Elemente entspricht, und zum Schluss sind die "Zeiger" start und end; die eine Ordnung zu den Elemente und dem Array -im Allgemein- ergibt.
; Erklären Sie die Funktionsweise der Methoden push(...) und pop()!
 Die Methode "push" vergrößert erstmal die Queue, wenn die maximale Anzahl von Elemente schon drin sind. Und dann fügt die neue Elemente am Ende des Arrays. Auf der anderen Seite, "pop" überprüft dass es überhaupt eine Elemente in der Queue sich befindet; nur dann gibt uns die letzte Elemente zurück.
; Erklären Sie, wie die Methode increaseArraySize() arbeitet. Erklären Sie insbesondere die Rolle von fillIndex und gehen Sie auf den Unterschied von ++fillIndex und fillIndex++ ein.
 Die Methode increaseArraySize() hauptsächlich macht folgendes: "tmps" wird wie eine zeitliche "Array" benutzt (1.5 Malen größer als "objs"), in dem alle Elemente aus objs hingefügt werden, durch eine schleife. Also, die alle werden kopiert. Und am Ende dieser Methode wird die Referenz von diesem zeilichen Variabel auf objs umgesetzt, damit naher keine größe Veränderung zu sehen bleibt.
 Die zwei Möglichkeiten (++fillIndex und fillIndex++) erhöhen die Variabel -integer- "fillIndex", also meinen dasselbe als fillIndex = fillIndex + 1. Aber die kleine Unterschied liegt daran, dass die erste (++fillIndex) macht die Erhöhung vor der Evaluation der Expression. Und fillIndex++ macht die gleiche Erhöhung nach der Evaluation. Praktish, das bedeutet dass ++fillIndex wird fillIndex + 1 zurückgeben, und ++fillIndex nur "fillIndex" ohne irgendeiner Veränderung.

Das "Tree" des Projektes können sie unten schauen:

Queue/
├── Element.java
├── Queue.java
├── README.TXT
├── TestBed.java
└── Queue-Problem.pgn

Die Erklärungen von jeder java Klasse (.java) finden sie auf der Klasse genau in der Form eines Kommentares.

Um Schluss mit diesem Projekt zu machen, muss ich sagen dass die Methode IncreaseArraysize() nicht ganz optimal ist, da am Ende wird der Queue 29 Malen vergrößert, und 1215487 Stellen haben; wenn nur 1000000 benötigt wurden (das finden sie in Queue-Problem.pgn).
