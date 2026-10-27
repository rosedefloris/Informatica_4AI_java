public class contaVocali {

    private String stringa;


    public contaVocali(String stringa) {
        this.stringa = stringa;
    }


    public String getStringa() {
        return stringa;
    }

    public void setStringa(String stringa) {
        this.stringa = stringa;
    }


    public int contaVocaliMinuscole() {
        int count = 0;
        for (int i = 0; i < stringa.length(); i++) {
            char c = stringa.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        return count;
    }

}