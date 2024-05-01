package com.mvn.collection_all;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private List<String> enames;
    private Set<Integer> eId;
    private Map<String,Integer> edeptnum;
    private Properties esalary;
    public Employee(List<String> enames,Set<Integer> eId,Map<String,Integer> edeptnum,Properties esalary) {
    	this. enames= enames;
    	this.eId=eId;
    	this.edeptnum=edeptnum;
    	this.esalary=esalary;
    }
    public Employee() {
    	
    }
	public List<String> getEnames() {
		return enames;
	}
	public void setEnames(List<String> enames) {
		this.enames = enames;
	}
	public Set<Integer> geteId() {
		return eId;
	}
	public void seteId(Set<Integer> eId) {
		this.eId = eId;
	}
	public Map<String, Integer> getEdeptnum() {
		return edeptnum;
	}
	public void setEdeptnum(Map<String, Integer> edeptnum) {
		this.edeptnum = edeptnum;
	}
	public Properties getEsalary() {
		return esalary;
	}
	public void setEsalary(Properties esalary) {
		this.esalary = esalary;
	}
    
	public void print() {
		System.out.println("Employee Names: " + enames);
        System.out.println("Employee IDs: " + eId);
        System.out.println("Employee Department Numbers: " + edeptnum);
        System.out.println("Employee Salaries: " + esalary);
	}
    
    
}
