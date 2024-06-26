/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signalbegriffe_Ril_301;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oz Zugl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzZugl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package#getOzZugl()
 * @model extendedMetaData="name='Oz_Zugl' kind='elementOnly'"
 * @generated
 */
public interface OzZugl extends EObject {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package#getOzZugl_Symbol()
	 * @model dataType="org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Oz_Zugl_Symbol_Type" required="true"
	 *        extendedMetaData="kind='element' name='Symbol'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.OzZugl#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

} // OzZugl
