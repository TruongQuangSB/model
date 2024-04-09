/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.util.SchluesselabhaengigkeitenAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchluesselabhaengigkeitenItemProviderAdapterFactory extends SchluesselabhaengigkeitenAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchluesselabhaengigkeitenItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bedienung_Art_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedienung_Art_TypeClassItemProvider bedienung_Art_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bedienung_Art_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBedienung_Art_TypeClassAdapter() {
		if (bedienung_Art_TypeClassItemProvider == null) {
			bedienung_Art_TypeClassItemProvider = new Bedienung_Art_TypeClassItemProvider(this);
		}

		return bedienung_Art_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Beschreibung_Sonderanlage_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Beschreibung_Sonderanlage_TypeClassItemProvider beschreibung_Sonderanlage_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Beschreibung_Sonderanlage_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBeschreibung_Sonderanlage_TypeClassAdapter() {
		if (beschreibung_Sonderanlage_TypeClassItemProvider == null) {
			beschreibung_Sonderanlage_TypeClassItemProvider = new Beschreibung_Sonderanlage_TypeClassItemProvider(this);
		}

		return beschreibung_Sonderanlage_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bezeichnung_Schloss_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bezeichnung_Schloss_TypeClassItemProvider bezeichnung_Schloss_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bezeichnung_Schloss_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBezeichnung_Schloss_TypeClassAdapter() {
		if (bezeichnung_Schloss_TypeClassItemProvider == null) {
			bezeichnung_Schloss_TypeClassItemProvider = new Bezeichnung_Schloss_TypeClassItemProvider(this);
		}

		return bezeichnung_Schloss_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bezeichnung_Schluessel_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bezeichnung_Schluessel_TypeClassItemProvider bezeichnung_Schluessel_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bezeichnung_Schluessel_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBezeichnung_Schluessel_TypeClassAdapter() {
		if (bezeichnung_Schluessel_TypeClassItemProvider == null) {
			bezeichnung_Schluessel_TypeClassItemProvider = new Bezeichnung_Schluessel_TypeClassItemProvider(this);
		}

		return bezeichnung_Schluessel_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bezeichnung_Sk_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bezeichnung_Sk_TypeClassItemProvider bezeichnung_Sk_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bezeichnung_Sk_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBezeichnung_Sk_TypeClassAdapter() {
		if (bezeichnung_Sk_TypeClassItemProvider == null) {
			bezeichnung_Sk_TypeClassItemProvider = new Bezeichnung_Sk_TypeClassItemProvider(this);
		}

		return bezeichnung_Sk_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.BUE_Lage_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Lage_TypeClassItemProvider buE_Lage_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.BUE_Lage_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBUE_Lage_TypeClassAdapter() {
		if (buE_Lage_TypeClassItemProvider == null) {
			buE_Lage_TypeClassItemProvider = new BUE_Lage_TypeClassItemProvider(this);
		}

		return buE_Lage_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Gsp_Lage_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gsp_Lage_TypeClassItemProvider gsp_Lage_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Gsp_Lage_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGsp_Lage_TypeClassAdapter() {
		if (gsp_Lage_TypeClassItemProvider == null) {
			gsp_Lage_TypeClassItemProvider = new Gsp_Lage_TypeClassItemProvider(this);
		}

		return gsp_Lage_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Hauptschloss_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hauptschloss_TypeClassItemProvider hauptschloss_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Hauptschloss_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHauptschloss_TypeClassAdapter() {
		if (hauptschloss_TypeClassItemProvider == null) {
			hauptschloss_TypeClassItemProvider = new Hauptschloss_TypeClassItemProvider(this);
		}

		return hauptschloss_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchlossItemProvider schlossItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchlossAdapter() {
		if (schlossItemProvider == null) {
			schlossItemProvider = new SchlossItemProvider(this);
		}

		return schlossItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Art_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Art_TypeClassItemProvider schloss_Art_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Art_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchloss_Art_TypeClassAdapter() {
		if (schloss_Art_TypeClassItemProvider == null) {
			schloss_Art_TypeClassItemProvider = new Schloss_Art_TypeClassItemProvider(this);
		}

		return schloss_Art_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Bezeichnung_AttributeGroupItemProvider schloss_Bezeichnung_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchloss_Bezeichnung_AttributeGroupAdapter() {
		if (schloss_Bezeichnung_AttributeGroupItemProvider == null) {
			schloss_Bezeichnung_AttributeGroupItemProvider = new Schloss_Bezeichnung_AttributeGroupItemProvider(this);
		}

		return schloss_Bezeichnung_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_BUE_AttributeGroupItemProvider schloss_BUE_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchloss_BUE_AttributeGroupAdapter() {
		if (schloss_BUE_AttributeGroupItemProvider == null) {
			schloss_BUE_AttributeGroupItemProvider = new Schloss_BUE_AttributeGroupItemProvider(this);
		}

		return schloss_BUE_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Gsp_AttributeGroupItemProvider schloss_Gsp_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchloss_Gsp_AttributeGroupAdapter() {
		if (schloss_Gsp_AttributeGroupItemProvider == null) {
			schloss_Gsp_AttributeGroupItemProvider = new Schloss_Gsp_AttributeGroupItemProvider(this);
		}

		return schloss_Gsp_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Sk_AttributeGroupItemProvider schloss_Sk_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchloss_Sk_AttributeGroupAdapter() {
		if (schloss_Sk_AttributeGroupItemProvider == null) {
			schloss_Sk_AttributeGroupItemProvider = new Schloss_Sk_AttributeGroupItemProvider(this);
		}

		return schloss_Sk_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Sonderanlage_AttributeGroupItemProvider schloss_Sonderanlage_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchloss_Sonderanlage_AttributeGroupAdapter() {
		if (schloss_Sonderanlage_AttributeGroupItemProvider == null) {
			schloss_Sonderanlage_AttributeGroupItemProvider = new Schloss_Sonderanlage_AttributeGroupItemProvider(this);
		}

		return schloss_Sonderanlage_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Ssp_AttributeGroupItemProvider schloss_Ssp_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchloss_Ssp_AttributeGroupAdapter() {
		if (schloss_Ssp_AttributeGroupItemProvider == null) {
			schloss_Ssp_AttributeGroupItemProvider = new Schloss_Ssp_AttributeGroupItemProvider(this);
		}

		return schloss_Ssp_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_W_AttributeGroupItemProvider schloss_W_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchloss_W_AttributeGroupAdapter() {
		if (schloss_W_AttributeGroupItemProvider == null) {
			schloss_W_AttributeGroupItemProvider = new Schloss_W_AttributeGroupItemProvider(this);
		}

		return schloss_W_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schlosskombination} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchlosskombinationItemProvider schlosskombinationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schlosskombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchlosskombinationAdapter() {
		if (schlosskombinationItemProvider == null) {
			schlosskombinationItemProvider = new SchlosskombinationItemProvider(this);
		}

		return schlosskombinationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schlosskombination_Bezeichnung_AttributeGroupItemProvider schlosskombination_Bezeichnung_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchlosskombination_Bezeichnung_AttributeGroupAdapter() {
		if (schlosskombination_Bezeichnung_AttributeGroupItemProvider == null) {
			schlosskombination_Bezeichnung_AttributeGroupItemProvider = new Schlosskombination_Bezeichnung_AttributeGroupItemProvider(this);
		}

		return schlosskombination_Bezeichnung_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchluesselItemProvider schluesselItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchluesselAdapter() {
		if (schluesselItemProvider == null) {
			schluesselItemProvider = new SchluesselItemProvider(this);
		}

		return schluesselItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schluessel_Allg_AttributeGroupItemProvider schluessel_Allg_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchluessel_Allg_AttributeGroupAdapter() {
		if (schluessel_Allg_AttributeGroupItemProvider == null) {
			schluessel_Allg_AttributeGroupItemProvider = new Schluessel_Allg_AttributeGroupItemProvider(this);
		}

		return schluessel_Allg_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Bartform_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schluessel_Bartform_TypeClassItemProvider schluessel_Bartform_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Bartform_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchluessel_Bartform_TypeClassAdapter() {
		if (schluessel_Bartform_TypeClassItemProvider == null) {
			schluessel_Bartform_TypeClassItemProvider = new Schluessel_Bartform_TypeClassItemProvider(this);
		}

		return schluessel_Bartform_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schluessel_Bezeichnung_AttributeGroupItemProvider schluessel_Bezeichnung_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchluessel_Bezeichnung_AttributeGroupAdapter() {
		if (schluessel_Bezeichnung_AttributeGroupItemProvider == null) {
			schluessel_Bezeichnung_AttributeGroupItemProvider = new Schluessel_Bezeichnung_AttributeGroupItemProvider(this);
		}

		return schluessel_Bezeichnung_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schluessel_Gruppe_TypeClassItemProvider schluessel_Gruppe_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchluessel_Gruppe_TypeClassAdapter() {
		if (schluessel_Gruppe_TypeClassItemProvider == null) {
			schluessel_Gruppe_TypeClassItemProvider = new Schluessel_Gruppe_TypeClassItemProvider(this);
		}

		return schluessel_Gruppe_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_In_Grdst_Eingeschl_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schluessel_In_Grdst_Eingeschl_TypeClassItemProvider schluessel_In_Grdst_Eingeschl_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_In_Grdst_Eingeschl_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchluessel_In_Grdst_Eingeschl_TypeClassAdapter() {
		if (schluessel_In_Grdst_Eingeschl_TypeClassItemProvider == null) {
			schluessel_In_Grdst_Eingeschl_TypeClassItemProvider = new Schluessel_In_Grdst_Eingeschl_TypeClassItemProvider(this);
		}

		return schluessel_In_Grdst_Eingeschl_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluesselsperre} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchluesselsperreItemProvider schluesselsperreItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluesselsperre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchluesselsperreAdapter() {
		if (schluesselsperreItemProvider == null) {
			schluesselsperreItemProvider = new SchluesselsperreItemProvider(this);
		}

		return schluesselsperreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Sonderanlage_Lage_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sonderanlage_Lage_TypeClassItemProvider sonderanlage_Lage_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Sonderanlage_Lage_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSonderanlage_Lage_TypeClassAdapter() {
		if (sonderanlage_Lage_TypeClassItemProvider == null) {
			sonderanlage_Lage_TypeClassItemProvider = new Sonderanlage_Lage_TypeClassItemProvider(this);
		}

		return sonderanlage_Lage_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Technisch_Berechtigter_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Technisch_Berechtigter_TypeClassItemProvider technisch_Berechtigter_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Technisch_Berechtigter_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechnisch_Berechtigter_TypeClassAdapter() {
		if (technisch_Berechtigter_TypeClassItemProvider == null) {
			technisch_Berechtigter_TypeClassItemProvider = new Technisch_Berechtigter_TypeClassItemProvider(this);
		}

		return technisch_Berechtigter_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Verschluss_Ort_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Verschluss_Ort_TypeClassItemProvider verschluss_Ort_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Verschluss_Ort_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerschluss_Ort_TypeClassAdapter() {
		if (verschluss_Ort_TypeClassItemProvider == null) {
			verschluss_Ort_TypeClassItemProvider = new Verschluss_Ort_TypeClassItemProvider(this);
		}

		return verschluss_Ort_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.W_Anbaulage_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected W_Anbaulage_TypeClassItemProvider w_Anbaulage_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.W_Anbaulage_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createW_Anbaulage_TypeClassAdapter() {
		if (w_Anbaulage_TypeClassItemProvider == null) {
			w_Anbaulage_TypeClassItemProvider = new W_Anbaulage_TypeClassItemProvider(this);
		}

		return w_Anbaulage_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.W_Lage_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected W_Lage_TypeClassItemProvider w_Lage_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.W_Lage_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createW_Lage_TypeClassAdapter() {
		if (w_Lage_TypeClassItemProvider == null) {
			w_Lage_TypeClassItemProvider = new W_Lage_TypeClassItemProvider(this);
		}

		return w_Lage_TypeClassItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (bedienung_Art_TypeClassItemProvider != null) bedienung_Art_TypeClassItemProvider.dispose();
		if (beschreibung_Sonderanlage_TypeClassItemProvider != null) beschreibung_Sonderanlage_TypeClassItemProvider.dispose();
		if (bezeichnung_Schloss_TypeClassItemProvider != null) bezeichnung_Schloss_TypeClassItemProvider.dispose();
		if (bezeichnung_Schluessel_TypeClassItemProvider != null) bezeichnung_Schluessel_TypeClassItemProvider.dispose();
		if (bezeichnung_Sk_TypeClassItemProvider != null) bezeichnung_Sk_TypeClassItemProvider.dispose();
		if (buE_Lage_TypeClassItemProvider != null) buE_Lage_TypeClassItemProvider.dispose();
		if (gsp_Lage_TypeClassItemProvider != null) gsp_Lage_TypeClassItemProvider.dispose();
		if (hauptschloss_TypeClassItemProvider != null) hauptschloss_TypeClassItemProvider.dispose();
		if (schlossItemProvider != null) schlossItemProvider.dispose();
		if (schloss_Art_TypeClassItemProvider != null) schloss_Art_TypeClassItemProvider.dispose();
		if (schloss_Bezeichnung_AttributeGroupItemProvider != null) schloss_Bezeichnung_AttributeGroupItemProvider.dispose();
		if (schloss_BUE_AttributeGroupItemProvider != null) schloss_BUE_AttributeGroupItemProvider.dispose();
		if (schloss_Gsp_AttributeGroupItemProvider != null) schloss_Gsp_AttributeGroupItemProvider.dispose();
		if (schloss_Sk_AttributeGroupItemProvider != null) schloss_Sk_AttributeGroupItemProvider.dispose();
		if (schloss_Sonderanlage_AttributeGroupItemProvider != null) schloss_Sonderanlage_AttributeGroupItemProvider.dispose();
		if (schloss_Ssp_AttributeGroupItemProvider != null) schloss_Ssp_AttributeGroupItemProvider.dispose();
		if (schloss_W_AttributeGroupItemProvider != null) schloss_W_AttributeGroupItemProvider.dispose();
		if (schlosskombinationItemProvider != null) schlosskombinationItemProvider.dispose();
		if (schlosskombination_Bezeichnung_AttributeGroupItemProvider != null) schlosskombination_Bezeichnung_AttributeGroupItemProvider.dispose();
		if (schluesselItemProvider != null) schluesselItemProvider.dispose();
		if (schluessel_Allg_AttributeGroupItemProvider != null) schluessel_Allg_AttributeGroupItemProvider.dispose();
		if (schluessel_Bartform_TypeClassItemProvider != null) schluessel_Bartform_TypeClassItemProvider.dispose();
		if (schluessel_Bezeichnung_AttributeGroupItemProvider != null) schluessel_Bezeichnung_AttributeGroupItemProvider.dispose();
		if (schluessel_Gruppe_TypeClassItemProvider != null) schluessel_Gruppe_TypeClassItemProvider.dispose();
		if (schluessel_In_Grdst_Eingeschl_TypeClassItemProvider != null) schluessel_In_Grdst_Eingeschl_TypeClassItemProvider.dispose();
		if (schluesselsperreItemProvider != null) schluesselsperreItemProvider.dispose();
		if (sonderanlage_Lage_TypeClassItemProvider != null) sonderanlage_Lage_TypeClassItemProvider.dispose();
		if (technisch_Berechtigter_TypeClassItemProvider != null) technisch_Berechtigter_TypeClassItemProvider.dispose();
		if (verschluss_Ort_TypeClassItemProvider != null) verschluss_Ort_TypeClassItemProvider.dispose();
		if (w_Anbaulage_TypeClassItemProvider != null) w_Anbaulage_TypeClassItemProvider.dispose();
		if (w_Lage_TypeClassItemProvider != null) w_Lage_TypeClassItemProvider.dispose();
	}

}