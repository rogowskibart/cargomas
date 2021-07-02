package com.example.cargomas.bootstrap;

import com.example.cargomas.domain.*;
import com.example.cargomas.repositories.KomponentRepository;
import com.example.cargomas.repositories.RegionRepository;
import com.example.cargomas.repositories.RowerRepository;
import com.example.cargomas.repositories.SerwisRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Bootstrap implements CommandLineRunner {

    private final RowerRepository rowerRepository;
    private final KomponentRepository komponentRepository;
    
    private final SerwisRepository serwisRepository;
    private final RegionRepository regionRepository;

    public Bootstrap(RowerRepository rowerRepository, KomponentRepository komponentRepository, SerwisRepository serwisRepository, RegionRepository regionRepository) {
        this.rowerRepository = rowerRepository;
        this.komponentRepository = komponentRepository;
        this.serwisRepository = serwisRepository;
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        loadRowery();
        loadKomponenty();

        loadRegiony();
        loadSerwisy();
    }

    private void loadRegiony() {
        Set<Region> regiony = new HashSet<>();

        Region region1 = new Region();
        region1.setNazwa("Region Warszawa Polnoc");
        regiony.add(region1);

        Region region2 = new Region();
        region2.setNazwa("Region Warszawa Poludnie");
        regiony.add(region2);
        
        regionRepository.saveAll(regiony);

        System.out.println("Regiony wczytane w ilości " + regionRepository.count());
    }

    private void loadSerwisy() {
        Set<Serwis> serwisy = new HashSet<>();
        
        Serwis serwis1 = new Serwis();
        serwis1.setNazwa("Serwis Warszawa Polnoc");
        serwis1.setRegion(regionRepository.findByNazwa("Region Warszawa Polnoc"));
        serwisy.add(serwis1);

        Serwis serwis2 = new Serwis();
        serwis2.setNazwa("Serwis Warszawa Poludnie");
        serwis2.setRegion(regionRepository.findByNazwa("Region Warszawa Poludnie"));
        serwisy.add(serwis2);

        serwisRepository.saveAll(serwisy);

        System.out.println("Serwisy wczytane w ilości " + serwisRepository.count());
    }

    private void loadRowery() {
        Set<Rower> rowery = new HashSet<>();

        Rower rower1 = new Rower();
        rower1.setNumerRoweru(101);
        rower1.setCzyElektryczny(false);
        rower1.setCenaZaGodzine(57);
        rower1.setUdzwigSkrzyni(80);
        rower1.setLiczbaMiejscSiedzacyhWSkrzyni(2);
        rowery.add(rower1);

        Rower rower2 = new Rower();
        rower2.setNumerRoweru(102);
        rower2.setCzyElektryczny(true);
        rower2.setCenaZaGodzine(80);
        rower2.setUdzwigSkrzyni(100);
        rower2.setLiczbaMiejscSiedzacyhWSkrzyni(4);
        rowery.add(rower2);

        Rower rower3 = new Rower();
        rower3.setNumerRoweru(103);
        rower3.setCzyElektryczny(false);
        rower3.setCenaZaGodzine(45);
        rower3.setUdzwigSkrzyni(60);
        rower3.setLiczbaMiejscSiedzacyhWSkrzyni(2);
        rowery.add(rower3);

        rowerRepository.saveAll(rowery);

        System.out.println("Rowery wczytane w ilości " + rowerRepository.count());
    }

    private void loadKomponenty() {
        Set<Komponent> komponenty = new HashSet<>();

        Komponent oponaPrzednia1 = new Komponent();
        oponaPrzednia1.setKodProducenta("oponaPrzednia");
        oponaPrzednia1.setNazwa("Przednia opona 20 cali");
        oponaPrzednia1.setProducent("Schwalbe");
        oponaPrzednia1.setTypKomponentu(TypKomponentu.OPONA);
        oponaPrzednia1.setRower(rowerRepository.findByNumerRoweru(101));
        komponenty.add(oponaPrzednia1);
        
        Komponent detka = new Komponent();
        detka.setKodProducenta("detka28");
        detka.setNazwa("Detka 28 cali");
        detka.setProducent("Continental");
        detka.setTypKomponentu(TypKomponentu.DETKA);
        detka.setRower(rowerRepository.findByNumerRoweru(101));
        komponenty.add(detka);

        Komponent koloTylne = new Komponent();
        koloTylne.setKodProducenta("koloTylne28");
        koloTylne.setNazwa("Tylne kolo aluminium 28 cali");
        koloTylne.setProducent("Mavic");
        koloTylne.setTypKomponentu(TypKomponentu.KOLO_TYL);
        koloTylne.setRower(rowerRepository.findByNumerRoweru(102));
        komponenty.add(koloTylne);

        Komponent hamulecPrzedni = new Komponent();
        hamulecPrzedni.setKodProducenta("hamulecPrzedni");
        hamulecPrzedni.setNazwa("Hamulec przedni V-Brake");
        hamulecPrzedni.setProducent("Tektro");
        hamulecPrzedni.setTypKomponentu(TypKomponentu.HAMULEC_PRZOD);
        hamulecPrzedni.setRower(rowerRepository.findByNumerRoweru(103));
        komponenty.add(hamulecPrzedni);

        komponentRepository.saveAll(komponenty);

        System.out.println("Komponenty wczytane w ilości " + komponentRepository.count());
    }
}
