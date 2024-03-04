-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 04, 2024 at 10:16 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.5.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `preordersystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Admin_ID` varchar(255) NOT NULL DEFAULT 'NUBEadmin@national-u.edu.ph ',
  `Admin_Password` varchar(255) NOT NULL DEFAULT 'Admin123'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `Order_ID` int(10) UNSIGNED ZEROFILL NOT NULL,
  `Student_ID` varchar(11) NOT NULL,
  `Product_ID` varchar(12) NOT NULL,
  `Order_Date` date NOT NULL,
  `Order_Size` varchar(10) NOT NULL,
  `Order_Quantity` int(1) NOT NULL,
  `Payment_Type` varchar(50) NOT NULL,
  `Total_Amount` int(5) NOT NULL,
  `Pickup_Date` varchar(50) NOT NULL DEFAULT 'TBA'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`Order_ID`, `Student_ID`, `Product_ID`, `Order_Date`, `Order_Size`, `Order_Quantity`, `Payment_Type`, `Total_Amount`, `Pickup_Date`) VALUES
(0000000001, '2021-123456', 'NUBEUNIF0008', '2024-01-24', 'S', 1, 'Cash', 600, 'TBA'),
(0000000002, '2021-123457', 'NUBEUNIF009', '2024-02-13', 'M', 2, 'Card', 1200, 'TBA'),
(0000000003, '2021-123483', 'NUBEUNIF0014', '2024-02-18', 'M', 1, 'E-Money', 600, 'TBA'),
(0000000004, '2021-123490', 'NUBEUNIF0010', '2024-03-20', 'XL', 1, 'E-Money', 600, 'TBA'),
(0000000005, '2021-123495', 'NUBEUNIF0019', '2024-03-17', 'L', 2, 'Cash', 1200, 'TBA');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `Product_ID` varchar(12) NOT NULL,
  `Product_Name` varchar(255) NOT NULL,
  `Product_Price` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`Product_ID`, `Product_Name`, `Product_Price`) VALUES
('NUBEUNIF0001', 'Traditional Uniform Blouse \r\n', 560),
('NUBEUNIF0002', 'Traditional Uniform Polo\r\n', 560),
('NUBEUNIF0003', 'Traditional Pants - Female \r\n', 470),
('NUBEUNIF0004', 'Traditional Pants - Male \r\n', 470),
('NUBEUNIF0005', 'Traditional Skirt\r\n', 310),
('NUBEUNIF0006', 'College of Allied Health (CAH) White Skirt\r\n', 450),
('NUBEUNIF0007', 'College of Allied Health (CAH) White Pants\r\n', 550),
('NUBEUNIF0008', 'Psychology Blouse with Mustard Pocket Piping ', 600),
('NUBEUNIF0009', 'Psychology Polo with Gold Pocket Piping\r\n', 600),
('NUBEUNIF0010', 'MedTech Blouse with Green Pocket Piping', 600),
('NUBEUNIF0011', 'MedTech Polo with Green Pocket Piping\r\n', 600),
('NUBEUNIF0012', 'Nursing Blouse with Gold Pocket Piping', 600),
('NUBEUNIF0013', 'Nursing Polo with Gold Pocket Piping\r\n', 600),
('NUBEUNIF0014', 'Pharmacy Blouse with Blue Pocket Piping\r\n', 600),
('NUBEUNIF0015', 'Pharmacy Polo with Blue Pocket Piping\r\n', 600),
('NUBEUNIF0016', 'Tourism Scarf \r\n', 250),
('NUBEUNIF0017', 'Tourism Vest (Unisex)\r\n', 560),
('NUBEUNIF0018', 'Tourism Blazer \r\n', 1260),
('NUBEUNIF0019', 'Tourism Skirt\r\n', 560),
('NUBEUNIF0020', 'Tourism Coat\r\n', 1260),
('NUBEUNIF0021', 'Tourism Pants\r\n', 670),
('NUBEUNIF0022', 'Hospitality & Management Neckerchief \r\n', 100),
('NUBEUNIF0023', 'Hospitality & Management Blouse \r\n', 690),
('NUBEUNIF0024', 'Hospitality & Management Blazer\r\n', 1200),
('NUBEUNIF0025', 'Hospitality & Management Vest - Female\r\n', 495),
('NUBEUNIF0026', 'Hospitality & Management Skirt\r\n', 480),
('NUBEUNIF0027', 'Hospitality & Management Polo Longsleeves\r\n', 820),
('NUBEUNIF0028', 'Hospitality & Management Coat\r\n', 1260),
('NUBEUNIF0029', 'Hospitality & Management Vest - Male\r\n', 590),
('NUBEUNIF0030', 'Hospitality & Management Pants\r\n', 670),
('NUBEUNIF0031', 'PE T-Shirt\r\n', 260),
('NUBEUNIF0032', 'NSTP T-Shirt\r\n', 260),
('NUBEUNIF0033', 'PE Jogging Pants\r\n', 360);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Student_ID` varchar(11) NOT NULL,
  `Student_Name` varchar(100) NOT NULL,
  `Student_Email` varchar(255) NOT NULL,
  `Student_Phone` varchar(11) NOT NULL,
  `Student_College` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`Student_ID`, `Student_Name`, `Student_Email`, `Student_Phone`, `Student_College`) VALUES
('', '', '', '', 'Select a College'),
('2021-123456', 'Hernandez, Jillian R.', 'hernandez@students.national-u.edu.ph', '9123456890', 'CAH'),
('2021-123457', 'Olaco, Kristel Marie P.', 'olaco@students.national-u.edu.ph', '9123456891', 'CAH'),
('2021-123483', 'Rigor, Francyne W.', 'rigor@students.national-u.edu.ph', '9123456892', 'CAH'),
('2021-123490', 'Daet, Mureigne Y.', 'daet@students.national-u.edu.ph', '9123456893', 'CAH'),
('2021-123495', 'Arellano, Tatiana P.', 'arellano@students.national-u.edu.ph', '9123456894', 'CTHM'),
('2023-123456', 'Trevino, Kae', 'trevino@gmail.com', '09123456789', 'COE'),
('2023-123476', 'lee, sam', 'sam@gmail.com', '12345678909', 'CCIT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Admin_ID`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`Order_ID`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`Product_ID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Student_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `Order_ID` int(10) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
