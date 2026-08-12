package co.edu.unac.poo2.cl04.ej02;

public class Consulta {

    public void finalizar() {

        ConsultaRepository.consultarValor();
        FacturacionService.generarFactura();
        PagoService.registrarPago();
        NotificacionService.enviarCorreo();
        ConsultaRepository.guardarConsulta();
    }
}
