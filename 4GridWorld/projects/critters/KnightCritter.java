/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */


import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

/**
 * A <code>KnightCritter</code> 
 * <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class KnightCritter extends Critter
{
    public KnightCritter()
    {
        setColor(Color.BLACK);
    }

    /**
     * A crab gets the actors in the three locations immediately in front, to its
     * front-right and to its front-left
     * @return a list of actors occupying these locations
     */

    

    /**
     * @return list of empty locations immediately to the right and to the left
     */
    public ArrayList<Location> getMoveLocations()
    {
    	Location loca = this.getLocation();
    	ArrayList<Location> locs = new ArrayList<Location>();
    
    	for(int i = Location.NORTH; i < Location.FULL_CIRCLE; i += Location.RIGHT){
    		Location adjacent = loca.getAdjacentLocation(i);
    			if (getGrid().isValid(adjacent)){
    				Location[] loc1 = new Location [2];
    				loc1[0] = adjacent.getAdjacentLocation(i + Location.HALF_LEFT+Location.FULL_CIRCLE);
    				loc1[1] = adjacent.getAdjacentLocation(i + Location.HALF_RIGHT+Location.FULL_CIRCLE);
    				
    				for (Location d : loc1){
        				if (getGrid().isValid(d)) {
        					Actor a = getGrid().get(d);
        					if (a == null || a instanceof Flower){
        						locs.add(d);
        					}
        				}
        			}

    			}
    			

        
    }
		return locs;
    
    }
    }

   
    
    
    /**
     * Finds the valid adjacent locations of this critter in different
     * directions.
     * @param directions - an array of directions (which are relative to the
     * current direction)
     * @return a set of valid locations that are neighbors of the current
     * location in the given directions
     */