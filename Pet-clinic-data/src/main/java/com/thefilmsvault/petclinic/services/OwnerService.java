package com.thefilmsvault.petclinic.services;

import com.thefilmsvault.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
