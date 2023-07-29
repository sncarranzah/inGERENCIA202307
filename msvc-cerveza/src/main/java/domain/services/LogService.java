package domain.services;

import java.time.LocalDateTime;

public interface LogService
{
    void guardarLogBusquedasRealizadas(String servicioConsumido, LocalDateTime horaEjecucion, Long tiempoRespuestaMiliseg);
}
