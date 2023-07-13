/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Layoutinformationen.provider;

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

import org.eclipse.set.model.model11001.Layoutinformationen.util.LayoutinformationenAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutinformationenItemProviderAdapterFactory extends LayoutinformationenAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public LayoutinformationenItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Bez_Lageplan_Blattschnitt_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bez_Lageplan_Blattschnitt_TypeClassItemProvider bez_Lageplan_Blattschnitt_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Bez_Lageplan_Blattschnitt_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBez_Lageplan_Blattschnitt_TypeClassAdapter() {
		if (bez_Lageplan_Blattschnitt_TypeClassItemProvider == null) {
			bez_Lageplan_Blattschnitt_TypeClassItemProvider = new Bez_Lageplan_Blattschnitt_TypeClassItemProvider(this);
		}

		return bez_Lageplan_Blattschnitt_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Bezeichnung_Lageplan_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bezeichnung_Lageplan_TypeClassItemProvider bezeichnung_Lageplan_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Bezeichnung_Lageplan_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBezeichnung_Lageplan_TypeClassAdapter() {
		if (bezeichnung_Lageplan_TypeClassItemProvider == null) {
			bezeichnung_Lageplan_TypeClassItemProvider = new Bezeichnung_Lageplan_TypeClassItemProvider(this);
		}

		return bezeichnung_Lageplan_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_GEO_Punkt_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Darstellung_GEO_Punkt_TypeClassItemProvider darstellung_GEO_Punkt_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_GEO_Punkt_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDarstellung_GEO_Punkt_TypeClassAdapter() {
		if (darstellung_GEO_Punkt_TypeClassItemProvider == null) {
			darstellung_GEO_Punkt_TypeClassItemProvider = new Darstellung_GEO_Punkt_TypeClassItemProvider(this);
		}

		return darstellung_GEO_Punkt_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_Polygonzug_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Darstellung_Polygonzug_TypeClassItemProvider darstellung_Polygonzug_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_Polygonzug_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDarstellung_Polygonzug_TypeClassAdapter() {
		if (darstellung_Polygonzug_TypeClassItemProvider == null) {
			darstellung_Polygonzug_TypeClassItemProvider = new Darstellung_Polygonzug_TypeClassItemProvider(this);
		}

		return darstellung_Polygonzug_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_Richtungswinkel_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Darstellung_Richtungswinkel_TypeClassItemProvider darstellung_Richtungswinkel_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Darstellung_Richtungswinkel_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDarstellung_Richtungswinkel_TypeClassAdapter() {
		if (darstellung_Richtungswinkel_TypeClassItemProvider == null) {
			darstellung_Richtungswinkel_TypeClassItemProvider = new Darstellung_Richtungswinkel_TypeClassItemProvider(this);
		}

		return darstellung_Richtungswinkel_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element_PositionItemProvider element_PositionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElement_PositionAdapter() {
		if (element_PositionItemProvider == null) {
			element_PositionItemProvider = new Element_PositionItemProvider(this);
		}

		return element_PositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position_Allg_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element_Position_Allg_AttributeGroupItemProvider element_Position_Allg_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Position_Allg_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElement_Position_Allg_AttributeGroupAdapter() {
		if (element_Position_Allg_AttributeGroupItemProvider == null) {
			element_Position_Allg_AttributeGroupItemProvider = new Element_Position_Allg_AttributeGroupItemProvider(this);
		}

		return element_Position_Allg_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Stil} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element_StilItemProvider element_StilItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Stil}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElement_StilAdapter() {
		if (element_StilItemProvider == null) {
			element_StilItemProvider = new Element_StilItemProvider(this);
		}

		return element_StilItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Stil_Allg_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element_Stil_Allg_AttributeGroupItemProvider element_Stil_Allg_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Element_Stil_Allg_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElement_Stil_Allg_AttributeGroupAdapter() {
		if (element_Stil_Allg_AttributeGroupItemProvider == null) {
			element_Stil_Allg_AttributeGroupItemProvider = new Element_Stil_Allg_AttributeGroupItemProvider(this);
		}

		return element_Stil_Allg_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Fuellung_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fuellung_TypeClassItemProvider fuellung_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Fuellung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFuellung_TypeClassAdapter() {
		if (fuellung_TypeClassItemProvider == null) {
			fuellung_TypeClassItemProvider = new Fuellung_TypeClassItemProvider(this);
		}

		return fuellung_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LageplanItemProvider lageplanItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLageplanAdapter() {
		if (lageplanItemProvider == null) {
			lageplanItemProvider = new LageplanItemProvider(this);
		}

		return lageplanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Art_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lageplan_Art_TypeClassItemProvider lageplan_Art_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Art_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLageplan_Art_TypeClassAdapter() {
		if (lageplan_Art_TypeClassItemProvider == null) {
			lageplan_Art_TypeClassItemProvider = new Lageplan_Art_TypeClassItemProvider(this);
		}

		return lageplan_Art_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lageplan_Bezeichnung_AttributeGroupItemProvider lageplan_Bezeichnung_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLageplan_Bezeichnung_AttributeGroupAdapter() {
		if (lageplan_Bezeichnung_AttributeGroupItemProvider == null) {
			lageplan_Bezeichnung_AttributeGroupItemProvider = new Lageplan_Bezeichnung_AttributeGroupItemProvider(this);
		}

		return lageplan_Bezeichnung_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lageplan_BlattschnittItemProvider lageplan_BlattschnittItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLageplan_BlattschnittAdapter() {
		if (lageplan_BlattschnittItemProvider == null) {
			lageplan_BlattschnittItemProvider = new Lageplan_BlattschnittItemProvider(this);
		}

		return lageplan_BlattschnittItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lageplan_Blattschnitt_Bezeichnung_AttributeGroupItemProvider lageplan_Blattschnitt_Bezeichnung_AttributeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLageplan_Blattschnitt_Bezeichnung_AttributeGroupAdapter() {
		if (lageplan_Blattschnitt_Bezeichnung_AttributeGroupItemProvider == null) {
			lageplan_Blattschnitt_Bezeichnung_AttributeGroupItemProvider = new Lageplan_Blattschnitt_Bezeichnung_AttributeGroupItemProvider(this);
		}

		return lageplan_Blattschnitt_Bezeichnung_AttributeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Zustand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lageplan_ZustandItemProvider lageplan_ZustandItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Lageplan_Zustand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLageplan_ZustandAdapter() {
		if (lageplan_ZustandItemProvider == null) {
			lageplan_ZustandItemProvider = new Lageplan_ZustandItemProvider(this);
		}

		return lageplan_ZustandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Linie_Art_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Linie_Art_TypeClassItemProvider linie_Art_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Linie_Art_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinie_Art_TypeClassAdapter() {
		if (linie_Art_TypeClassItemProvider == null) {
			linie_Art_TypeClassItemProvider = new Linie_Art_TypeClassItemProvider(this);
		}

		return linie_Art_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Linie_Farbwert_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Linie_Farbwert_TypeClassItemProvider linie_Farbwert_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Linie_Farbwert_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinie_Farbwert_TypeClassAdapter() {
		if (linie_Farbwert_TypeClassItemProvider == null) {
			linie_Farbwert_TypeClassItemProvider = new Linie_Farbwert_TypeClassItemProvider(this);
		}

		return linie_Farbwert_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Linie_Subart_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Linie_Subart_TypeClassItemProvider linie_Subart_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Linie_Subart_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinie_Subart_TypeClassAdapter() {
		if (linie_Subart_TypeClassItemProvider == null) {
			linie_Subart_TypeClassItemProvider = new Linie_Subart_TypeClassItemProvider(this);
		}

		return linie_Subart_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.PlanPro_Layoutinfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanPro_LayoutinfoItemProvider planPro_LayoutinfoItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.PlanPro_Layoutinfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanPro_LayoutinfoAdapter() {
		if (planPro_LayoutinfoItemProvider == null) {
			planPro_LayoutinfoItemProvider = new PlanPro_LayoutinfoItemProvider(this);
		}

		return planPro_LayoutinfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Polygonzug_Ausrichtung_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Polygonzug_Ausrichtung_TypeClassItemProvider polygonzug_Ausrichtung_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Polygonzug_Ausrichtung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolygonzug_Ausrichtung_TypeClassAdapter() {
		if (polygonzug_Ausrichtung_TypeClassItemProvider == null) {
			polygonzug_Ausrichtung_TypeClassItemProvider = new Polygonzug_Ausrichtung_TypeClassItemProvider(this);
		}

		return polygonzug_Ausrichtung_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Polygonzug_Blattschnitt_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Polygonzug_Blattschnitt_TypeClassItemProvider polygonzug_Blattschnitt_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Polygonzug_Blattschnitt_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolygonzug_Blattschnitt_TypeClassAdapter() {
		if (polygonzug_Blattschnitt_TypeClassItemProvider == null) {
			polygonzug_Blattschnitt_TypeClassItemProvider = new Polygonzug_Blattschnitt_TypeClassItemProvider(this);
		}

		return polygonzug_Blattschnitt_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Referenz_LST_Zustand_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Referenz_LST_Zustand_TypeClassItemProvider referenz_LST_Zustand_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Referenz_LST_Zustand_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenz_LST_Zustand_TypeClassAdapter() {
		if (referenz_LST_Zustand_TypeClassItemProvider == null) {
			referenz_LST_Zustand_TypeClassItemProvider = new Referenz_LST_Zustand_TypeClassItemProvider(this);
		}

		return referenz_LST_Zustand_TypeClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.set.model.model11001.Layoutinformationen.Referenz_Objekt_Darstellung_TypeClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Referenz_Objekt_Darstellung_TypeClassItemProvider referenz_Objekt_Darstellung_TypeClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.set.model.model11001.Layoutinformationen.Referenz_Objekt_Darstellung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenz_Objekt_Darstellung_TypeClassAdapter() {
		if (referenz_Objekt_Darstellung_TypeClassItemProvider == null) {
			referenz_Objekt_Darstellung_TypeClassItemProvider = new Referenz_Objekt_Darstellung_TypeClassItemProvider(this);
		}

		return referenz_Objekt_Darstellung_TypeClassItemProvider;
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
		if (bez_Lageplan_Blattschnitt_TypeClassItemProvider != null) bez_Lageplan_Blattschnitt_TypeClassItemProvider.dispose();
		if (bezeichnung_Lageplan_TypeClassItemProvider != null) bezeichnung_Lageplan_TypeClassItemProvider.dispose();
		if (darstellung_GEO_Punkt_TypeClassItemProvider != null) darstellung_GEO_Punkt_TypeClassItemProvider.dispose();
		if (darstellung_Polygonzug_TypeClassItemProvider != null) darstellung_Polygonzug_TypeClassItemProvider.dispose();
		if (darstellung_Richtungswinkel_TypeClassItemProvider != null) darstellung_Richtungswinkel_TypeClassItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (element_PositionItemProvider != null) element_PositionItemProvider.dispose();
		if (element_Position_Allg_AttributeGroupItemProvider != null) element_Position_Allg_AttributeGroupItemProvider.dispose();
		if (element_StilItemProvider != null) element_StilItemProvider.dispose();
		if (element_Stil_Allg_AttributeGroupItemProvider != null) element_Stil_Allg_AttributeGroupItemProvider.dispose();
		if (fuellung_TypeClassItemProvider != null) fuellung_TypeClassItemProvider.dispose();
		if (lageplanItemProvider != null) lageplanItemProvider.dispose();
		if (lageplan_Art_TypeClassItemProvider != null) lageplan_Art_TypeClassItemProvider.dispose();
		if (lageplan_Bezeichnung_AttributeGroupItemProvider != null) lageplan_Bezeichnung_AttributeGroupItemProvider.dispose();
		if (lageplan_BlattschnittItemProvider != null) lageplan_BlattschnittItemProvider.dispose();
		if (lageplan_Blattschnitt_Bezeichnung_AttributeGroupItemProvider != null) lageplan_Blattschnitt_Bezeichnung_AttributeGroupItemProvider.dispose();
		if (lageplan_ZustandItemProvider != null) lageplan_ZustandItemProvider.dispose();
		if (linie_Art_TypeClassItemProvider != null) linie_Art_TypeClassItemProvider.dispose();
		if (linie_Farbwert_TypeClassItemProvider != null) linie_Farbwert_TypeClassItemProvider.dispose();
		if (linie_Subart_TypeClassItemProvider != null) linie_Subart_TypeClassItemProvider.dispose();
		if (planPro_LayoutinfoItemProvider != null) planPro_LayoutinfoItemProvider.dispose();
		if (polygonzug_Ausrichtung_TypeClassItemProvider != null) polygonzug_Ausrichtung_TypeClassItemProvider.dispose();
		if (polygonzug_Blattschnitt_TypeClassItemProvider != null) polygonzug_Blattschnitt_TypeClassItemProvider.dispose();
		if (referenz_LST_Zustand_TypeClassItemProvider != null) referenz_LST_Zustand_TypeClassItemProvider.dispose();
		if (referenz_Objekt_Darstellung_TypeClassItemProvider != null) referenz_Objekt_Darstellung_TypeClassItemProvider.dispose();
	}

}
