SRCDIR = src
BUILDDIR = build
PKGDIR = de/dhbw
PKG = de.dhbw
MAINCLASS = Programm
SOURCES = Aufgabe.java Benutzer.java Datum.java Liste.java Programm.java
CLASSES := $(patsubst %.java, %.class, $(SOURCES))
SOURCEFILES := $(patsubst %.java, $(SRCDIR)/$(PKGDIR)/%.java, $(SOURCES))

run: all
	cd $(BUILDDIR) && java $(PKG).$(MAINCLASS)

all:
	javac -d $(BUILDDIR) $(SOURCEFILES)

clean:
	rm -rf $(BUILDDIR)
