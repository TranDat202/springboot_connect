package com.learncode.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aa2")
public class Student {
	@Id
	@GeneratedValue(strategy   = GenerationType.IDENTITY)
	private Long Rollno;
	private String name;
	private int mark;
	private String lan;
	private String ma;
	public Student() {
		super();
	}
	public Student(Long rollno, String name, int mark, String lan, String ma) {
		super();
		Rollno = rollno;
		this.name = name;
		this.mark = mark;
		this.lan = lan;
		this.ma = ma;
	}
	public Long getRollno() {
		return Rollno;
	}
	public void setRollno(Long rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getLan() {
		return lan;
	}
	public void setLan(String lan) {
		this.lan = lan;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", name=" + name + ", mark=" + mark + ", lan=" + lan + ", ma=" + ma + "]";
	}
	
}
