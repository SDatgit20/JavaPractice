class TwelveDays {
    String gift[]={"a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};
    String lineNumber[]={"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    
    String verse(int verseNumber) {
        String generalString="On the "+lineNumber[verseNumber-1]+" day of Christmas my true love gave to me: ";
        if(verseNumber==1)
            return generalString+gift[0]+"."+"\n";
        else
        {
        for(int i=verseNumber-1;i>0;i--){
            generalString+=gift[i]+", ";
        }
        generalString+="and "+gift[0]+".";
            return generalString+"\n";
        }
    }

    String verses(int startVerse, int endVerse) {
        String songVerses=new String();
       for(int i=startVerse;i<endVerse;i++){
           songVerses+=verse(i)+"\n";
       }
        songVerses+=verse(endVerse);
        return ans;
    }
    
    String sing() {
        String song=verses(1,12);
        return song;
    }
}
