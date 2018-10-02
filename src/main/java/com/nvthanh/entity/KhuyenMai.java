package com.nvthanh.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="khuyenmai")
public class KhuyenMai {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int makhuyenmai;
	int giamgia;
	String tenkhuyenmai;
	String thoigianbatdau;
	String thoigianketthuc;
	String mota;
	String anhkhuyenmai;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="chitietkhuyenmai",
	joinColumns={@JoinColumn(name="makhuyenmai", referencedColumnName="makhuyenmai")},
	inverseJoinColumns= {@JoinColumn(name="masanpham", referencedColumnName="masanpham")}
	)
	Set<SanPham> sanPhams;

	public int getMakhuyenmai() {
		return makhuyenmai;
	}

	public void setMakhuyenmai(int makhuyenmai) {
		this.makhuyenmai = makhuyenmai;
	}

	public int getGiamgia() {
		return giamgia;
	}

	public void setGiamgia(int giamgia) {
		this.giamgia = giamgia;
	}

	public String getTenkhuyenmai() {
		return tenkhuyenmai;
	}

	public void setTenkhuyenmai(String tenkhuyenmai) {
		this.tenkhuyenmai = tenkhuyenmai;
	}

	public String getThoigianbatdau() {
		return thoigianbatdau;
	}

	public void setThoigianbatdau(String thoigianbatdau) {
		this.thoigianbatdau = thoigianbatdau;
	}

	public String getThoigianketthuc() {
		return thoigianketthuc;
	}

	public void setThoigianketthuc(String thoigianketthuc) {
		this.thoigianketthuc = thoigianketthuc;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getAnhkhuyenmai() {
		return anhkhuyenmai;
	}

	public void setAnhkhuyenmai(String anhkhuyenmai) {
		this.anhkhuyenmai = anhkhuyenmai;
	}

	public Set<SanPham> getSanPhams() {
		return sanPhams;
	}

	public void setSanPhams(Set<SanPham> sanPhams) {
		this.sanPhams = sanPhams;
	}
	
	
}
