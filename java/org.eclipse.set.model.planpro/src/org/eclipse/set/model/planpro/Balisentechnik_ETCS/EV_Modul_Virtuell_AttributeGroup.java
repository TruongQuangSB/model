/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Quellelement_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EV Modul Virtuell Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Virtuell_AttributeGroup#getIDQuellelement <em>ID Quellelement</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Virtuell_AttributeGroup()
 * @model extendedMetaData="name='CEV_Modul_Virtuell' kind='elementOnly'"
 * @generated
 */
public interface EV_Modul_Virtuell_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Quellelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das bestehende Element (z. B. Aussenelementansteuerung, BUE_Anlage, EV_Modul, ESTW_Zentraleinheit, PZB_Element), von dem der eigentliche Energie-Abgriff erfolgt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Quellelement</em>' containment reference.
	 * @see #setIDQuellelement(ID_Quellelement_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Virtuell_AttributeGroup_IDQuellelement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Quellelement'"
	 * @generated
	 */
	ID_Quellelement_TypeClass getIDQuellelement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Virtuell_AttributeGroup#getIDQuellelement <em>ID Quellelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Quellelement</em>' containment reference.
	 * @see #getIDQuellelement()
	 * @generated
	 */
	void setIDQuellelement(ID_Quellelement_TypeClass value);

} // EV_Modul_Virtuell_AttributeGroup
