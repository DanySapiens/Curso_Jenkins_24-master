package com.mycompany.app;

import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;

class Saldo {
    String curpAhorrador = "RAGS960826HSLSLR01";
    double saldototal = 146107.46;
    double retiroimss97 = 15893.15;
    double retiroimss92 = 0.0;
    double cvimss = 36731.7;
    double cuotasocialimss = 43493.6;
    double viviendaimss97 = 86720.71;
    double viviendaimss92 = 0.0;
    double retiroissste92 = 0.0;
    double retiroissste08 = 0.0;
    double ahorrosolidario = 0.0;
    double cvissste = 0.0;
    double cuotasocialissste = 6761.9;
    double viviendaissste92 = 0.0;
    double viviendaissste2008 = 0.0;
    double bonopensionissste = 0.0;
    double aportavoluntariascortoplazo = 0.0;
    double complementariasretiro = 0.0;
    double ahorrolargoplazo = 0.0;
    double saldoentransito = 0.0;
    String fechainicio = "08/02/2023";
    String fechafin = "08/02/2023";
}

class Movimiento {
    String fecha;
    String descripcion;
    double importe;
    String tipo;

    Movimiento(String fecha, String descripcion, double importe, String tipo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.importe = importe;
        this.tipo = tipo;
    }
}

class RespuestaServicio {
    String resultadoOperacion = "01";
    List<Saldo> Saldos;
    List<Movimiento> Movimientos;

    RespuestaServicio(Saldo saldo, List<Movimiento> movimientos) {
        this.Saldos = Arrays.asList(saldo);
        this.Movimientos = movimientos;
    }
}

public class App {
    public static void main(String[] args) {
        Saldo saldo = new Saldo();
        List<Movimiento> movimientos = Arrays.asList(
            new Movimiento("30-MAR-23", "APORTACION", 1094.97, "2"),
            new Movimiento("30-MAR-23", "APORTACION", 2737.42, "2"),
            new Movimiento("03-ABR-23", "COMISION POR SALDO", 14.72, "1"),
            new Movimiento("25-MAY-23", "APORTACION", 1146.03, "2"),
            new Movimiento("03-JUL-23", "RENDIMIENTO BANXICO", 0.39, "2")
            // Agrega más movimientos según sea necesario
        );

        RespuestaServicio respuesta = new RespuestaServicio(saldo, movimientos);
        Gson gson = new Gson();
        String jsonRespuesta = gson.toJson(respuesta);
        System.out.println(jsonRespuesta);
    }
}
