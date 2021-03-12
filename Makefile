SRCDIR = src
BUILDDIR = build
PKGDIR = de/dhbw/todolist
PKG = de.dhbw.todolist
MAINCLASS = TodoList
SOURCES = Aufgabe.java Liste.java TodoList.java Priority.java Tag.java Color.java
CLASSES := $(patsubst %.java, %.class, $(SOURCES))
SOURCEFILES := $(patsubst %.java, $(SRCDIR)/$(PKGDIR)/%.java, $(SOURCES))

run: all
	cd $(BUILDDIR) && java $(PKG).$(MAINCLASS)

all:
	javac -d $(BUILDDIR) $(SOURCEFILES)

clean:
	rm -rf $(BUILDDIR)
