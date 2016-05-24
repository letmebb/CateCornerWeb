package org.dullnull.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user", catalog = "catecorner")
public class User implements Serializable {

	/**
	 * 用户实体类 author:lisheng
	 */
	private static final long serialVersionUID = 6936120896390866161L;

	private Integer user_id;
	private String user_tele;
	private String user_pass;
	private String user_email;
	private String user_name;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "user_id", unique = true, nullable = true)
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Column(name = "user_tele", unique = true, nullable = true)
	public String getUser_tele() {
		return user_tele;
	}

	public void setUser_tele(String user_tele) {
		this.user_tele = user_tele;
	}

	@Column(name = "user_pass", nullable = true)
	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	@Column(name = "user_email", unique = true, nullable = true)
	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	@Column(name = "user_name", unique = true, nullable = true)
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override
	public String toString() {
		return "User实体类";
	}
}
