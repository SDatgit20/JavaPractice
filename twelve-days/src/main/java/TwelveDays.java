class TwelveDays {
    String gift[]={"a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};
    String lineNumber[]={"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    
    String verse(int verseNumber) {
        String gen="On the "+lineNumber[verseNumber-1]+" day of Christmas my true love gave to me: ";
        if(verseNumber==1)
            return gen+gift[0]+"."+"\n";
        //else if(verseNumber>12)
        else
        {
        for(int i=verseNumber-1;i>0;i--){
            gen+=gift[i]+", ";
        }
        gen+="and "+gift[0]+".";
            return gen+"\n";
        }
    }

    String verses(int startVerse, int endVerse) {
        String ans=new String();
       for(int i=startVerse;i<endVerse;i++){
           ans+=verse(i)+"\n";
       }
        ans+=verse(endVerse);
        return ans;
    }
    
    String sing() {
        String song=verses(1,12);
        return song;
    }
}
