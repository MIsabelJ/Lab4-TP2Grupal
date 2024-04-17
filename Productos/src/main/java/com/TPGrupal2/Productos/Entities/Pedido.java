package com.TPGrupal2.Productos.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalTime horaEstimadaFinalizado;
    private double total;
    private double totalCosto;
    private EstadoEnum estado;
    private TipoEnvioEnum tipoEnvio;
    private FormaPagoEnum formaPago;
    private LocalDate fechaPedido;
    @OneToOne
    private Factura factura;
    @OneToMany
    private List<DetallePedido> detallePedido;
}
