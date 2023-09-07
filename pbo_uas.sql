-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 04, 2023 at 10:53 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo_uas`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id_customer` int(12) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id_customer`, `nama`, `alamat`, `phone`) VALUES
(7, 'farhan', 'malang', '0822537768');

-- --------------------------------------------------------

--
-- Table structure for table `data_service`
--

CREATE TABLE `data_service` (
  `id_data_service` int(11) NOT NULL,
  `id_detail_barang` int(12) NOT NULL,
  `service_tambahan` varchar(255) NOT NULL,
  `deskripsi` varchar(255) NOT NULL,
  `HistoryKeluhan` datetime NOT NULL,
  `price` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `detail_barang`
--

CREATE TABLE `detail_barang` (
  `id_detail_barang` int(11) NOT NULL,
  `merk_laptop` varchar(255) NOT NULL,
  `serial_number` varchar(255) NOT NULL,
  `keterangan_barang` varchar(255) NOT NULL,
  `tgl_masuk` datetime NOT NULL,
  `id_user` int(12) NOT NULL,
  `status` enum('selesai dikerjakan','sedang dikerjakan','belum dikerjakan') NOT NULL,
  `nomor_barang` varchar(255) DEFAULT NULL,
  `id_customer` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `detail_sperpart`
--

CREATE TABLE `detail_sperpart` (
  `id_sperpart` int(12) NOT NULL,
  `id_data_service` int(11) NOT NULL,
  `nama_sperpart` varchar(255) NOT NULL,
  `harga_sperpart` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `id_detail_barang` int(11) NOT NULL,
  `nama_pengambil` varchar(100) NOT NULL,
  `tanggal_transaksi` datetime NOT NULL,
  `total_harga` double NOT NULL,
  `Nomor_Transaksi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(12) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `role` enum('admin','staff') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `nama`, `role`) VALUES
(11, 'admin', 'admin', 'admin', 'admin'),
(12, 'staff', 'staff', 'staff', 'staff');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indexes for table `data_service`
--
ALTER TABLE `data_service`
  ADD PRIMARY KEY (`id_data_service`),
  ADD KEY `id_detail_barang` (`id_detail_barang`);

--
-- Indexes for table `detail_barang`
--
ALTER TABLE `detail_barang`
  ADD PRIMARY KEY (`id_detail_barang`),
  ADD KEY `id_customer` (`id_customer`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `detail_sperpart`
--
ALTER TABLE `detail_sperpart`
  ADD PRIMARY KEY (`id_sperpart`),
  ADD KEY `id_data_service` (`id_data_service`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_order_service` (`id_detail_barang`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id_customer` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `data_service`
--
ALTER TABLE `data_service`
  MODIFY `id_data_service` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `detail_barang`
--
ALTER TABLE `detail_barang`
  MODIFY `id_detail_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `detail_sperpart`
--
ALTER TABLE `detail_sperpart`
  MODIFY `id_sperpart` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `data_service`
--
ALTER TABLE `data_service`
  ADD CONSTRAINT `data_service_ibfk_1` FOREIGN KEY (`id_detail_barang`) REFERENCES `detail_barang` (`id_detail_barang`);

--
-- Constraints for table `detail_barang`
--
ALTER TABLE `detail_barang`
  ADD CONSTRAINT `detail_barang_ibfk_1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`),
  ADD CONSTRAINT `detail_barang_ibfk_2` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Constraints for table `detail_sperpart`
--
ALTER TABLE `detail_sperpart`
  ADD CONSTRAINT `detail_sperpart_ibfk_1` FOREIGN KEY (`id_data_service`) REFERENCES `data_service` (`id_data_service`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_detail_barang`) REFERENCES `detail_barang` (`id_detail_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
