package domain.models.entity;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="log_busquedas_realizadas_cerveza")
public class LogBusquedasRealizadasCerveza
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "servicio_consumido")
    private String servicioConsumido;

    @Column(name = "hora_ejecucion")
    private LocalDateTime horaEjecucion;

    @Column(name = "tiempo_respuesta_miliseg")
    private Long tiempoRespuestaMiliseg;

    public LogBusquedasRealizadasCerveza(String servicioConsumido,LocalDateTime horaEjecucion, Long tiempoRespuestaMiliseg) {
        this.servicioConsumido = servicioConsumido;
        this.horaEjecucion = horaEjecucion;
        this.tiempoRespuestaMiliseg = tiempoRespuestaMiliseg;
    }

    public LogBusquedasRealizadasCerveza() {

    }
}
