package com.example.Quotes;

import java.util.Random;

public class Quote {

    private final String[] quotes={"Love means never having to say you're sorry.",
            "They may take our lives, but they'll never take our freedom!",
            "When you realize you want to spend the rest of your life with somebody, you want the rest of your life to start as soon as possible.",
            "If you let my daughter go now, that'll be the end of it. I will not look for you, I will not pursue you. But if you don't, I will look for you, I will find you, and I will kill you."};
    private final String[] shows={"Love Story","Braveheart","WHEN HARRY MET SALLY", "TAKEN"};
    public Quote(){}

    public String getQuotes() {
        Random random=new Random();
        int end=quotes.length;
        int num=random.nextInt(end-0)+0;
        System.out.println(num);
        return quotes[num];
    }
    public String getShows() {
        int num_shows=shows.length;
        String Lista="";
        for (int i = 0; i < num_shows; i++) {
            Lista+=" "+i+" "+shows[i]+" ";
        }
        return  Lista;
    }
    public String Specific(int i){
        return quotes[i];
    }
}