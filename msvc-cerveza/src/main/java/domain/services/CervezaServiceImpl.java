package domain.services;

import domain.models.Cerveza;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CervezaServiceImpl implements CervezaService
{
    @Value("${spring.external-service.punkApi.path.beersList1}")
    private String beerList1Path;

    @Value("${spring.external-service.punkApi.path.beersList2}")
    private String beerList2Path;

    @Value("${spring.external-service.punkApi.path.beersList3}")
    private String beerList3Path;

    @Value("${spring.external-service.punkApi.path.beersList4}")
    private String beerList4Path;

    @Value("${spring.external-service.punkApi.path.searchByName}")
    private String searchByNamePath;

    @Value("${spring.external-service.punkApi.path.offerRandomBeer}")
    private String offerRandomBeerPath;

    private final RestTemplate restTemplate;
    @Override
    public List<Cerveza> listar()
    {
        Cerveza[] responsePunkApi1 = this.restTemplate.getForObject(this.beerList1Path, Cerveza[].class);
        Cerveza[] responsePunkApi2 = this.restTemplate.getForObject(this.beerList2Path, Cerveza[].class);
        Cerveza[] responsePunkApi3 = this.restTemplate.getForObject(this.beerList3Path, Cerveza[].class);
        Cerveza[] responsePunkApi4 = this.restTemplate.getForObject(this.beerList4Path, Cerveza[].class);

        List<Cerveza> listaCervezaLst = new ArrayList<Cerveza>();
        listaCervezaLst.addAll(Arrays.asList(responsePunkApi1));
        listaCervezaLst.addAll(Arrays.asList(responsePunkApi2));
        listaCervezaLst.addAll(Arrays.asList(responsePunkApi3));
        listaCervezaLst.addAll(Arrays.asList(responsePunkApi4));
        return listaCervezaLst;
    }

    @Override
    public List<Cerveza> listarPorNombre(String cadenaABuscar)
    {
        Cerveza[] responsePunkApi = this.restTemplate.getForObject(this.searchByNamePath + cadenaABuscar, Cerveza[].class);
        return Arrays.asList(responsePunkApi);
    }

    @Override
    public List<Cerveza> recomendarCervezaAleatoria()
    {
        Cerveza[] responsePunkApi = this.restTemplate.getForObject(this.offerRandomBeerPath, Cerveza[].class);
        return Arrays.asList(responsePunkApi);
    }
}
