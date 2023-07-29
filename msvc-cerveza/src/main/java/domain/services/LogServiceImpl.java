package domain.services;

import domain.models.entity.LogBusquedasRealizadasCerveza;
import domain.repositories.LogBusquedasRealizadasCervezaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class LogServiceImpl implements LogService
{
    @Autowired
    private LogBusquedasRealizadasCervezaRepository logBusquedasRealizadasCervezaRepository;
    @Transactional
    @Override
    public void guardarLogBusquedasRealizadas(String servicioConsumido, LocalDateTime horaEjecucion, Long tiempoRespuestaMiliseg)
    {
        LogBusquedasRealizadasCerveza logBusquedasRealizadasCerveza = new LogBusquedasRealizadasCerveza(servicioConsumido, horaEjecucion, tiempoRespuestaMiliseg);
        this.logBusquedasRealizadasCervezaRepository.save(logBusquedasRealizadasCerveza);
    }
}
