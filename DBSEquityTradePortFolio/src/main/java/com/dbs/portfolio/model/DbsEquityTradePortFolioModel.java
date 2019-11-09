package com.dbs.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "dbsDbH8", name = "transdata")
public class DbsEquityTradePortFolioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dbsequitytradePortfolioid")
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
