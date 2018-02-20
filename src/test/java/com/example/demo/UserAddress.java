package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "user_address", schema = "sys", catalog = "")
public class UserAddress {
	private int id;
	private String city;
	private User userByUserId;

	@Id
	@Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "city", nullable = true, length = 50)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		UserAddress that = (UserAddress) o;

		if (id != that.id)
			return false;
		if (city != null ? !city.equals(that.city) : that.city != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (city != null ? city.hashCode() : 0);
		return result;
	}

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	public User getUserByUserId() {
		return userByUserId;
	}

	public void setUserByUserId(User userByUserId) {
		this.userByUserId = userByUserId;
	}
}
