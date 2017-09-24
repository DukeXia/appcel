package com.appcel.kernel.mybatis.model;

import java.io.Serializable;
/**
 * 
* @ClassName: BaseModel 
* @Description: TODO
* @author duke xia
* @date 2017年9月24日 下午8:33:55 
*
 */
public  class BaseModel implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 6696120955071618518L;
	
	private Long id;
	private String key;
	private String version;
	public Long getId() {
		return id;
	}
	public void setId( Long id ) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey( String key ) {
		this.key = key;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion( String version ) {
		this.version = version;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
		result = prime * result + ( ( key == null ) ? 0 : key.hashCode() );
		result = prime * result + ( ( version == null ) ? 0 : version.hashCode() );
		return result;
	}
	@Override
	public boolean equals( Object obj ) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		BaseModel other = (BaseModel) obj;
		if ( id == null ) {
			if ( other.id != null ) return false;
		} else if ( !id.equals( other.id ) ) return false;
		if ( key == null ) {
			if ( other.key != null ) return false;
		} else if ( !key.equals( other.key ) ) return false;
		if ( version == null ) {
			if ( other.version != null ) return false;
		} else if ( !version.equals( other.version ) ) return false;
		return true;
	}
	
	
	

	@Override
	public String toString() {
		return "BaseModel [id=" + id + ", key=" + key + ", version=" + version + ", hashCode()=" + hashCode()
				+ ", getId()=" + getId() + ", getKey()=" + getKey() + ", getVersion()=" + getVersion() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
