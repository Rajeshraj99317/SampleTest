package com.app;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;


public class Employee {
	
	//implements InitializingBean,DisposableBean

	
	private int empId;
	private String empName;
	private double empSal;
	private List<String> data;
	private Map<Integer,String>  mapData;
	private Properties propertiesData;
	
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	@Required
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	@Required
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
		public List<String> getData() {
			return data;
		}
		public void setData(List<String> data) {
			this.data = data;
		}
		
		public Map<Integer, String> getMapData() {
			return mapData;
		}
		public void setMapData(Map<Integer, String> mapData) {
			this.mapData = mapData;
		}
		
		public Properties getPropertiesData() {
			return propertiesData;
		}
		public void setPropertiesData(Properties propertiesData) {
			this.propertiesData = propertiesData;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName
					+ ", empSal=" + empSal + ", data=" + data + ", mapData="
					+ mapData + ", propertiesData=" + propertiesData + "]";
		}

		}





