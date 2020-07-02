package com.memoire.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Departement implements Serializable {
	@Id
	private String nomDepartement;
	@OneToMany (mappedBy = "departement",fetch = FetchType.LAZY)
	private Collection<Ensigniant> ensigniantsapartient;

}
