create table chucvu(
	machucvu integer auto_increment,
    tenchucvu nvarchar(30),
    primary key(machucvu)
);

create table nhanvien(
	manhanvien integer auto_increment,
    hoten nvarchar(30),
    diachi nvarchar(200),
    gioitinh bit,
    cmnd char(14),
    machucvu integer,
    email varchar(50),
    tendangnhap varchar(50),
    matkhau varchar(50),
    primary key(manhanvien),
    constraint FK_nhanvien_chucvu foreign key(machucvu)
    references chucvu(machucvu)
);

create table danhmucsanpham(
	madanhmuc integer auto_increment,
    tendanhmuc nvarchar(100),
    anhdanhmuc text,
    primary key(madanhmuc)
);

create table sanpham(
	masanpham integer auto_increment,
    madanhmuc integer,
    tensanpham nvarchar(100),
    giatien varchar(50),
    mota text,
    anhsanpham text,
    primary key(masanpham),
    constraint FK_sanpham_danhmuc foreign key(madanhmuc)
    references danhmucsanpham(madanhmuc)
);

create table mausanpham(
	mamau integer auto_increment,
    tenmau nvarchar(50),
    primary key(mamau)
);

create table sizesanpham(
	masize integer auto_increment,
    size nvarchar(20),
    primary key(masize)
);

create table chitietsanpham(
	machitietsanpham integer auto_increment,
    masanpham integer,
    masize integer,
    mamau integer,
    soluong integer,
    ngaynhap varchar(50),
    primary key(machitietsanpham),
    constraint FK_chitiet_sanpham foreign key(masanpham)
    references sanpham(masanpham),
    constraint FK_chitiet_size foreign key(masize)
    references sizesanpham(masize),
    constraint FK_chitiet_masanpham foreign key(mamau)
    references mausanpham(mamau)
);

create table khuyenmai(
	makhuyenmai integer auto_increment,
    tenkhuyenmai nvarchar(200),
    thoigianbatdau nvarchar(50),
    thoigianketthuc nvarchar(50),
    mota text,
    anhkhuyenmai text,
    giamgia integer,
    primary key(makhuyenmai)
);

create table chitietkhuyenmai(
	makhuyenmai integer,
    masanpham integer,
    primary key(makhuyenmai, masanpham),
    constraint FK_chitietkhuyenmai_sanpham foreign key(masanpham)
    references sanpham(masanpham)
);

create table hoadon(
	mahoadon integer auto_increment,
    tenkhachhang nvarchar(100),
    sodt char(12),
    diachigiaohang nvarchar(200),
    tinhtrang bit,
    ngaylap varchar(50),
    primary key(mahoadon)
);

create table chitiethoadon(
	mahoadon integer,
    machitietsanpham integer,
    soluong integer,
    giatien varchar(100),
    primary key(mahoadon, machitietsanpham),
    constraint FK_cthoadon_hoadon foreign key(mahoadon)
    references hoadon(mahoadon),
     constraint FK_cthoadon_ctsanpham foreign key(machitietsanpham)
     references chitietsanpham(machitietsanpham)
)

