/*
 * Copyright 2005 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetPerson extends Person {

    Map<String, Pet> pets;

    List<Pet>[] petArray = (List<Pet>[]) Array.newInstance(ArrayList.class, 1);

    public List<Pet>[] getPetArray() {
        return petArray;
    }

    public void setPetArray(List<Pet>[] petArray) {
        this.petArray = petArray;
    }

    public PetPerson() {
        super();
        pets = new HashMap<String, Pet>();
    }

    public PetPerson(String name) {
        super(name);
        pets = new HashMap<String, Pet>();
    }

    public Map<String, Pet> getPets() {
        return pets;
    }

    public void setPets(Map<String, Pet> pets) {
        this.pets = pets;
    }

    public void addPet(String name, Pet p) {
        pets.put(name, p);
    }

    public void removePet(String name) {
        pets.remove(name);
    }

    public void clearPets() {
        pets.clear();
    }

    public Pet getPet(String name) {
        return pets.get(name);
    }
}
