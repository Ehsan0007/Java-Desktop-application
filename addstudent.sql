-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 03, 2015 at 03:57 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `addstudent`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbladdstudent`
--

CREATE TABLE IF NOT EXISTS `tbladdstudent` (
  `ID` int(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Designation` varchar(100) NOT NULL,
  `mobile` varchar(11) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `Address` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbladdstudent`
--

INSERT INTO `tbladdstudent` (`ID`, `Name`, `Designation`, `mobile`, `Email`, `Gender`, `Address`) VALUES
(100, 'EhsanKhan', 'Software', '03133902401', 'ehsan1409f@aptechsite.net', 'Male', 'wowefpweaohweopgj[p');

-- --------------------------------------------------------

--
-- Table structure for table `tbldeduction`
--

CREATE TABLE IF NOT EXISTS `tbldeduction` (
  `Empid` int(10) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Designation` varchar(100) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `DateOfJoining` varchar(100) NOT NULL,
  `AdvancePay` int(100) NOT NULL,
  `ProfessionalTax` int(100) NOT NULL,
  `Loan` int(100) NOT NULL,
  `ProvidentFund` int(100) NOT NULL,
  `Toatl` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tblincentive`
--

CREATE TABLE IF NOT EXISTS `tblincentive` (
  `Empid` int(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Designation` varchar(100) NOT NULL,
  `Department` int(11) NOT NULL,
  ` DateOfJoining` int(100) NOT NULL,
  `BasicSalary` int(100) NOT NULL,
  `HouseRent` int(100) NOT NULL,
  `FuelAllownce` int(100) NOT NULL,
  `MedicalAllownce` int(100) NOT NULL,
  `Toatl` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tblpayslip`
--

CREATE TABLE IF NOT EXISTS `tblpayslip` (
  `Month` varchar(100) NOT NULL,
  `Empid` int(50) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `Designation` varchar(100) NOT NULL,
  `DateOfJoining` varchar(100) NOT NULL,
  `HouseRent` int(100) NOT NULL,
  `FuelAllownce` int(100) NOT NULL,
  `MedicalAllownce` int(100) NOT NULL,
  `AdvancePAy` int(100) NOT NULL,
  `ProfessionalTax` int(100) NOT NULL,
  `Loan` int(100) NOT NULL,
  `ProvidentFund` int(100) NOT NULL,
  `BasicSalary` int(100) NOT NULL,
  `GrossIncentiveAmount` int(100) NOT NULL,
  `GrossDeductionAmount` int(100) NOT NULL,
  `NetSalary` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tblsalary`
--

CREATE TABLE IF NOT EXISTS `tblsalary` (
  `Empid` int(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Designation` varchar(100) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `DateOfJoining` varchar(100) NOT NULL,
  `Salary Type` int(100) NOT NULL,
  `SalaryAmount` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
