EXPORT DE LA BBDD

-- phpMyAdmin SQL Dump
-- version 4.4.10
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 05-11-2016 a las 12:02:32
-- Versión del servidor: 5.5.42
-- Versión de PHP: 5.6.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de datos: `homefooddelivery`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `precio` decimal(10,0) NOT NULL,
  `unidad` varchar(128) NOT NULL,
  `tipo` varchar(256) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `products`
--

INSERT INTO `products` (`id`, `nombre`, `precio`, `unidad`, `tipo`) VALUES
(1, 'Ensalada de espinacas', '1', '100gr', 'principal'),
(2, 'Tortellini alla carbonara', '1', '100gr', 'principal'),
(3, 'Pollo al curry', '1', '100gr', 'principal'),
(4, 'Arroz con verduras', '1', '100gr', 'principal'),
(5, 'Pizza primavera', '2', 'ud', 'principal'),
(6, 'Carne estofada', '2', '100gr', 'principal'),
(7, 'Agua', '1', 'ud', 'bebida'),
(8, 'Zumo de naranja', '2', 'ud', 'bebida'),
(9, 'Manzana', '2', 'ud', 'postre'),
(10, 'Tarta de queso', '2', 'ud', 'postre');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;