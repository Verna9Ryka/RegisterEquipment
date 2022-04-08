/* Инициализация записей таблицы компьютеров */

INSERT INTO public.computers(
    name, serial_number, color, size, cost, category, type_processor, in_stock)
	VALUES ('Lenovo IdeaCentre Mini 5 01IMH05 (90Q7000QRS)', '90Q7000QRS', 'Черный', '194х40х182,40 мм', 40000, 'Игровой', 'Intel Core i5-10400T', 'да');

INSERT INTO public.computers(
	name, serial_number, color, size, cost, category, type_processor, in_stock)
	VALUES ('Acer Aspire XC-895 (DTBEWER008)', 'DTBEWER008', 'Белый', '100х295х330 мм', 26300, 'Рабочий', 'Intel Core i3-10100', 'нет');

INSERT INTO public.computers(
	name, serial_number, color, size, cost, category, type_processor, in_stock)
	VALUES ('HP Bundle 290 G4 MT', '290G4MT', 'Красный', '120х295х340 мм', 40600, 'Игровой', 'AMD Ryzen 5 5600X', 'да');

INSERT INTO public.computers(
	name, serial_number, color, size, cost, category, type_processor, in_stock)
	VALUES ('Acer Aspire XC-456 (DTBEWER756)', 'DTBEWER756', 'Черный', '120х295х330 мм', 28300, 'Рабочий', 'Intel Core i3-10456', 'нет');

INSERT INTO public.computers(
	name, serial_number, color, size, cost, category, type_processor, in_stock)
	VALUES ('HP Bundle 310 G7 MT', '310G7MT', 'Желтый', '160х360х380 мм', 58800, 'Игровой', 'AMD Ryzen 7 9600X', 'да');

INSERT INTO public.computers(
	name, serial_number, color, size, cost, category, type_processor, in_stock)
	VALUES ('Lenovo IdeaCentre Mini 4 01IMH56 (90Q43653QRS)', '90Q43653QRS', 'Белый', '170х30х182,40 мм', 37000, 'Игровой', 'Intel Core i7-1531T', 'да');

/* Инициализация записей таблицы холодильников */

INSERT INTO public.refrigerators(
	name, serial_number, color, size, cost, number_doors, type_compressor, in_stock)
	VALUES ('Bosch KGV36NL1AR', 'KGV36NL1AR', 'Белый', '185х50х50 см', 46990, 2, 'Embraco', 'нет');

INSERT INTO public.refrigerators(
	name, serial_number, color, size, cost, number_doors, type_compressor, in_stock)
	VALUES ('LG GA-B419 SWJL', 'GA-B419', 'Желтый', '200х60х60 см', 60550, 3, 'Tecumsen', 'да');

INSERT INTO public.refrigerators(
	name, serial_number, color, size, cost, number_doors, type_compressor, in_stock)
	VALUES ('ATLANT XM 4010-022', '4010-022', 'Белый', '170х40х40 см', 30550, 2, 'Tecumsen', 'да');

INSERT INTO public.refrigerators(
	name, serial_number, color, size, cost, number_doors, type_compressor, in_stock)
	VALUES ('Bosch KGV8FHG67', 'KGV8FHG67', 'Черный', '190х50х50 см', 50990, 3, 'Tecumsen', 'да');

INSERT INTO public.refrigerators(
	name, serial_number, color, size, cost, number_doors, type_compressor, in_stock)
	VALUES ('LG GA-B234 SWJL', 'GA-B234', 'Белый', '180х60х60 см', 48550, 2, 'Embraco', 'нет');

INSERT INTO public.refrigerators(
	name, serial_number, color, size, cost, number_doors, type_compressor, in_stock)
	VALUES ('ATLANT XM 4747-078', '4747-078', 'Белый', '190х60х60 см', 56550, 2, 'Tecumsen', 'нет');

/* Инициализация записей таблицы смартфонов */

INSERT INTO public.smartphones(
	name, serial_number, color, size, cost, memory, number_cameras, in_stock)
	VALUES ('Xiaomi Poco X3 Pro', 'XIPP2351', 'Черный', '165.3х76.8х9.4 мм', 28890, 6, 4, 'да');

INSERT INTO public.smartphones(
	name, serial_number, color, size, cost, memory, number_cameras, in_stock)
	VALUES ('Samsung Galaxy A52', 'SGA345367', 'Белый', '159.9х75.1х8.4 мм', 36500, 8, 3, 'нет');

