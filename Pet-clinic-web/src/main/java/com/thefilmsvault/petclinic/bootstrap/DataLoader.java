package com.thefilmsvault.petclinic.bootstrap;

import com.thefilmsvault.petclinic.model.Owner;
import com.thefilmsvault.petclinic.model.Vet;
import com.thefilmsvault.petclinic.services.OwnerService;
import com.thefilmsvault.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Karlita");
        owner1.setLastName("Flores");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Alejandro");
        owner2.setLastName("Rojas");

        ownerService.save(owner2);

        System.out.println("Loaded Owners........");

        Vet vet1 = new Vet();
        vet1.setFirstName("Murphy");
        vet1.setLastName("Ragdoll");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Qwerty");
        vet2.setLastName("Acapulca");

        vetService.save(vet2);
        System.out.println("Loaded Vets........");
    }

}
