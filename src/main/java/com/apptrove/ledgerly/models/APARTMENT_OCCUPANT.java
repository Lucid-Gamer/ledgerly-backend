package com.apptrove.ledgerly.models;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "com_ldgr_aptmnt_occpnt")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class APARTMENT_OCCUPANT {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "occupant_id")
	private Integer occupant_id;
	
	@ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
	@JoinColumn(name = "aptmnt_id")
	private APARTMENT_MST apartment;
	
	@JoinColumn(name = "bldng_id")
	private BUILDING_MST building;
	
	@Column(name = "occupant_name")
	private String occupantName;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "occupant_name")
	private OccupantEnum occupantType;
	
	@Column(name = "maker_id")
	private String makerId;
	
	@Column(name = "maker_date")
	private Date makerDate;
	
	@Column(name = "author_id")
	private String  authorId;
	
	@Column(name = "author_name")
	private Date authorDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "maker_rmrks")
	private String makerRmrks;
	
	@Column(name = "author_rmrks")
	private String authorRmrks;
	
	@Column(name = "is_leased")
	private boolean isLeased;
	
	@Column(name = "lease_start_date")
	private Date leaseStartDate;
	
	@Column(name = "lease_end_date")
	private Date leaseEndDate;

}