INSERT INTO public.smartphones(
	name, serial_number, color, size, cost, memory, number_cameras, in_stock)
	VALUES ('OnePlus 8 Pro', 'OPP463432', 'Золотистый', '150.9х76.1х9.4 мм', 74500, 16, 5, 'нет');

INSERT INTO public.smartphones(
	name, serial_number, color, size, cost, memory, number_cameras, in_stock)
	VALUES ('OnePlus 7 Pro', 'OPP23542', 'Золотистый', '130.9х65.1х7.4 мм', 68500, 8, 4, 'нет');

INSERT INTO public.smartphones(
	name, serial_number, color, size, cost, memory, number_cameras, in_stock)
	VALUES ('Samsung Galaxy A37', 'SGA23424', 'Белый', '159.9х75.1х8.4 мм', 23500, 6, 2, 'да');

INSERT INTO public.smartphones(
	name, serial_number, color, size, cost, memory, number_cameras, in_stock)
	VALUES ('Xiaomi Poco X2', 'XIP2473', 'Белый', '155.3х70.8х8.2 мм', 24890, 6, 3, 'да');

/* Инициализация записей таблицы телевизоров */

INSERT INTO public.televisions(
	name, serial_number, color, size, cost, category, technology, in_stock)
	VALUES ('Samsung UE32T4510AU HDR', 'UE32T4510AU', 'Белый', '1366x768 мм', 31490, 'ЖК', 'HDR', 'нет');

INSERT INTO public.televisions(
	name, serial_number, color, size, cost, category, technology, in_stock)
	VALUES ('LG 32LM637BPLB LED', '32LM637BPLB', 'Черный', '1550x1024 мм', 50660, 'QLED', 'LED', 'да');

INSERT INTO public.televisions(
	name, serial_number, color, size, cost, category, technology, in_stock)
	VALUES ('Sony KD65ZD9', 'KD65ZD9', 'Черный', '1370x860 мм', 45370, 'ЖК', 'LED', 'нет');

INSERT INTO public.televisions(
	name, serial_number, color, size, cost, category, technology, in_stock)
	VALUES ('Samsung UE32T8696AU LED', 'UE32T8696AU', 'Черный', '1200x650 мм', 27700, 'ЖК', 'LED', 'нет');

INSERT INTO public.televisions(
	name, serial_number, color, size, cost, category, technology, in_stock)
	VALUES ('Sony KD76KD8', 'KD76KD8', 'Черный', '1450x960 мм', 47300, 'ЖК', 'HDR', 'да');

INSERT INTO public.televisions(
	name, serial_number, color, size, cost, category, technology, in_stock)
	VALUES ('LG 32LM89587BPLB HDR', '32LM89587BPLB', 'Белый', '1850x1550 мм', 60660, 'QLED', 'HDR', 'да');

/* Инициализация записей таблицы пылесосов */

INSERT INTO public.vacuum_cleaners(
	name, serial_number, color, size, cost, volume_dust_collector, number_modes, in_stock)
	VALUES ('Bort BSS-1440-Pro', 'BSS1440', 'Черный', '6.2 м', 24390, 35, 3, 'да');

INSERT INTO public.vacuum_cleaners(
	name, serial_number, color, size, cost, volume_dust_collector, number_modes, in_stock)
	VALUES ('Tefal Compact Power XXL TW4881EA', 'TW4881EA', 'Синий', '4.5 м', 13990, 20, 2, 'нет');

INSERT INTO public.vacuum_cleaners(
	name, serial_number, color, size, cost, volume_dust_collector, number_modes, in_stock)
	VALUES ('Philips FC9732/01', 'FC9732/01', 'Желтый', '5.5 м', 20500, 30, 2, 'да');

INSERT INTO public.vacuum_cleaners(
	name, serial_number, color, size, cost, volume_dust_collector, number_modes, in_stock)
	VALUES ('Tefal Compact Power XL TW6345EA', 'TW6345EA', 'Черный', '4.5 м', 15990, 25, 2, 'да');

INSERT INTO public.vacuum_cleaners(
	name, serial_number, color, size, cost, volume_dust_collector, number_modes, in_stock)
	VALUES ('Philips FC6373/01', 'FC6373/01', 'Черный', '5 м', 17500, 30, 3, 'нет');

