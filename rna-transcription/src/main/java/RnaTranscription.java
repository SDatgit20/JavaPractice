class RnaTranscription {

    String transcribe(String dnaStrand) {
        String s="";
        char v='z';
        for(int i=0;i<dnaStrand.length();i++){
            if(dnaStrand.charAt(i)=='G')
                v='C';
            else if(dnaStrand.charAt(i)=='C')
                v='G';
            else if(dnaStrand.charAt(i)=='T')
                v='A';
            else if(dnaStrand.charAt(i)=='A')
                v='U';
           // dnaStrand.charAt(i)=v;
            s+=v;
            }
        return s;
    }

}
