public class Auto {
    private String marca;
    private String modello;
    private int anno;
    public String colore;

    
    public Auto(String marca, String modello, int anno, String colore) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.colore = colore;
    }
 
 
    
 
    public void setColore(String colore) {
        this.colore = colore;
    }
 
 
    
 
 
    public void setAnno(int anno) {
        if (anno > 0) { // Controllo per evitare età negative
            this.anno = anno;
        }
    }

    
 
 
    // Metodo per mostrare i dettagli dello studente
    public void mostraInfo() {
        System.out.println("Marca: " + marca + " ,Modello: " + modello + " ,Anno: " + anno + " ,Colore: " + colore);
    }
 }