package lagashuniversity;


// Interfaz para los métodos del Controlador del Parquimetro
public interface IControladorParquimetro {
    
    public String getPatente();
    public int getMinutosEstacionado();
    public int getCentavosPorHora();
    public void setCentavosPorHora(int centavosPorHora);
    public void autoDetectado(String patente);
    public void avanzarMinuto();
    public void estacionamientoFinalizado();
}
