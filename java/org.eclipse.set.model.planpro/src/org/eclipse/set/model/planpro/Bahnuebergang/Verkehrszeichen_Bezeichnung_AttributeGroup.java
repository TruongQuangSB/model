/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verkehrszeichen Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Bezeichnung_AttributeGroup#getBezeichnungVerkehrszeichen <em>Bezeichnung Verkehrszeichen</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CVerkehrszeichen_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Verkehrszeichen_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Verkehrszeichen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Verkehrszeichens, z. B. S1, Lz1. Die Angabe entfällt bei alleinstehenden Andreaskreuzen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Verkehrszeichen</em>' containment reference.
	 * @see #setBezeichnungVerkehrszeichen(Bezeichnung_Verkehrszeichen_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Bezeichnung_AttributeGroup_BezeichnungVerkehrszeichen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Verkehrszeichen'"
	 * @generated
	 */
	Bezeichnung_Verkehrszeichen_TypeClass getBezeichnungVerkehrszeichen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Bezeichnung_AttributeGroup#getBezeichnungVerkehrszeichen <em>Bezeichnung Verkehrszeichen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Verkehrszeichen</em>' containment reference.
	 * @see #getBezeichnungVerkehrszeichen()
	 * @generated
	 */
	void setBezeichnungVerkehrszeichen(Bezeichnung_Verkehrszeichen_TypeClass value);

} // Verkehrszeichen_Bezeichnung_AttributeGroup
