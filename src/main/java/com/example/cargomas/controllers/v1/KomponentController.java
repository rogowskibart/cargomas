package com.example.cargomas.controllers.v1;

import com.example.cargomas.api.v1.model.KomponentDTO;
import com.example.cargomas.api.v1.model.KomponentListDTO;
import com.example.cargomas.services.KomponentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/komponenty/")
public class KomponentController {

    private final KomponentService komponentService;

    public KomponentController(KomponentService komponentService) {
        this.komponentService = komponentService;
    }

    @GetMapping
    public ResponseEntity<KomponentListDTO> getAllKomponents() {
        return new ResponseEntity<>(new KomponentListDTO(komponentService.getAllKomponents()), HttpStatus.OK);
    }

    @GetMapping("/kod/{kodProducenta}")
    public ResponseEntity<KomponentDTO> getKomponentByKodProducenta(@PathVariable String kodProducenta) {
        return new ResponseEntity<>(komponentService.getKomponentByKodProducenta(kodProducenta), HttpStatus.OK);
    }

    @GetMapping("/rower/{id}")
    public ResponseEntity<KomponentListDTO> getKomponentByRower(@PathVariable String id) {
        return new ResponseEntity<>(new KomponentListDTO(komponentService.getKomponentsByRowerId(Long.parseLong(id))), HttpStatus.OK);
    }
}
