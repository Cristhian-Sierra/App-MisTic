package Modelo;


public class Telefono extends Persona {
    private int numero;
    private int id_cliente;
    private String uso;
    
    public Telefono(int numero, int id_cliente, String uso){
        super(id_cliente);
        this.numero = numero;
        this.uso = uso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
        
}
