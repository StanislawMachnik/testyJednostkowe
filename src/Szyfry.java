import java.util.ArrayList;

public class Szyfry {
    public static String szyfrujPrzestawieniowo(String slowoDoSzyfrowania, int kluczSzyfru){
        if(kluczSzyfru > 26){
            kluczSzyfru -= 26;
        }
        String zaszyfrowaneSlowo = "";
        ArrayList<Character> alfabet = new ArrayList<>();

        for(char znak = 'a'; znak <= 'z'; znak++){
            alfabet.add(znak);
        }

        for(int i = 0; i < slowoDoSzyfrowania.length(); i++){
            if(!String.valueOf(slowoDoSzyfrowania.charAt(i)).equals(" ")){
                for(int j = 0; j < alfabet.size(); j++){
                    if(slowoDoSzyfrowania.charAt(i) == alfabet.get(j)){
                        if(j + kluczSzyfru > 26){
                            kluczSzyfru -= 26;
                        }
                        zaszyfrowaneSlowo += String.valueOf(alfabet.get(j + kluczSzyfru));
                    }
                }
            }
            else{
                zaszyfrowaneSlowo += " ";
            }

        }

        return zaszyfrowaneSlowo;
    }
}
