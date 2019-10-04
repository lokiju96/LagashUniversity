package lagashuniversity;

//Implementacion de la interfaz ControladorParquimetro
import javax.swing.JOptionPane;

public class Parquimetro implements IControladorParquimetro {

    private String patente;
    private int minutosEstacionado;
    private int centavosPorHora;

    public Parquimetro(int centavosPorHora) {
        this.centavosPorHora = centavosPorHora;
        this.patente = null;
        this.minutosEstacionado = 0;
    }

    @Override
    public String getPatente() {
        if (patente == null) {
            return "null";
        }
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
        if (this.patente == null) {
            minutosEstacionado = 0;
            this.patente = patente;
            JOptionPane.showMessageDialog(null, "Auto detectado: " + patente);
        }else{
            JOptionPane.showMessageDialog(null, "Ya hay un vehículo en este parquímetro");
        }
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
        if (patente != null) {
            String mail = ServicioExterno.obtenerEmailPorPatente(patente);
            int importe = ((int) Math.ceil((double) minutosEstacionado / 60.00)) * centavosPorHora;
            if (mail != null) {
                String cuerpo = ServicioExterno.CUERPO;
                cuerpo = cuerpo.replaceAll("PATENTE", patente).replaceAll("IMPORTE", String.valueOf(importe));
                ServicioExterno.enviarEmail(ServicioExterno.ASUNTO, cuerpo, mail);
            }
            JOptionPane.showMessageDialog(null, "Estacionamiento finalizado\nEl usuario debe pagar "+importe+" centavos");
            patente = null;
            minutosEstacionado = 0;
        } else {
            JOptionPane.showMessageDialog(null, "No hay nadie usando el Parquimetro");
        }
    }
}
