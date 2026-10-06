/*
Creare una classe GeneratoreAutoIncrementale che permetta di generare codici auto-incrementanti
formati da un prefisso alfabetico costante e da un numero intero, quest’ultimo che viene
incrementato di uno a ogni passo di generazione.
La classe deve contenere i seguenti metodi:
▶ un costruttore con un parametro che rappresenta la parte alfanumerica del codice e un
secondo parametro intero che indica il numero di cifre di cui deve essere costituita la
parte numerica. Se, ad esempio, il primo parametro fosse «ABC» e il secondo 4, i codici
generati sarebbero del tipo «ABC0001», «ABC0002», «ABC0003», ecc..
▶ il metodo genera che ritorna una stringa che rappresenta il nuovo codice generato. Ad
ogni chiamata a questo metodo la stringa ritornata deve avere un valore numerico
incrementato di un’unità rispetto al precedente, dove il primo codice generato dopo
la creazione dell’oggetto avrà come valore numerico 1. Se non fosse più possibile
incrementare il codice perché è stato esaurito lo spazio dei numeri (con 3 cifre, ad

esempio, si possono generare al massimo 999 codici diversi), allora ritornerà la stringa
«Codici esauriti».
▶ il metodo toString che ritorna una stringa contenente la parte alfanumerica e il valore
intero dell’ultimo codice generato dal metodo genera: un esempio potrebbe essere
«Prefisso: ABC ultimo valore generato: 342»
Dopo aver scritto la classe, scrivere un programma di test che mostri il funzionamento di tutti
i metodi definiti in precedenza.
Successivamente si realizzi un programma che, attraverso un menù di scelte, interagisca con
l’utente per permettergli di utilizzare le funzionalità offerte dalla classe
 */

public class GeneratoreAutoIncrementale {
    private String prefisso;
    private int cifre;
    private int contatore;

    public GeneratoreAutoIncrementale(String prefisso, int cifre){
        this.prefisso = prefisso;
        this.cifre = cifre;
        this.contatore =  contatore;
    }

    public String genera (){
        this.contatore +=1;
        int ValoreMassimo = 1;
        for (int i =0;i<this.cifre;i++){
            ValoreMassimo *=10;
        }
        ValoreMassimo -=1;

        if(this.contatore>ValoreMassimo){
            return "Codici eusauriti";
        }

        String numero= ""+this.contatore;
        int quantiZeri = this.cifre - this.contatore;
        String zeri= "";
        for (int i = 0;i<quantiZeri;i++){
            zeri+= "0";
        }

        return this.prefisso + zeri + numero;
    }

    @Override
    public String toString() {
        return "Prefisso: " + this.prefisso + " ultimo valore generato: " + this.contatore;
    }
}