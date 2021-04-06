package com.thefilmsvault.petclinic.bootstrap;

import com.thefilmsvault.petclinic.model.Owner;
import com.thefilmsvault.petclinic.model.Vet;
import com.thefilmsvault.petclinic.services.OwnerService;
import com.thefilmsvault.petclinic.services.VetService;
import com.thefilmsvault.petclinic.services.map.OwnerServiceMap;
import com.thefilmsvault.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Karlita");
        owner1.setLastName("Flores");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Alejandro");
        owner1.setLastName("Rojas");

        ownerService.save(owner2);

        System.out.println("Loaded Owners........");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Murphy");
        vet1.setLastName("Ragdoll");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Qwerty");
        vet1.setLastName("Acapulca");

        vetService.save(vet2);
        System.out.println("Loaded Vets........");
    }

}
