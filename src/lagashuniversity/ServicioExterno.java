package lagashuniversity;

// Clase que se encarga del envio de emails al usuario del parquímetro
public class ServicioExterno {
    
    static String ASUNTO = "Ciudad de Buenos Aires - Parquímetros Inteligentes";
    static String CUERPO = "El valor a pagar por el vehiculo de patente PATENTE registrado a esta direccion de email es de IMPORTE centavos";
    
    //Metodo para enviar emails (no implementado todavia)
    static void enviarEmail(String asunto, String cuerpo, String destinatario){
        System.out.println("ASUNTO: "+asunto);
        System.out.println("CUERPO: "+cuerpo);
        System.out.println("DESTINATARIO "+destinatario);
    }
    
    //Metodo para conseguir el email de la patente enviada
    static String obtenerEmailPorPatente(String patente){
        if (patente.equals("AAA111")) {
            return "agustinminanvalero@hotmail.com";
        }
        if(patente.equals("BBB222")){
            return "agus21111996@hotmail.com";
        }
        return null;
    }
}
