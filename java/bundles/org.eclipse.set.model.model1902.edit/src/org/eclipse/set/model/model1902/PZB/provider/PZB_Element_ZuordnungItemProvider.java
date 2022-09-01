/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PZB.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model1902.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.model1902.PZB.PZBFactory;
import org.eclipse.set.model.model1902.PZB.PZBPackage;
import org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung;

import org.eclipse.set.model.model1902.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model1902.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PZB_Element_ZuordnungItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PZB_Element_ZuordnungItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER);
			childrenFeatures.add(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT);
			childrenFeatures.add(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA);
			childrenFeatures.add(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PZB_Element_Zuordnung.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PZB_Element_Zuordnung"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PZB_Element_Zuordnung_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PZB_Element_Zuordnung.class)) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT:
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA:
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER,
				 VerweiseFactory.eINSTANCE.createID_Fstr_Zug_Rangier_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT,
				 VerweiseFactory.eINSTANCE.createID_PZB_Element_Bezugspunkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA,
				 PZBFactory.eINSTANCE.createPZB_Element_Zuordnung_INA_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT,
				 PZBFactory.eINSTANCE.createWirksamkeit_TypeClass()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PlanProEditPlugin.INSTANCE;
	}

}