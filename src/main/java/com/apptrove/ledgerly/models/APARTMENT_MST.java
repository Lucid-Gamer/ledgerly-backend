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

@Entity
@Table(name = "com_ldgr_aptmnt_mst")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class APARTMENT_MST {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aptmnt_id")
	private Integer aptmntId;
	
	@Column(name = "bldng_id")
	private Integer bldngId;
	
	@Column(name = "aptmnt_no")
	private String aptmntNo;
	
	@Column(name = "aptmnt_desc")
	private String aptmntDesc;
	
	@Column(name = "maker_id")
	private String makerId;
	
	@Column(name = "maker_date")
	private Date makerDate;
	
	@Column(name = "author_id")
	private String authorId; 
	
	@Column(name = "author_date")
	private Date authorDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	

}
