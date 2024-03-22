package prog2.model;

/**
 *
 * @author lauraigual
 */
public class Incidencia {

    public static enum TipusIncidencia {
        Reparacio,
        Objecte,
        Tancament
    };

    private int num;
    private TipusIncidencia tipus;
    private Via via;
    private String data;

    public Incidencia(int num, TipusIncidencia tipus, Via via, String data) {
        this.num = num;
        this.tipus = tipus;
        this.via = via;
        this.data = data;
    }

    public int getNum() {
        return num;
    }

    public TipusIncidencia getTipus() {
        return tipus;
    }

    public Via getVia() {
        return via;
    }

    public String getData() {
        return data;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setTipus(TipusIncidencia tipus) {
        this.tipus = tipus;
    }

    public void setVia(Via via) {
        this.via = via;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     * Retorna l'il·luminació de la via en format string
     *
     * @return
     */
    public String getIluminacioVia() {
        String iluminacio = "";
        switch (tipus) {
            case Reparacio:
                iluminacio = "100%%";
                break;
            case Objecte:
                iluminacio = "50%%";
                break;
            case Tancament:
                iluminacio = "0%%";
                break;
        }
        return iluminacio;
    }

    @Override
    public String toString() {
        return "Incidencia{" + "num=" + num + ", tipus=" + tipus + ", via=" + via + ", data=" + data + '}';
    }
}