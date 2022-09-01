/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenFactory;

import org.eclipse.set.model.model1902.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.model.model1902.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.model.model1902.Verweise.VerweiseFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Luft_Telegramm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Luft_TelegrammItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Luft_TelegrammItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_EigenschaftenBinaerdatei());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_EigenschaftenBinaerdateiHilfe());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDAnhangEADoku());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDBaliseUebertragung());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDBinaerdatei());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDBinaerdateiHilfe());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDFachtelegramm());
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
	 * This returns Luft_Telegramm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Luft_Telegramm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Luft_Telegramm_type");
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

		switch (notification.getFeatureID(Luft_Telegramm.class)) {
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI:
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE:
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU:
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI:
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE:
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_EigenschaftenBinaerdatei(),
				 BasisTypenFactory.eINSTANCE.createEigenschaften_Datei_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_EigenschaftenBinaerdateiHilfe(),
				 BasisTypenFactory.eINSTANCE.createEigenschaften_Datei_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDAnhangEADoku(),
				 VerweiseFactory.eINSTANCE.createID_Anhang_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDBaliseUebertragung(),
				 VerweiseFactory.eINSTANCE.createID_Balise_ohne_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDBinaerdatei(),
				 VerweiseFactory.eINSTANCE.createID_Binaerdatei_ohne_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDBinaerdateiHilfe(),
				 VerweiseFactory.eINSTANCE.createID_Binaerdatei_ohne_Proxy_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDFachtelegramm(),
				 VerweiseFactory.eINSTANCE.createID_Fachtelegramm_TypeClass()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_EigenschaftenBinaerdatei() ||
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_EigenschaftenBinaerdateiHilfe() ||
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDBinaerdatei() ||
			childFeature == Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm_IDBinaerdateiHilfe();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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