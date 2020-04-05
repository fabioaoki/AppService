package br.com.aoki.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author fabio
 *
 */
@XmlRootElement(name= "previsaoDto")
public class PrevisaoDto implements Serializable {

	private static final long serialVersionUID = -2139620035860146403L;
	private Long id;
	private String name;
	private String city;
	private Date dateCity;

	@XmlElement
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@XmlElement
	public Date getDateCity() {
		return dateCity;
	}
	public void setDateCity(Date dateCity) {
		this.dateCity = dateCity;
	}

	public PrevisaoDto(Long id, String name, String city, Date dateCity) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.dateCity = dateCity;
	}

	public PrevisaoDto() {
		
	}
	@Override
	public String toString() {
		return "PrevisaoDto [id=" + id + ", name=" + name + ", city=" + city + ", dateCity=" + dateCity + "]";
	}

	
}
