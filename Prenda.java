import java.util.Objects;

public class Prenda {
    TipoDePrenda tipoDePrenda;
    Material material;


    public Prenda(TipoDePrenda tipo, Material.Trama trama, Color colorPrincipal, Color colorSecundario, Material.TipoMaterial material) {
        this.tipoDePrenda = tipo;
        this.material = new Material(trama, colorPrincipal, colorSecundario, material);
    }

    public TipoDePrenda.Categoria categoria() {
        return tipoDePrenda.getCategoria();
    }

}
