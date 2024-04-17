-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3340
-- Generation Time: May 31, 2023 at 03:59 AM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlylophoc`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbldiem`
--

CREATE TABLE `tbldiem` (
  `MaSV` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaMH` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DiemCC` float NOT NULL,
  `DiemGK` float NOT NULL,
  `DiemCK` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tbldiem`
--

INSERT INTO `tbldiem` (`MaSV`, `MaMH`, `DiemCC`, `DiemGK`, `DiemCK`) VALUES
('SV01', 'MH01', 10, 5, 6),
('SV01', 'MH02', 10, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tblgiangvien`
--

CREATE TABLE `tblgiangvien` (
  `MaGV` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenGV` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaKhoa` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `GioiTinh` int NOT NULL,
  `NgaySinh` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SDT` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DiaChi` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Hinh` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tblgiangvien`
--

INSERT INTO `tblgiangvien` (`MaGV`, `TenGV`, `MaKhoa`, `GioiTinh`, `NgaySinh`, `SDT`, `Email`, `DiaChi`, `Hinh`) VALUES
('GV01', 'Nguyen Thi B', 'CNTT', 0, '2023-05-05', '0121212121', 'thib@gmail.com', 'Ha Dong', 'C:\\Users\\khai.dv\\Desktop\\Ảnh\\avatar.jpg'),
('GV02', 'Nguyen Van C', 'QTKD', 1, '2023-05-05', '0121212122', 'thic@gmail.com', 'Ha Dong', 'C:\\Users\\khai.dv\\Desktop\\Ảnh\\avatar.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `tblhocphi`
--

CREATE TABLE `tblhocphi` (
  `MaSV` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DaDong` decimal(18,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tblhocphi`
--

INSERT INTO `tblhocphi` (`MaSV`, `DaDong`) VALUES
('SV01', '1500000');

-- --------------------------------------------------------

--
-- Table structure for table `tblkhoa`
--

CREATE TABLE `tblkhoa` (
  `MaKhoa` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenKhoa` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tblkhoa`
--

INSERT INTO `tblkhoa` (`MaKhoa`, `TenKhoa`) VALUES
('CNTT', 'Công nghệ thông tin'),
('QTKD', 'Quản trị kinh doanh');

-- --------------------------------------------------------

--
-- Table structure for table `tbllop`
--

CREATE TABLE `tbllop` (
  `MaLop` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenLop` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaKhoa` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tbllop`
--

INSERT INTO `tbllop` (`MaLop`, `TenLop`, `MaKhoa`) VALUES
('LOP01', 'Lớp 01', 'CNTT'),
('LOP02', 'Lớp 02', 'CNTT');

-- --------------------------------------------------------

--
-- Table structure for table `tblmonhoc`
--

CREATE TABLE `tblmonhoc` (
  `MaMH` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenMH` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaKhoa` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoTinChi` int NOT NULL,
  `HocPhi` decimal(18,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tblmonhoc`
--

INSERT INTO `tblmonhoc` (`MaMH`, `TenMH`, `MaKhoa`, `SoTinChi`, `HocPhi`) VALUES
('MH01', 'Lập trình Java', 'CNTT', 12, '190000'),
('MH02', 'Lập trình C#', 'QTKD', 11, '130000');

-- --------------------------------------------------------

--
-- Table structure for table `tblphancong`
--

CREATE TABLE `tblphancong` (
  `MaGV` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaMH` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tblphancong`
--

INSERT INTO `tblphancong` (`MaGV`, `MaMH`) VALUES
('GV01', 'MH01'),
('GV01', 'MH02');

-- --------------------------------------------------------

--
-- Table structure for table `tblsinhvien`
--

CREATE TABLE `tblsinhvien` (
  `MaSV` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenSV` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaLop` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `GioiTinh` int NOT NULL,
  `NgaySinh` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SDT` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DiaChi` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Hinh` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tblsinhvien`
--

INSERT INTO `tblsinhvien` (`MaSV`, `TenSV`, `MaLop`, `GioiTinh`, `NgaySinh`, `SDT`, `Email`, `DiaChi`, `Hinh`) VALUES
('SV01', 'Nguyễn Văn A', 'LOP02', 1, '2023-05-09', '099999995', 'vana@gmail.com', 'ha Noi', 'C:\\Users\\khai.dv\\Desktop\\Ảnh\\avatar.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `tbltaikhoan`
--

CREATE TABLE `tbltaikhoan` (
  `username` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `PhanQuyen` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tbltaikhoan`
--

INSERT INTO `tbltaikhoan` (`username`, `password`, `Email`, `PhanQuyen`) VALUES
('admin', '1', 'admin@gmail.com', 2),
('khai', '1', 'khai@gmail.com', 1),
('vana@gmail.com', '1', 'vana@gmail.com', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbltinchi`
--

CREATE TABLE `tbltinchi` (
  `MaSV` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaMH` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoTinChi` int NOT NULL,
  `HocPhi` decimal(18,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tbltinchi`
--

INSERT INTO `tbltinchi` (`MaSV`, `MaMH`, `SoTinChi`, `HocPhi`) VALUES
('SV01', 'MH02', 11, '130000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblgiangvien`
--
ALTER TABLE `tblgiangvien`
  ADD PRIMARY KEY (`MaGV`),
  ADD KEY `MaKhoa` (`MaKhoa`);

--
-- Indexes for table `tblkhoa`
--
ALTER TABLE `tblkhoa`
  ADD PRIMARY KEY (`MaKhoa`);

--
-- Indexes for table `tbllop`
--
ALTER TABLE `tbllop`
  ADD PRIMARY KEY (`MaLop`),
  ADD KEY `MaKhoa` (`MaKhoa`);

--
-- Indexes for table `tblmonhoc`
--
ALTER TABLE `tblmonhoc`
  ADD PRIMARY KEY (`MaMH`),
  ADD KEY `MaKhoa` (`MaKhoa`);

--
-- Indexes for table `tblphancong`
--
ALTER TABLE `tblphancong`
  ADD PRIMARY KEY (`MaGV`,`MaMH`),
  ADD KEY `MaMH` (`MaMH`);

--
-- Indexes for table `tblsinhvien`
--
ALTER TABLE `tblsinhvien`
  ADD PRIMARY KEY (`MaSV`),
  ADD KEY `MaLop` (`MaLop`);

--
-- Indexes for table `tbltaikhoan`
--
ALTER TABLE `tbltaikhoan`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `tbltinchi`
--
ALTER TABLE `tbltinchi`
  ADD PRIMARY KEY (`MaSV`,`MaMH`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tblgiangvien`
--
ALTER TABLE `tblgiangvien`
  ADD CONSTRAINT `tblgiangvien_ibfk_1` FOREIGN KEY (`MaKhoa`) REFERENCES `tblkhoa` (`MaKhoa`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbllop`
--
ALTER TABLE `tbllop`
  ADD CONSTRAINT `tbllop_ibfk_1` FOREIGN KEY (`MaKhoa`) REFERENCES `tblkhoa` (`MaKhoa`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tblmonhoc`
--
ALTER TABLE `tblmonhoc`
  ADD CONSTRAINT `tblmonhoc_ibfk_1` FOREIGN KEY (`MaKhoa`) REFERENCES `tblkhoa` (`MaKhoa`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tblphancong`
--
ALTER TABLE `tblphancong`
  ADD CONSTRAINT `tblphancong_ibfk_1` FOREIGN KEY (`MaGV`) REFERENCES `tblgiangvien` (`MaGV`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tblphancong_ibfk_2` FOREIGN KEY (`MaMH`) REFERENCES `tblmonhoc` (`MaMH`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tblsinhvien`
--
ALTER TABLE `tblsinhvien`
  ADD CONSTRAINT `tblsinhvien_ibfk_1` FOREIGN KEY (`MaLop`) REFERENCES `tbllop` (`MaLop`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