INSERT INTO public.vacuum_cleaners(
	name, serial_number, color, size, cost, volume_dust_collector, number_modes, in_stock)
	VALUES ('Bort BSS-3467-Pro', 'BSS3467', 'Черный', '6.5 м', 27590, 40, 4, 'да');

/* Инициализация записей реестра */

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Компьютер', 'США', 'Lenovo company', 'да', 'да', 'Lenovo', 'Lenovo IdeaCentre Mini 5 01IMH05 (90Q7000QRS)');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Пылесос', 'Франция', 'Bort company', 'да', 'да', 'Bort', 'Bort BSS-1440-Pro');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Пылесос', 'Германия', 'Tefal company', 'нет', 'нет', 'Tefal', 'Tefal Compact Power XXL TW4881EA');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Компьютер', 'Франция', 'Acer company', 'нет', 'нет', 'Acer', 'Acer Aspire XC-456 (DTBEWER756)');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Телевизор', 'США', 'Sony company', 'нет', 'да', 'Sony', 'Sony KD76KD8');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Телевизор', 'Германия', 'LG company', 'да', 'да', 'LG', 'LG 32LM89587BPLB HDR');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Холодильник', 'Германия', 'Bosch company', 'да', 'нет', 'Bosch', 'Bosch KGV36NL1AR');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Холодильник', 'Франция', 'LG company', 'нет', 'да', 'LG', 'LG GA-B419 SWJL');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Компьютер', 'Франция', 'Acer company', 'да', 'нет', 'Acer', 'Acer Aspire XC-895 (DTBEWER008)');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Компьютер', 'Германия', 'HP company', 'да', 'да', 'HP', 'HP Bundle 290 G4 MT');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Смартфон', 'Германия', 'OnePlus company', 'да', 'нет', 'OnePlus', 'OnePlus 7 Pro');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Смартфон', 'Франция', 'Samsung company', 'нет', 'да', 'Samsung', 'Samsung Galaxy A37');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Пылесос', 'Франция', 'Philips company', 'нет', 'нет', 'Philips', 'Philips FC6373/01');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Пылесос', 'США', 'Bort company', 'нет', 'да', 'Bort', 'Bort BSS-3467-Pro');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Смартфон', 'США', 'OnePlus company', 'да', 'нет', 'OnePlus', 'OnePlus 8 Pro');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Холодильник', 'Англия', 'LG company', 'нет', 'нет', 'LG', 'LG GA-B234 SWJL');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Холодильник', 'Англия', 'ATLANT company', 'нет', 'нет', 'ATLANT', 'ATLANT XM 4747-078');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Смартфон', 'США', 'Xiaomi company', 'да', 'да', 'Xiaomi', 'Xiaomi Poco X2');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Телевизор', 'США', 'Samsung company', 'нет', 'нет', 'Samsung', 'Samsung UE32T4510AU HDR');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Телевизор', 'Англия', 'LG company', 'да', 'да', 'LG', 'LG 32LM637BPLB LED');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Смартфон', 'США', 'Xiaomi company', 'нет', 'да', 'Xiaomi', 'Xiaomi Poco X3 Pro');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Смартфон', 'Англия', 'Samsung company', 'нет', 'нет', 'Samsung', 'Samsung Galaxy A52');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Компьютер', 'США', 'HP company', 'нет', 'да', 'HP', 'HP Bundle 310 G7 MT');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Компьютер', 'Англия', 'Lenovo company', 'да', 'да', 'Lenovo', 'Lenovo IdeaCentre Mini 4 01IMH56 (90Q43653QRS)');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Телевизор', 'Англия', 'Sony company', 'да', 'нет', 'Sony', 'Sony KD65ZD9');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Телевизор', 'Германия', 'Samsung company', 'да', 'нет', 'Samsung', 'Samsung UE32T8696AU LED');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Пылесос', 'Франция', 'Philips company', 'нет', 'да', 'Philips', 'Philips FC9732/01');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Пылесос', 'Англия', 'Tefal company', 'да', 'да', 'Tefal', 'Tefal Compact Power XL TW6345EA');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Холодильник', 'США', 'ATLANT company', 'да', 'да', 'ATLANT', 'ATLANT XM 4010-022');

INSERT INTO public.register(
	type_equipment, producer_country, producer_company, order_online, installments, name_model_line, name_model)
	VALUES ('Холодильник', 'Германия', 'Bosch company', 'нет', 'да', 'Bosch', 'Bosch KGV8FHG67');