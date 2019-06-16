# LAB REPORT

	-Abgabe 4
	-Joachim Pollanz
	-Ulrike Ozim
	-Repository: https://github.com/minimacro1305/19-Abgabe04-Pollanz-Ozim

## VORGEHEN
Taskliste wurde erstellt.

Das Queue Beispiel wurde auf das repository geladen.

Durch debuggen des Beispiel Codes konnten 3 Fehler und eine „Anpassung“ gefunden werden diese wurden im Code als Kommentare beschrieben wo sie sind und was sie waren. zB: `//size() == 0 is wrong needs to be !=`

javaDoc kommentare wurden für den src code erstellt und die maven site einbindung wurde durchgeführt durch veränderungen in der pom.xml

StringQueueTest klasse wurde vollständig implementiert und mit kommentaren versehen. Die Coverage liegt bei 100% laut IntelliJ und unserer Einschätzung.

In der pom.xml wurde das maven surefire report plugin hinzugefügt um die test ergebnisse mit maven site ersichtlich zu machen Log4j error und info in den code geschrieben zB. `public StringQueue(int maxSize){		
		logger.info("constructor with maxSize " + maxSize);
		this.maxSize = maxSize;
	}` in der pom als dependency hinzugefügt und eine log4j2.properties file in den Klassenpfad gelegt


## LINKS / LITERATUR

## PICTURES

![TestDocs](https://github.com/minimacro1305/19-Abgabe04-Pollanz-Ozim/blob/master/pics/TestDocs.png?raw=>)
![javaDoc](https://github.com/minimacro1305/19-Abgabe04-Pollanz-Ozim/blob/master/pics/javaDocs.png?raw=>)
![log4j.png](https://github.com/minimacro1305/19-Abgabe04-Pollanz-Ozim/blob/master/pics/log4j.png?raw=>)
![mavenSite.png](https://github.com/minimacro1305/19-Abgabe04-Pollanz-Ozim/blob/master/pics/mavenSite.png?raw=>)



 
