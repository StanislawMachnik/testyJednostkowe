public class Szyfry {
    public static String szyfrujPrzestawieniowo(String slowoDoSzyfrowania){
        String zaszyfrowaneSlowo = "";
        for(int i = 0; i < slowoDoSzyfrowania.length() - 1; i = i + 2){
            zaszyfrowaneSlowo = zaszyfrowaneSlowo + slowoDoSzyfrowania.charAt(i + 1) + slowoDoSzyfrowania.charAt(i);
        }
        if(slowoDoSzyfrowania.length() % 2 != 0){
            zaszyfrowaneSlowo = zaszyfrowaneSlowo + slowoDoSzyfrowania.charAt(slowoDoSzyfrowania.length() - 1);
        }
        return zaszyfrowaneSlowo;
    }
}
