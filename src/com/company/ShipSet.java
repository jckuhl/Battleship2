package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ShipSet implements Iterable<Ship>{
    private Set<Ship> shipSet;

    public ShipSet() {
        this.shipSet = new HashSet<>();
    }

    public boolean shipIsPresentAt(int x, int y) {
        for(var ship : shipSet) {
            if(ship.getPosition()[0] == x && ship.getPosition()[1] == y) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.shipSet.size();
    }

    public boolean add(Ship ship) {
        return this.shipSet.add(ship);
    }

    public boolean contains(Ship ship) {
        return this.shipSet.contains(ship);
    }

    public boolean remove(int x, int y) {
        Ship removedShip = null;
        for(var ship : this.shipSet) {
            if(ship.getPosition()[0] == x && ship.getPosition()[1] == y) {
                removedShip = ship;
            }
        }
        return removedShip == null ? false : this.shipSet.remove(removedShip);
    }


    @Override
    public Iterator<Ship> iterator() {
        return this.shipSet.iterator();
    }
}
