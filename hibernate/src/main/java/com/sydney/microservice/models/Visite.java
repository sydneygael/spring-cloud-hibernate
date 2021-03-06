package com.sydney.microservice.models;

// Generated 18 mai 2017 16:00:40 by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Visite generated by hbm2java
 */
@Entity
@Table(name = "visite", catalog = "placetosee")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Visite implements java.io.Serializable {

	private static final long serialVersionUID = -4556086836965850684L;
	private VisiteId id;
	private Lieu lieu;
	private User user;

	public Visite() {
	}

	public Visite(VisiteId id, Lieu lieu, User user) {
		this.id = id;
		this.lieu = lieu;
		this.user = user;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false)),
			@AttributeOverride(name = "lieuId", column = @Column(name = "lieu_id", nullable = false)),
			@AttributeOverride(name = "date", column = @Column(name = "date", nullable = false, length = 10)) })
	public VisiteId getId() {
		return this.id;
	}

	public void setId(VisiteId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lieu_id", nullable = false, insertable = false, updatable = false)
	public Lieu getLieu() {
		return this.lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
