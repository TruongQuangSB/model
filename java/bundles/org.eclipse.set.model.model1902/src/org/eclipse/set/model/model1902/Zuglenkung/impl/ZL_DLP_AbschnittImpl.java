/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Gleis_Abschnitt_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ZL_DLP_Fstr_TypeClass;

import org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Abschnitt;
import org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL DLP Abschnitt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_DLP_AbschnittImpl#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_DLP_AbschnittImpl#getIDZLDLPFstr <em>IDZLDLP Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_DLP_AbschnittImpl extends Basis_ObjektImpl implements ZL_DLP_Abschnitt {
	/**
	 * The cached value of the '{@link #getIDGleisAbschnitt() <em>ID Gleis Abschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisAbschnitt()
	 * @generated
	 * @ordered
	 */
	protected ID_Gleis_Abschnitt_TypeClass iDGleisAbschnitt;

	/**
	 * The cached value of the '{@link #getIDZLDLPFstr() <em>IDZLDLP Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLDLPFstr()
	 * @generated
	 * @ordered
	 */
	protected ID_ZL_DLP_Fstr_TypeClass iDZLDLPFstr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_DLP_AbschnittImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_DLP_ABSCHNITT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Gleis_Abschnitt_TypeClass getIDGleisAbschnitt() {
		return iDGleisAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass newIDGleisAbschnitt, NotificationChain msgs) {
		ID_Gleis_Abschnitt_TypeClass oldIDGleisAbschnitt = iDGleisAbschnitt;
		iDGleisAbschnitt = newIDGleisAbschnitt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT, oldIDGleisAbschnitt, newIDGleisAbschnitt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass newIDGleisAbschnitt) {
		if (newIDGleisAbschnitt != iDGleisAbschnitt) {
			NotificationChain msgs = null;
			if (iDGleisAbschnitt != null)
				msgs = ((InternalEObject)iDGleisAbschnitt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT, null, msgs);
			if (newIDGleisAbschnitt != null)
				msgs = ((InternalEObject)newIDGleisAbschnitt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT, null, msgs);
			msgs = basicSetIDGleisAbschnitt(newIDGleisAbschnitt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT, newIDGleisAbschnitt, newIDGleisAbschnitt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_DLP_Fstr_TypeClass getIDZLDLPFstr() {
		return iDZLDLPFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZLDLPFstr(ID_ZL_DLP_Fstr_TypeClass newIDZLDLPFstr, NotificationChain msgs) {
		ID_ZL_DLP_Fstr_TypeClass oldIDZLDLPFstr = iDZLDLPFstr;
		iDZLDLPFstr = newIDZLDLPFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, oldIDZLDLPFstr, newIDZLDLPFstr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZLDLPFstr(ID_ZL_DLP_Fstr_TypeClass newIDZLDLPFstr) {
		if (newIDZLDLPFstr != iDZLDLPFstr) {
			NotificationChain msgs = null;
			if (iDZLDLPFstr != null)
				msgs = ((InternalEObject)iDZLDLPFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, null, msgs);
			if (newIDZLDLPFstr != null)
				msgs = ((InternalEObject)newIDZLDLPFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, null, msgs);
			msgs = basicSetIDZLDLPFstr(newIDZLDLPFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, newIDZLDLPFstr, newIDZLDLPFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				return basicSetIDGleisAbschnitt(null, msgs);
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				return basicSetIDZLDLPFstr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				return getIDGleisAbschnitt();
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				return getIDZLDLPFstr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				setIDGleisAbschnitt((ID_Gleis_Abschnitt_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				setIDZLDLPFstr((ID_ZL_DLP_Fstr_TypeClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				setIDGleisAbschnitt((ID_Gleis_Abschnitt_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				setIDZLDLPFstr((ID_ZL_DLP_Fstr_TypeClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				return iDGleisAbschnitt != null;
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				return iDZLDLPFstr != null;
		}
		return super.eIsSet(featureID);
	}

} //ZL_DLP_AbschnittImpl