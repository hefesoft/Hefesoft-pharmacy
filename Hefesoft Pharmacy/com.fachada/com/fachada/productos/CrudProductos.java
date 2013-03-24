package com.fachada.productos;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;
import com.hefesoft.pharmacy.PMF;


public class CrudProductos {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	public CollectionResponse<Productos> listProductos(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Productos> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Productos.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Productos>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Productos obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Productos> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	public Productos getProductos(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Productos productos = null;
		try {
			productos = mgr.getObjectById(Productos.class, id);
		} finally {
			mgr.close();
		}
		return productos;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param productos the entity to be inserted.
	 * @return The inserted entity.
	 */
	public Productos insertProductos(Productos productos) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(productos);
		} finally {
			mgr.close();
		}
		return productos;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param productos the entity to be updated.
	 * @return The updated entity.
	 */
	public Productos updateProductos(Productos productos) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(productos);
		} finally {
			mgr.close();
		}
		return productos;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 * @return The deleted entity.
	 */
	public Productos removeProductos(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Productos productos = null;
		try {
			productos = mgr.getObjectById(Productos.class, id);
			mgr.deletePersistent(productos);
		} finally {
			mgr.close();
		}
		return productos;
	}

	
	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
