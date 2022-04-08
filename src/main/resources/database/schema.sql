/* Инициализация записей таблицы компьютеров */

-- Table: public.computers

-- DROP TABLE IF EXISTS public.computers;

CREATE TABLE IF NOT EXISTS public.computers
(
    id serial NOT NULL,                                                 -- уникальный идентификатор
    name character varying(255) COLLATE pg_catalog."default",           -- наименование
	serial_number character varying(255) COLLATE pg_catalog."default",  -- серийный номер
    color character varying(255) COLLATE pg_catalog."default",          -- цвет
    size character varying(255) COLLATE pg_catalog."default",           -- размер
	cost integer,                                                       -- цена
    category character varying(255) COLLATE pg_catalog."default",       -- категория
    type_processor character varying(255) COLLATE pg_catalog."default", -- тип процессора
	in_stock character varying(3) COLLATE pg_catalog."default",         -- наличие товара (Да/Нет)
    CONSTRAINT computers_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.computers
    OWNER to "adminRE";

/* Инициализация записей таблицы холодильников */

-- Table: public.refrigerators

-- DROP TABLE IF EXISTS public.refrigerators;

CREATE TABLE IF NOT EXISTS public.refrigerators
(
    id serial NOT NULL,                                                  -- уникальный идентификатор
    name character varying(255) COLLATE pg_catalog."default",            -- наименование
	serial_number character varying(255) COLLATE pg_catalog."default",   -- серийный номер
    color character varying(255) COLLATE pg_catalog."default",           -- цвет
    size character varying(255) COLLATE pg_catalog."default",            -- размер
	cost integer,                                                        -- цена
    number_doors integer,                                                -- количество дверей
    type_compressor character varying(255) COLLATE pg_catalog."default", -- тип компрессора
	in_stock character varying(3) COLLATE pg_catalog."default",          -- наличие товара (Да/Нет)
    CONSTRAINT refrigerators_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.refrigerators
    OWNER to "adminRE";

/* Инициализация записей таблицы смартфонов */

-- Table: public.smartphones

-- DROP TABLE IF EXISTS public.smartphones;

CREATE TABLE IF NOT EXISTS public.smartphones
(
    id serial NOT NULL,                                                -- уникальный идентификатор
    name character varying(255) COLLATE pg_catalog."default",          -- наименование
	serial_number character varying(255) COLLATE pg_catalog."default", -- серийный номер
    color character varying(255) COLLATE pg_catalog."default",         -- цвет
    size character varying(255) COLLATE pg_catalog."default",          -- размер
	cost integer,                                                      -- цена
    memory integer,                                                    -- память
    number_cameras integer,                                            -- количество камер
	in_stock character varying(3) COLLATE pg_catalog."default",        -- наличие товара (Да/Нет)
    CONSTRAINT smartphones_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.smartphones
    OWNER to "adminRE";

/* Инициализация записей таблицы телевизоров */

-- Table: public.televisions

-- DROP TABLE IF EXISTS public.televisions;

CREATE TABLE IF NOT EXISTS public.televisions
(
    id serial NOT NULL,                                                -- уникальный идентификатор
    name character varying(255) COLLATE pg_catalog."default",          -- наименование
	serial_number character varying(255) COLLATE pg_catalog."default", -- серийный номер
    color character varying(255) COLLATE pg_catalog."default",         -- цвет
    size character varying(255) COLLATE pg_catalog."default",          -- размер
	cost integer,                                                      -- цена
    category character varying(255) COLLATE pg_catalog."default",      -- категория
    technology character varying(255) COLLATE pg_catalog."default",    -- технология
	in_stock character varying(3) COLLATE pg_catalog."default",        -- наличие товара (Да/Нет)
    CONSTRAINT televisions_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.televisions
    OWNER to "adminRE";

/* Инициализация записей таблицы пылесосов */

-- Table: public.vacuum_cleaners

-- DROP TABLE IF EXISTS public.vacuum_cleaners;

CREATE TABLE IF NOT EXISTS public.vacuum_cleaners
(
    id serial NOT NULL,                                                -- уникальный идентификатор
    name character varying(255) COLLATE pg_catalog."default",          -- наименование
	serial_number character varying(255) COLLATE pg_catalog."default", -- серийный номер
    color character varying(255) COLLATE pg_catalog."default",         -- цвет
    size character varying(255) COLLATE pg_catalog."default",          -- размер
	cost integer,                                                      -- цена
    volume_dust_collector bigint,                                      -- объём пылесборника
	number_modes bigint,                                               -- количество режимов
	in_stock character varying(3) COLLATE pg_catalog."default",        -- наличие товара (Да/Нет)
    CONSTRAINT vacuum_cleaners_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.vacuum_cleaners
    OWNER to "adminRE";

/* Инициализация записей реестра */

-- Table: public.register

-- DROP TABLE IF EXISTS public.register;

CREATE TABLE IF NOT EXISTS public.register
(
    id serial NOT NULL,                                                   -- уникальный идентификатор
	type_equipment character varying(255) COLLATE pg_catalog."default",   -- наименование (тип техники)
	producer_country character varying(255) COLLATE pg_catalog."default", -- страна производитель
	producer_company character varying(255) COLLATE pg_catalog."default", -- фирма производитель
	order_online character varying(3) COLLATE pg_catalog."default",       -- возможность заказа онлайн(да/нет)
    installments character varying(3) COLLATE pg_catalog."default",       -- возможность оформления рассрочки(да/нет)
	name_model_line character varying(255) COLLATE pg_catalog."default",  -- наименование линейки моделей
    name_model character varying(255) COLLATE pg_catalog."default",       -- наименование модели
    CONSTRAINT register_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.register
    OWNER to "adminRE";