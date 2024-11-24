package com.apptrove.ledgerly.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "com_ldgr_bldng_mst")
public class BUILDING_MST {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bldng_id")
	private Integer bldngId;
	
	@Column(name = "bldng_name")
	private String bldngName;
	
	@Column(name = "bldng_block")
	private String bldngBlock;
	
	@Column(name = "no_of_apartments")
	private Integer noOfAptmnts;
	
	@Column(name = "maker_id")
	private Integer makerId;
	
	@Column(name = "author_id")
	private Integer authorId;
	
	@Column(name = "maker_date")
	private Date makerDate;
	
	@Column(name = "authot_date")
	private Date authorDate;
	
	@Column(name = "is_active")
	private Boolean isActive;

}
