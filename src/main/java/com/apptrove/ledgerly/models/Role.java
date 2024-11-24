package com.apptrove.ledgerly.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Role {

	private Integer roleId;
	
	private RoleEnum roleName;
	
	private Date createdOn;
	
	private boolean isActive;
	
}
