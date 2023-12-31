package futbol;

public class Jugador extends Futbolista{

    public short golesMarcados;
    public byte dorsal;

    public Jugador(){
        super();
        this.dorsal =  7;
        this.golesMarcados = 289;
    }
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }


    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() +
                " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
    }

    @Override
    public boolean jugarConLasManos(){
        return false;
    }

    @Override
    public int compareTo(Object e) {
        if (e instanceof Jugador){
            Jugador jugador = (Jugador) e;
            return Math.abs(this.getEdad() - jugador.getEdad());
        } else {
            return 0;
        }
    }
}
