package domain.controllers;

import domain.models.Cerveza;
import domain.services.CervezaService;
import domain.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class CervezaController {

    @Autowired
    private CervezaService cervezaService;

    @Autowired
    private LogService logService;

    @GetMapping
    public List<Cerveza> listar()
    {
        Long tiempoInicioMiliseg = System.currentTimeMillis();
        List<Cerveza> cervezaList = this.cervezaService.listar();
        Long tiempoFinMiliseg = System.currentTimeMillis();
        Long tiempoRespuestaMiliseg = tiempoFinMiliseg - tiempoInicioMiliseg;
        LocalDateTime horaDeEjecucion = LocalDateTime.now();
        String servicioConsumido = "listar";
        this.logService.guardarLogBusquedasRealizadas(servicioConsumido,horaDeEjecucion, tiempoRespuestaMiliseg);
        return cervezaList;
    }

    @GetMapping("/{cadenaABuscar}")
    public List<Cerveza> listarPorNombre(@PathVariable String cadenaABuscar)
    {
        Long tiempoInicioMiliseg = System.currentTimeMillis();
        List<Cerveza> cervezaList = this.cervezaService.listarPorNombre(cadenaABuscar);
        Long tiempoFinMiliseg = System.currentTimeMillis();
        Long tiempoRespuestaMiliseg = tiempoFinMiliseg - tiempoInicioMiliseg;
        LocalDateTime horaDeEjecucion = LocalDateTime.now();
        String servicioConsumido = "listarPorNombre";
        this.logService.guardarLogBusquedasRealizadas(servicioConsumido,horaDeEjecucion, tiempoRespuestaMiliseg);
        return cervezaList;
    }

    @GetMapping("/recomendarCervezaAleatoria")
    public List<Cerveza> recomendarCervezaAleatoria()
    {
        Long tiempoInicioMiliseg = System.currentTimeMillis();
        List<Cerveza> cervezaList = this.cervezaService.recomendarCervezaAleatoria();
        Long tiempoFinMiliseg = System.currentTimeMillis();
        Long tiempoRespuestaMiliseg = tiempoFinMiliseg - tiempoInicioMiliseg;
        LocalDateTime horaDeEjecucion = LocalDateTime.now();
        String servicioConsumido = "recomendarCervezaAleatoria";
        this.logService.guardarLogBusquedasRealizadas(servicioConsumido,horaDeEjecucion, tiempoRespuestaMiliseg);
        return cervezaList;
    }
}
