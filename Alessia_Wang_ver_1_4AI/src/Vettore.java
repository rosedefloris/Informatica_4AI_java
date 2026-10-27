class Vettore {
    private Punto origine;
    private Punto vertice;


    public Vettore(Punto origine, Punto vertice) {
        this.origine = origine;
        this.vertice = vertice;
    }

    public Punto getOrigine() {
        return origine;
    }
    public Punto getVertice() {
        return vertice;
    }


    public double calcolaLunghezza() {
        double dx = vertice.getX() - origine.getX();
        double dy = vertice.getY() - origine.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }


    public void spostaOrigine(Punto p) {
       origine = p;
        this.origine = origine;
    }




    public boolean verificaOrigine(Punto p) {
        if(origine.getX() == p.getX() && origine.getY() == p.getY())  {
        return true;
        }
        else {
            return false;
        }
    }




    @Override
    public String toString() {
        return "Origine:" +origine+"  Vertice:" + vertice;
    }
}