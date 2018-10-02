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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="sanpham")
public class SanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int masanpham;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="madanhmuc")
	DanhMucSanPham danhMucSanPham;
	
	String giatien;
	String mota;
	String anhsanpham;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="masanpham")
	Set<ChiTietSanPham> chiTietSanPhams;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="chitietkhuyenmai",
	joinColumns={@JoinColumn(name="masanpham", referencedColumnName="masanpham")},
	inverseJoinColumns= {@JoinColumn(name="makhuyenmai", referencedColumnName="makhuyenmai")}
	)
	Set<KhuyenMai> khuyenMai;
	
	
	
	public Set<ChiTietSanPham> getChiTietSanPhams() {
		return chiTietSanPhams;
	}
	public void setChiTietSanPhams(Set<ChiTietSanPham> chiTietSanPhams) {
		this.chiTietSanPhams = chiTietSanPhams;
	}
	public Set<KhuyenMai> getKhuyenMai() {
		return khuyenMai;
	}
	public void setKhuyenMai(Set<KhuyenMai> khuyenMai) {
		this.khuyenMai = khuyenMai;
	}
	public int getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(int masanpham) {
		this.masanpham = masanpham;
	}
	public DanhMucSanPham getDanhMucSanPham() {
		return danhMucSanPham;
	}
	public void setDanhMucSanPham(DanhMucSanPham danhMucSanPham) {
		this.danhMucSanPham = danhMucSanPham;
	}
	public String getGiatien() {
		return giatien;
	}
	public void setGiatien(String giatien) {
		this.giatien = giatien;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public String getAnhsanpham() {
		return anhsanpham;
	}
	public void setAnhsanpham(String anhsanpham) {
		this.anhsanpham = anhsanpham;
	}
	
	
}
