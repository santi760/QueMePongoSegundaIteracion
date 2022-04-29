import java.util.Objects;

public class Material {

    private Trama trama;
    private Color colorPrincipal;
    private Color colorSecundario;
    private TipoMaterial material;


    public enum Trama {
        LISA, RAYADA, CON_LUNARES, A_CUADROS, CON_ESTAMPADO;
    }

    public enum TipoMaterial {
        ACRILICO,ALGODON,CUERO,NYLON,LANA,LYCRA,POLIESTER,SEDA;
    }

    public Material(Trama trama, Color colorPrincipal, Color colorSecundario, TipoMaterial material) {
        this.trama = trama;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.material = material;
    }

}