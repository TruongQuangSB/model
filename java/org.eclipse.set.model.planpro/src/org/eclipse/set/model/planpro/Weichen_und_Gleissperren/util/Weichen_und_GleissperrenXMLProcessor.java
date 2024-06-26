/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Weichen_und_GleissperrenXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weichen_und_GleissperrenXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Weichen_und_GleissperrenPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Weichen_und_GleissperrenResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Weichen_und_GleissperrenResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Weichen_und_GleissperrenResourceFactoryImpl());
		}
		return registrations;
	}

} //Weichen_und_GleissperrenXMLProcessor
