package lagashuniversity;

//Implementacion de la interfaz ControladorParquimetro
public class Parquimetro implements IControladorParquimetro {

    private String patente = null;
    private int minutosEstacionado = 0;
    private int centavosPorHora;

    public Parquimetro(int centavosPorHora) {
        this.centavosPorHora = centavosPorHora;
    }

    @Override
    public String getPatente() {
        return patente;
    }

    @Override
    public int getMinutosEstacionado() {
        return minutosEstacionado;
    }

    @Override
    public int getCentavosPorHora() {
        return centavosPorHora;
    }

    @Override
    public void setCentavosPorHora(int centavosPorHora) {
        this.centavosPorHora = centavosPorHora;
    }

    //Cuando se detecta un vehiculo, se guarda la patente en el parquimetro
    //y se reinicia el contador de minutos
    @Override
    public void autoDetectado(String patente) {
        minutosEstacionado = 0;
        this.patente = patente;
    }

    //Mientras haya un vehiculo en el parquimetro, este método hace que avance
    //un minuto cada vez que es llamado
    @Override
    public void avanzarMinuto() {
        if (patente != null) {
            minutosEstacionado++;
        }
    }

    //Cuando el vehiculo abandona el parquimetro, se procede a calcular el importe
    //a abonar y se envia un email al dueño
    @Override
    public void estacionamientoFinalizado() {
        String mail = ServicioExterno.obtenerEmailPorPatente(patente);
        if (mail != null) {
            String cuerpo = ServicioExterno.CUERPO;
            int importe = ((int) Math.ceil((double) minutosEstacionado / 60.00)) * centavosPorHora;
            cuerpo = cuerpo.replaceAll("PATENTE", patente).replaceAll("IMPORTE", String.valueOf(importe));
            ServicioExterno.enviarEmail(ServicioExterno.ASUNTO, cuerpo, mail);
        }
        patente = null;
        minutosEstacionado = 0;
    }
}
