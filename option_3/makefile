JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
        Main.java \
        Controller.java \
        Controller1.java \
        Controller2.java \
        Controller3.java \
        Controller4.java \
        Transaction.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
