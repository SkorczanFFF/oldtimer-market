-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 03 Gru 2019, 08:31
-- Wersja serwera: 10.1.37-MariaDB
-- Wersja PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `oldtimer`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `annouce`
--

CREATE TABLE `annouce` (
  `id_ann` int(11) NOT NULL,
  `author` varchar(20) COLLATE utf8mb4_polish_ci NOT NULL,
  `title` varchar(30) COLLATE utf8mb4_polish_ci NOT NULL,
  `stuff` text COLLATE utf8mb4_polish_ci NOT NULL,
  `brand` varchar(20) COLLATE utf8mb4_polish_ci NOT NULL,
  `model` varchar(20) COLLATE utf8mb4_polish_ci NOT NULL,
  `mileage` int(10) NOT NULL,
  `year` int(4) NOT NULL,
  `price` int(10) NOT NULL,
  `displacement` int(5) NOT NULL,
  `horsepower` int(4) NOT NULL,
  `localization` varchar(25) COLLATE utf8mb4_polish_ci NOT NULL,
  `date` date NOT NULL,
  `img1` varchar(255) COLLATE utf8mb4_polish_ci NOT NULL,
  `img2` varchar(255) COLLATE utf8mb4_polish_ci NOT NULL,
  `img3` varchar(255) COLLATE utf8mb4_polish_ci NOT NULL,
  `img4` varchar(255) COLLATE utf8mb4_polish_ci NOT NULL,
  `img5` varchar(255) COLLATE utf8mb4_polish_ci NOT NULL,
  `img6` varchar(255) COLLATE utf8mb4_polish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_polish_ci;

--
-- Zrzut danych tabeli `annouce`
--

INSERT INTO `annouce` (`id_ann`, `author`, `title`, `stuff`, `brand`, `model`, `mileage`, `year`, `price`, `displacement`, `horsepower`, `localization`, `date`, `img1`, `img2`, `img3`, `img4`, `img5`, `img6`) VALUES
(19, 'testowiec', 'Saab 90 ze Szwecji', 'Saab 90 rok 85, 200 tys km przebieg. Auto w bardzo dobrym stanie, po przegladzie w Szwecji. Do zrobienia tylny lewy blotnik przy krawedzi i rant na przednim lewym blotniku. Doly drzwi do poprawy.Poza tym lakier jak nowy. Polecam, super auto. Po wiecej info prosze pisac lub dzwonic na szwedzki numer 0046762093491 . Samochod w Polsce do obejzenia w Bialym Borze.', 'Saab', '900', 200000, 1985, 10000, 2000, 100, 'Bia??y B??r', '2019-06-25', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/07/saab-900-turbo-08-1-672x372.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/07/saab-900-turbo-07-1.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/07/saab-900-turbo-18-1.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/07/saab-900-turbo-03-1.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/07/saab-900-turbo-10-1.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/07/saab-900-turbo-20-1.jpg'),
(21, 'testowiec', 'Fiat 126p Maluch 1987r Je??dzi ', 'Sprzedam Fiata 126p z 1987r. Auto do poprawek lakierniczych ( podwozie bez dziur ! ) . Je??dzi super. Silnik pali na strza??a. Oc wa??ne do 01.2020r. Przegl??d 06.2020r. ??mia??o mo??na wraca?? na ko??ach . Wi??cej informacji udziel?? telefonicznie', 'Fiat', '126p', 120000, 1987, 2600, 650, 24, 'Chojnice', '2019-06-25', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/06/fiat-126p-01.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/06/fiat-126p-03.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/06/fiat-126p-07.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/06/fiat-126p-08.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/06/fiat-126p-16.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/06/fiat-126p-09.jpg'),
(22, 'admin', 'Citroen BX op??acony', 'nie dziala pneumatyczne zawieszenie', 'Citroen', 'BX FL', 270000, 1988, 4900, 1498, 70, 'Kostrzyn nad Odr??', '2019-06-25', 'http://www.gieldaklasykow.pl/wp-content/uploads/2016/03/citroen-bx-01.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2016/03/citroen-bx-02.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2016/03/citroen-bx-03.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2016/03/citroen-bx-12.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2016/03/citroen-bx-48.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2016/03/citroen-bx-55.jpg'),
(23, 'klasyczny1500', 'Mercedes-Benz W114 250', 'ZABYTKOWY SAMOCH??D KOLEKCJONERSKI!\r\nMERCEDES W114 250\r\nIDEALNY DLA OSOBY, KT??RA PASJONUJE SI?? HISTORI??\r\nMOTORYZACJI I CHCE MIE?? W SWOIM POSIADANIU\r\nWYJ??TKOWY SAMOCH??D!\r\nJest kompletny, je??d????cy ale wymaga odrestaurowania.\r\nWn??trze bardzo dobrze utrzymane, pod??oga zdrowa pokryta\r\nkonserwacj??.Mechanicznie do naprawy skrzynia bieg??w.\r\n\r\nSPROWADZAMY SAMOCHODY NA ZAM??WIENIE (WSZYSTKIE MARKI)\r\n\r\nOg??oszenie ma charakter informacyjny i stanowi zaproszenie do zawarcia umowy (art. 71 Kodeksu cywilnego); nie stanowi natomiast oferty handlowej w rozumieniu art. 66 ?? 1 Kodeksu cywilnego. W celu sprawdzenia zgodno??ci oferty oraz uzyskania wszelkich informacji prosimy kontaktowa?? si?? z handlowcem d.s. samochod??w u??ywanych.', 'Mercedes-Benz', 'W114', 90000, 1969, 37900, 2497, 130, '??ukanowice', '2019-06-25', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/09/mercedes-230-w114-01.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/09/mercedes-230-w114-02.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/09/mercedes-230-w114-03.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/09/mercedes-230-w114-04.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/09/mercedes-230-w114-08.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/09/mercedes-230-w114-16.jpg'),
(24, 'werka', 'Saab 900 turbo', 'Sprzedam saaba 900 turbo \r\nSamoch??d jest w bardzo dobrym stanie technicznym jak I blacharskim \r\nUdokumentowany przebieg \r\nAuto jest bezwypadkowe\r\nWi??cej informacji pod numerem telefonu', 'Saab', '900', 64000, 1983, 19999, 2000, 144, 'Dzier??oni??w', '2019-06-25', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/01/saab-99-turbo-01.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/01/saab-99-turbo-03.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/01/saab-99-turbo-05.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/01/saab-99-turbo-15.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/01/saab-99-turbo-23.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2015/01/saab-99-turbo-10.jpg'),
(25, 'admin', 'Fso FIAT 125p du??y fiat', 'Sprzedam ( NIE ZAMIENIAM ) \r\n\r\nPi??kny klasyk Fiat 125 p \r\n\r\nCzarne TABLICE REJESTRACYJNE\r\n\r\nAUTO nigdy nie je??dzi??o na gazie \r\n\r\nZarejestrowany w Polsce \r\n\r\nAktualne oc do 11-kwiecie??-2020r\r\n\r\nBadanie techniczne do 07-stycze??-2010\r\n\r\nSta?? w suchym gara??u 16 lat \r\n\r\nWyczyszczony zbiornik paliwa, wyregulowany ga??nik, zrobione hamulce, wymienione ??o??yska przednich k????. Nowy filtr oleju, filtr powietrza i olej. Nowe ??wiece zap??onowe. \r\n\r\nSprawny. Pali, je??dzi, hamuje. \r\n\r\nSkrzynia oryginalna 4\r\n\r\nOryginalne RADIO UNITRA DIORA SAFARI 5\r\n\r\nMost cichy (nie wyje)\r\n\r\nDo wywa??enia ko??a. \r\n\r\nPiesek z kiwaj??c?? g??ow?? na tylnej p????ce\r\n\r\nAuto zdrowe. Konserwowane wiele lat temu. Obecnie kilka drobnych pryszczyk??w.\r\n\r\nWN??TRZE IDEALNE !!! \r\n\r\nGrube pokrowce od nowo??ci za??o??one - zdj??te kilka dni temu odkry??y idealne br??zowe sk??ry ( bez p??kni????, bez przebarwie?? - fabryczny stan)\r\n\r\nZapraszam do kontaktu telefonicznego\r\n\r\nSprzeda?? na UMOW?? KUPNA SPRZEDA??Y', 'Fiat', '125p', 95000, 1983, 10900, 1481, 75, 'Jarocin', '2019-06-25', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/fso-125p-04.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/fso-125p-07.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/fso-125p-08.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/fso-125p-13.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/fso-125p-15.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/fso-125p-35.jpg'),
(26, 'user', 'Volkswagen Golf ll Syncro 4x4', 'Mam na sprzeda?? vw golfa 2 w wersji syncro z nap??dem 4x4 zachowanego w oryginalnym stanie,przebieg jak i ca??a reszta,bardzo dobry stan 1.8 benzyna 86r najstarsza wersja, bardzo rzadki model z wyposa??enia posiada wspomaganie kierownicy,hak wa??ne op??aty wi??cej infarmacji pod nr tel.', 'Volkswagen', 'Golf Syncro', 230000, 1986, 14000, 1800, 90, '??a??cut', '2019-06-25', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/02/vw-golf-country-01.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/02/vw-golf-country-03.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/02/vw-golf-country-04.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/02/vw-golf-country-05.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/02/vw-golf-country-12.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/02/vw-golf-country-06.jpg'),
(28, 'jarek', 'Peugeot 309 91r bezwypadek wsp', 'Peugeot 309 1,4 1991 rok 165 tys.. km. przebiegu oryginalny,bezwypadkowy drugi w??a??ciciel,elektryczne szyby,wspomaganie kierownicy radio z epoki panasonic matrix,nowe opony oraz akumulator ca??kowicie sprawny,dodatkowo du??o nowych i u??ywanych cz????ci zapasowych(alternator,ga??niki,klapa tylna i wiele innych)\r\nSamoch??d do odebrania w Warszawie..', 'Peugeot', '309', 165000, 1991, 2650, 1360, 70, 'Warszawa', '2019-06-25', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/09/peugeot-309gti-01-672x372.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/09/peugeot-309gti-02.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/09/peugeot-309gti-03.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/09/peugeot-309gti-08.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/09/peugeot-309gti-16.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2017/09/peugeot-309gti-19.jpg'),
(29, 'klasyczny1500', 'Polonez 16 benzyna', 'Witam sprzedam poloneza Atu 1.6\r\nPierwszy wlasciciel od nowosci wszysto zachowane w orginale \r\nBardzo ??adny srodek nie zniszczony wszystko sprawne nic nie puka progi zdrowe jedynie oznaki korozji w miejscu wkladania podnosnika.nie b??d?? si??\r\nrozpisywa??.zapraszam na jazd?? pr??bn?? robi wra??enie.prosz?? dzwonic lub mail.\r\nDzi??kuj?? jeszcze 2 dni', 'FSO', 'Polonez Atu', 95000, 1997, 3200, 1600, 86, 'Przeworsk', '2019-06-25', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/polonez-atu-plus-01-672x372.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/polonez-atu-plus-02.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/polonez-atu-plus-03.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/polonez-atu-plus-05.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/polonez-atu-plus-06.jpg', 'http://www.gieldaklasykow.pl/wp-content/uploads/2019/05/polonez-atu-plus-08.jpg');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nick` varchar(20) COLLATE utf8mb4_polish_ci NOT NULL,
  `mail` varchar(25) COLLATE utf8mb4_polish_ci NOT NULL,
  `number` int(11) NOT NULL,
  `password` varchar(16) COLLATE utf8mb4_polish_ci NOT NULL,
  `role` varchar(10) COLLATE utf8mb4_polish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_polish_ci;

--
-- Zrzut danych tabeli `user`
--

INSERT INTO `user` (`id`, `nick`, `mail`, `number`, `password`, `role`) VALUES
(1, 'admin', 'admin@admin.pl', 668345234, 'admin123', 'admin'),
(2, 'user', 'user@user.pl', 505834012, 'user123', 'user'),
(3, 'user2', 'user2@userownia.com', 556204494, 'user997', 'user'),
(4, 'administrator', 'admin@strator.pl', 681882055, 'administratore', 'admin'),
(5, 'czarkoslaw', 'czarek@poczta.pl', 871672739, 'samochody', 'user'),
(6, 'jarek', 'jarek@browarek.pl', 702081116, 'fb760e6433a476da', 'user'),
(7, 'werka', 'mlp@kc.pl', 666555915, 'f345749ee1bc541e', 'user'),
(9, 'klasyczny1500', 'klasyczny@buziaczek.pl', 543543234, 'klasyczny7', 'user');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
