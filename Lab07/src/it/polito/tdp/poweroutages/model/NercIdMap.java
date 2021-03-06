package it.polito.tdp.poweroutages.model;

import java.util.HashMap;
import java.util.Map;

public class NercIdMap {

	private Map<Integer, Nerc> map;

	

	public NercIdMap() {

		map = new HashMap<>();

	}

	

	public Nerc get(int id) {

		return map.get(id);

	}

	

	public Nerc get(Nerc Nerc) {

		Nerc old = map.get(Nerc.getId());

		if (old == null) {

			// nella mappa non c'� questo corso!

			map.put(Nerc.getId(), Nerc);

			return Nerc;

		}

		return old;

	}

	

	public void put(int id, Nerc Nerc) {

		map.put(id, Nerc);

	}
}
