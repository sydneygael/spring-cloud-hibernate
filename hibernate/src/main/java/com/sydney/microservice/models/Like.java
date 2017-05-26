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

/**
 * Like generated by hbm2java
 */
@Entity
@Table(name = "like", catalog = "placetosee")
public class Like implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 9006205467840327317L;
	private LikeId id;
	private Lieu lieu;
	private User user;
	private boolean isLiking;

	public Like() {
	}

	public Like(LikeId id, Lieu lieu, User user, boolean isLiking) {
		this.id = id;
		this.lieu = lieu;
		this.user = user;
		this.isLiking = isLiking;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false)),
			@AttributeOverride(name = "lieuId", column = @Column(name = "lieu_id", nullable = false)) })
	public LikeId getId() {
		return this.id;
	}

	public void setId(LikeId id) {
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

	@Column(name = "is_liking", nullable = false)
	public boolean isIsLiking() {
		return this.isLiking;
	}

	public void setIsLiking(boolean isLiking) {
		this.isLiking = isLiking;
	}

}
