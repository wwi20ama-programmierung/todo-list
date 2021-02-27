# Aufgaben zur Todo-Liste

Hier werden Aufgaben beschrieben, die sich im Laufe der Entwicklung der Todo-Liste ergeben.
Die Aufstellung erhebt keinen Anspruch auf Vollständigkeit, es kann sein, dass sich Aufgaben
in der Vorlesung ergeben, die auch sofort gelöst werden.

## Inhaltsverzeichnis

- [Aktuelle Aufgaben](#aktuelle-aufgaben)
- [Zusatzaufgaben](#zusatzaufgaben)
- [Erledigte Aufgaben](#erledigte-aufgaben)

<a name="aktuelle-aufgaben"></a>
## Aktuelle Aufgaben
Diese Aufgaben in diesem Abschnitt sollten zu dem Zeitpunkt, zu dem sie hier auftauchen, im Großen und Ganzen mit
jeweils aktuellen Kenntnisstand aus der Vorlesung lösbar sein.

### Programmabsturz beheben
Das derzeitige Programm enthält die Basis-Implementierung aller Klassen und einen Beispiel-Ablauf
in der `main()`, der demonstriert, wie das Hinzufügen von Aufgaben zur Liste gedacht ist.
Das Programm compiliert, stürzt aber beim Ausführen ab, weil die Klassen nicht sauber initialisiert
werden.

**Aufgabe**: Schreiben Sie Konstruktoren für alle Klassen, die alle Attribute initialisieren.

### Anzeige/String-Ausgabe von Listen und Aufgaben
Das derzeitige Programm erstellt Aufgaben und fügt sie zur Liste hinzu.
Es ermöglicht aber noch nicht, die Liste auch auf dem Bildschirm auszugeben.
Dies wäre eine wesentliche Voraussetzung, um aus der Ansammlung von Klassen
ein benutzbares Programm zu machen.

**Aufgabe**:
Fügen Sie Methoden `toString()` zu den Klassen `Liste` und `Aufgabe` hinzu,
damit Listen- und Aufgaben-Objekte mittels `System.out.println()` ausgegeben werden können.

### Benutzbares Programm erstellen
Wenn das Programm nicht mehr abstürzt, ist es an der Zeit, ein Hauptprogramm zu erstellen,
das eine Liste anlegt, den Benutzer nach Aufgaben fragt, zwischendurch diese Aufgaben anzeigt
und die Gelegenheit gibt, die Aufgaben auch wieder zu löschen.

**Aufgabe**:
Schreiben Sie ein solches Hauptprogramm.

*Hinweise:*
- Es ist ggf. sinnvoll, das Hauptprogramm in eine separate Funktion zu schreiben und es nicht
  direkt in `main()` zu implementieren. So ist es später leichter, das Hauptprogramm auch mal
  auszukommentieren bzw. zu ersetzen.

### Refaktorierung
Auch wenn die obigen Funktionen mit dem bisherigen Stand des Projekts umsetzbar sind,
sind einige Dinge noch unschön.
Bspw. ist es sicherlich sinnvoll, eine Funktion zum Löschen von Aufgaben zu haben.

**Aufgabe**:
Ergänzen Sie Funktionen, die Sie für sinnvoll halten und/oder refaktorieren Sie
vorhandene Funktionen.

### Erweiterung der `Aufgabe` um weitere Eigenschaften
**Aufgabe:**
Fügen Sie weitere Eigenschaften zu den Aufgaben hinzu. Beispiele:
- Tags, nach denen sortiert oder gefiltert werden kann.
- Prioritäten (z.B. "Wichtig"/"Unwichtig")
- "erledigt"-Marker


<a name="zusatzaufgaben"></a>
## Zusatzaufgaben
Die Aufgaben in diesem Abschnitt sind i.d.R. nicht "mal eben" mit Vorlesungs-Bordmitteln zu erledigen.
Teilweise ist die Einarbeitung in weitere Themen notwendig, teilweise sind sie aufwändiger oder
unscharf formuliert, so dass weiteres Nachdenken erforderlich ist.

Manche Aufgaben greifen auch dem Vorlesungsstoff vor.

### Sortieren und Filtern von Listenelementen
**Aufgabe**:
Fügen Sie der Klasse `Liste` Funktionen zum Sortieren der Elemente hinzu:
- Sortieren nach Beschreibungstext
- Sortieren nach Datum
  - *Hinweis*: Falls nicht alle Aufgaben Daten haben, wirkt sich das ggf. auf die Sortierung aus.
    Falls Ihnen das kompliziert vorkommt, gehen Sie schrittweise vor:
    Gehen Sie beim Sortieren zunächst davon aus, dass alle Elemente ein Datum haben und
    testen Sie Ihre Funktion unter dieser Annahme.
    Berücksichtigen Sie den Sonderfall anschließend in einem zweiten Schritt.
- Filtern nach Tags oder Prioritäten, falls Sie so etwas schon implementiert haben.

### Testfunktionen für die Listen- und Aufgabenklassen
Es ist auf Dauer mühsam, eine selbstgeschriebene Anwendung nach jeder Änderung
immer wieder manuell zu testen.
Sie sollten sich also ein Testprogramm schreiben, das die Tests automatisiert.

**Aufgaben**:
- Schreiben Sie sich eine Reihe von Hilfsfunktionen, die das Testen vereinfachen:
  - Eine Funktion, die eine `Liste` mit ein paar Aufgaben erzeugt, ihre String-Repräsentation
    bestimmt und mit einem String vergleicht, um zu prüfen, ob der Listenaufbau korrekt
    funktioniert hat.
    Für maximale Flexibilität kann die Funktion sowohl die Aufgaben als auch den erwarteten
    String als Parameter erwarten.
  - Ggf. eine entsprechende Funktion für eine `Aufgabe`. 
  - Eine Funktion, die zwei Listen miteinander vergleicht und als `boolean`
    zurückliefert, ob sie gleich sind.
    Diese Funktion kann – je nach restlicher Architektur – Teil der Listenklasse
    oder auch separat (*frei*) sein. 
- Nutzen Sie diese Funktionen, um Tests zu schreiben:
  - Einen Test, der verschiedene Aufgaben und Listen erzeugt und deren String-Repräsentation prüft.
  - Einen Test, der verschiedene Listen erzeugt, sie sortiert und die Sortierung prüft.




<a name="erledigte-aufgaben"></a>
## Erledigte Aufgaben
- Noch nichts geschafft :-(