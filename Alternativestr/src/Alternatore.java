public class Alternatore {

    private String prima;
    private String seconda;


    public Alternatore(String prima, String seconda) {
        this.prima = prima;
        this.seconda = seconda;
    }


    public String getPrima() {
        return prima;
    }

    public void setPrima(String prima) {
        this.prima = prima;
    }

    public String getSeconda() {
        return seconda;
    }

    public void setSeconda(String seconda) {
        this.seconda = seconda;
    }

    public String alterna() {
        StringBuilder sb = new StringBuilder();
        int min = Math.min(prima.length(), seconda.length());

        for (int i = 0; i < min; i++) {
            sb.append(prima.charAt(i));
            sb.append(seconda.charAt(i));
        }


        if (prima.length() > min)
            sb.append(prima.substring(min));
        else if (seconda.length() > min)
            sb.append(seconda.substring(min));

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Alternatore{prima='" + prima + "', seconda='" + seconda + "'}";
    }
}