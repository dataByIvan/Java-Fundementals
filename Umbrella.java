{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 // Online Java Compiler\
// Use this editor to write, compile and run your Java code online\
\
public class Umbrella \{\
    private boolean wrapped;\
    private boolean open;\
    \
     public Umbrella()\{ //constructor\
         wrapped = true;\
         open = false;\
     \}\
     \
     public void unwrap()\{\
         if(wrapped)\{\
             wrapped = false;\
             System.out.println("Umbrella is unwrapped now!");\
         \}else\{\
             System.out.println("Umbrella is already unwrapped!");\
         \}\
     \}\
     \
     public void open()\{\
         if(wrapped)\{\
             System.out.println("Umbrella cannot be opened when wrapped!");\
         \}else\{\
             open = true;\
             System.out.println("Umbrella is opened!");\
         \}\
     \}\
     \
     public void wrap()\{\
         if(wrapped)\{\
             System.out.println("The umbrella is already wrapped");\
         \}else if(open)\{\
             System.out.println("Cannot be wrapped while opened");\
         \}else\{\
             wrapped = true;\
             System.out.println("Umbrella is wrapped now!");\
         \}\
     \}\
     \
     public void close()\{\
         if(open)\{\
             open = false;\
             System.out.println("The umbrella is closed.");\
         \}else\{\
             System.out.println("Umbrella is already closed");\
         \}\
     \}\
     \
    public static void main(String[] args) \{\
        Umbrella myUmbrella = new Umbrella();\
        /*\
        State: \
        wrapped = true;\
        open = false;*/\
        // myUmbrella.unwrap();\
        myUmbrella.open();\
        myUmbrella.close();\
        myUmbrella.wrap();  \
    \}\
\}\
\
/*\
Output:\
Umbrella cannot be opened when wrapped!\
Umbrella is already closed\
The umbrella is already wrapped\
*/}