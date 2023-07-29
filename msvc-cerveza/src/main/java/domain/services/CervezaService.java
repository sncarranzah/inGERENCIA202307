package domain.services;

import domain.models.Cerveza;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CervezaService {
    List<Cerveza> listar();
    List<Cerveza> listarPorNombre( String cadenaABuscar);
    List<Cerveza> recomendarCervezaAleatoria();
}
