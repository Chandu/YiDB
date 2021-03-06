package com.ebay.cloud.cms.model.raptor_paas;

import java.util.List;
import java.util.ArrayList;


import com.ebay.cloud.cms.typsafe.entity.GenericCMSEntity;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * CMS generated entity.
 * This class is generated by CMS type-safe api model exporter, DON'T modify this class.
 * 
 */
public class LOJApplicationService extends GenericCMSEntity {


	public LOJApplicationService() {
		set_type(get_metaclass());
//		set_repo("raptor-paas");
	}

	// the getter/setter method
	
		
	public LOJDataService getDependOn(){
		return (LOJDataService)getFieldValue("dependOn");
	}

	public void setDependOn(LOJDataService attrVal_dependOn){
		setFieldValue("dependOn", attrVal_dependOn);
	}
		
	public LOJServiceInstance getServiceInstance(){
		return (LOJServiceInstance)getFieldValue("serviceInstance");
	}

	public void setServiceInstance(LOJServiceInstance attrVal_serviceInstance){
		setFieldValue("serviceInstance", attrVal_serviceInstance);
	}

	public String getName(){
		return (String)getFieldValue("name");
	}

	public void setName(String attrVal_name){
		setFieldValue("name", attrVal_name);
	}
		
	public List<LOJDataService> getDependOns(){
		return (List<LOJDataService>) getFieldValue("dependOns");
	}

	public void setDependOns(List<LOJDataService> attrVals_dependOns){
		setFieldValue("dependOns", attrVals_dependOns);
	}
	
	public void addDependOns(LOJDataService attrVal_dependOns){
		addFieldValue("dependOns", attrVal_dependOns);
	}

	public String getLabel(){
		return (String)getFieldValue("label");
	}

	public void setLabel(String attrVal_label){
		setFieldValue("label", attrVal_label);
	}
		
	public List<LOJServiceInstance> getServiceInstances(){
		return (List<LOJServiceInstance>) getFieldValue("serviceInstances");
	}

	public void setServiceInstances(List<LOJServiceInstance> attrVals_serviceInstances){
		setFieldValue("serviceInstances", attrVals_serviceInstances);
	}
	
	public void addServiceInstances(LOJServiceInstance attrVal_serviceInstances){
		addFieldValue("serviceInstances", attrVal_serviceInstances);
	}

	@JsonIgnore
	public String get_metaclass(){
		return "LOJApplicationService";
	}
	
}