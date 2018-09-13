--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.1
-- Dumped by pg_dump version 9.6.1

-- Started on 2018-09-12 20:15:03 CDT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12427)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2261 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 185 (class 1259 OID 83735)
-- Name: clients; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE clients (
    id integer NOT NULL,
    person character varying,
    name character varying,
    first_last_name character varying,
    second_last_name character varying,
    birth_date date,
    street character varying,
    distrit character varying,
    postal_code character varying,
    state character varying,
    city character varying,
    rfc character varying,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);


--
-- TOC entry 186 (class 1259 OID 83741)
-- Name: clients_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE clients_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2262 (class 0 OID 0)
-- Dependencies: 186
-- Name: clients_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE clients_id_seq OWNED BY clients.id;


--
-- TOC entry 187 (class 1259 OID 83743)
-- Name: products; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE products (
    id integer NOT NULL,
    provider_id integer,
    status_id integer,
    clave character varying,
    lote character varying,
    description character varying,
    fabrication_date timestamp without time zone,
    expiration_date timestamp without time zone,
    return_date timestamp without time zone,
    cantidad integer,
    price_purchase numeric(8,2),
    price_public numeric(8,2),
    price_final numeric(8,2),
    bill character varying
);


--
-- TOC entry 188 (class 1259 OID 83749)
-- Name: products_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE products_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2263 (class 0 OID 0)
-- Dependencies: 188
-- Name: products_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE products_id_seq OWNED BY products.id;


--
-- TOC entry 189 (class 1259 OID 83751)
-- Name: providers; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE providers (
    id integer NOT NULL,
    person character varying,
    name character varying,
    first_last_name character varying,
    second_last_name character varying,
    birth_date date,
    street character varying,
    distrit character varying,
    postal_code character varying,
    state character varying,
    city character varying,
    rfc character varying,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);


--
-- TOC entry 190 (class 1259 OID 83757)
-- Name: providers_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE providers_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2264 (class 0 OID 0)
-- Dependencies: 190
-- Name: providers_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE providers_id_seq OWNED BY providers.id;


--
-- TOC entry 199 (class 1259 OID 83896)
-- Name: quirofano; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE quirofano (
    id integer NOT NULL,
    user_id integer,
    client_id integer,
    abierto boolean,
    fecha_apertura timestamp without time zone,
    fecha_cierre timestamp without time zone
);


--
-- TOC entry 198 (class 1259 OID 83894)
-- Name: quirofano_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE quirofano_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2265 (class 0 OID 0)
-- Dependencies: 198
-- Name: quirofano_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE quirofano_id_seq OWNED BY quirofano.id;


--
-- TOC entry 200 (class 1259 OID 83902)
-- Name: quirofano_producto; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE quirofano_producto (
    quirofano_id integer,
    producto_id integer,
    vendido boolean
);


--
-- TOC entry 191 (class 1259 OID 83759)
-- Name: schema_migrations; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE schema_migrations (
    version character varying NOT NULL
);


--
-- TOC entry 192 (class 1259 OID 83765)
-- Name: statuses; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE statuses (
    id integer NOT NULL,
    description character varying,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);


--
-- TOC entry 193 (class 1259 OID 83771)
-- Name: statuses_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE statuses_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2266 (class 0 OID 0)
-- Dependencies: 193
-- Name: statuses_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE statuses_id_seq OWNED BY statuses.id;


--
-- TOC entry 194 (class 1259 OID 83773)
-- Name: user_types; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE user_types (
    id integer NOT NULL,
    description character varying,
    created_at timestamp without time zone,
    updated_at timestamp without time zone
);


--
-- TOC entry 195 (class 1259 OID 83779)
-- Name: user_types_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE user_types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2267 (class 0 OID 0)
-- Dependencies: 195
-- Name: user_types_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE user_types_id_seq OWNED BY user_types.id;


--
-- TOC entry 197 (class 1259 OID 83839)
-- Name: users; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE users (
    id integer NOT NULL,
    user_type_id integer,
    status character varying,
    username character varying,
    encrypted_password character varying DEFAULT ''::character varying NOT NULL,
    name character varying,
    first_last_name character varying,
    second_last_name character varying,
    birth_date timestamp without time zone,
    email character varying DEFAULT ''::character varying NOT NULL,
    reset_password_token character varying,
    reset_password_sent_at timestamp without time zone,
    remember_created_at timestamp without time zone,
    sign_in_count integer DEFAULT 0 NOT NULL,
    current_sign_in_at timestamp without time zone,
    last_sign_in_at timestamp without time zone,
    current_sign_in_ip inet,
    last_sign_in_ip inet
);


--
-- TOC entry 196 (class 1259 OID 83837)
-- Name: users_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 2268 (class 0 OID 0)
-- Dependencies: 196
-- Name: users_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE users_id_seq OWNED BY users.id;


--
-- TOC entry 2090 (class 2604 OID 83881)
-- Name: clients id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY clients ALTER COLUMN id SET DEFAULT nextval('clients_id_seq'::regclass);


--
-- TOC entry 2091 (class 2604 OID 83793)
-- Name: products id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY products ALTER COLUMN id SET DEFAULT nextval('products_id_seq'::regclass);


--
-- TOC entry 2092 (class 2604 OID 83794)
-- Name: providers id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY providers ALTER COLUMN id SET DEFAULT nextval('providers_id_seq'::regclass);


--
-- TOC entry 2099 (class 2604 OID 83899)
-- Name: quirofano id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY quirofano ALTER COLUMN id SET DEFAULT nextval('quirofano_id_seq'::regclass);


--
-- TOC entry 2093 (class 2604 OID 83795)
-- Name: statuses id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY statuses ALTER COLUMN id SET DEFAULT nextval('statuses_id_seq'::regclass);


--
-- TOC entry 2094 (class 2604 OID 83796)
-- Name: user_types id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY user_types ALTER COLUMN id SET DEFAULT nextval('user_types_id_seq'::regclass);


--
-- TOC entry 2095 (class 2604 OID 83842)
-- Name: users id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY users ALTER COLUMN id SET DEFAULT nextval('users_id_seq'::regclass);


--
-- TOC entry 2239 (class 0 OID 83735)
-- Dependencies: 185
-- Data for Name: clients; Type: TABLE DATA; Schema: public; Owner: -
--

COPY clients (id, person, name, first_last_name, second_last_name, birth_date, street, distrit, postal_code, state, city, rfc, created_at, updated_at) FROM stdin;
5	[Ljava.lang.Object;@4ac3567e	asd1	asd1	asd1	2018-09-29	as1	as1	asd1	Campeche	asd1	asd1	\N	\N
6	[Ljava.lang.Object;@6c176740	alma irene	rodriguez	rodriguez	2019-09-01	calle puerto mazatlan no. 303	las brisas	64870	Nuevo León	monterrey	cara890930ch	\N	\N
7	[Ljava.lang.Object;@5e2d7a5d	alma irene	rodriguez	rodriguez	2019-09-01	calle puerto mazatlan no.303	las brisas	12345	Nuevo León	monterrey	cara890930ch	\N	\N
8	[Ljava.lang.Object;@72c96f58	miguel angel	moreno	moreno	1987-10-18	Puerto mazatlan no.3833	las brisas	64780	Edo Mex.	monterrey	hemm871018sh	\N	\N
9	[Ljava.lang.Object;@67abd64f	andrea	torres	torres	0001-09-04	mariano jimenez 505	las torres	12345	Aguascalientes	aguascalientes	mata010904frc	\N	\N
\.


--
-- TOC entry 2269 (class 0 OID 0)
-- Dependencies: 186
-- Name: clients_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('clients_id_seq', 9, true);


--
-- TOC entry 2241 (class 0 OID 83743)
-- Dependencies: 187
-- Data for Name: products; Type: TABLE DATA; Schema: public; Owner: -
--

COPY products (id, provider_id, status_id, clave, lote, description, fabrication_date, expiration_date, return_date, cantidad, price_purchase, price_public, price_final, bill) FROM stdin;
4	6	1	esta	ria	simon, aslgo asi	2018-09-07 19:55:59	2018-09-07 19:56:01	2018-09-08 19:56:03	1	10000.00	0.00	0.00	asd124
321654	6	3	12	13	asd123	2019-09-01 19:38:31	2020-09-06 19:38:35	2018-09-02 19:38:39	1	1000.00	0.00	0.00	asd13
\.


--
-- TOC entry 2270 (class 0 OID 0)
-- Dependencies: 188
-- Name: products_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('products_id_seq', 500000, true);


--
-- TOC entry 2243 (class 0 OID 83751)
-- Dependencies: 189
-- Data for Name: providers; Type: TABLE DATA; Schema: public; Owner: -
--

COPY providers (id, person, name, first_last_name, second_last_name, birth_date, street, distrit, postal_code, state, city, rfc, created_at, updated_at) FROM stdin;
6	[Ljava.lang.Object;@41a9f6c0	2	2	2	2018-08-02	2	2	2	Aguascalientes	2	2	\N	\N
7	[Ljava.lang.Object;@bdaa5d3	Coca Cola Company			1969-09-03	aqui 300	all	64000	Nuevo León	mty	coca690903	\N	\N
\.


--
-- TOC entry 2271 (class 0 OID 0)
-- Dependencies: 190
-- Name: providers_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('providers_id_seq', 7, true);


--
-- TOC entry 2253 (class 0 OID 83896)
-- Dependencies: 199
-- Data for Name: quirofano; Type: TABLE DATA; Schema: public; Owner: -
--

COPY quirofano (id, user_id, client_id, abierto, fecha_apertura, fecha_cierre) FROM stdin;
300001	1	6	t	2018-09-12 09:29:18	\N
300002	1	6	t	2018-09-12 09:44:26	\N
300003	1	6	t	2018-09-12 09:45:03	\N
\.


--
-- TOC entry 2272 (class 0 OID 0)
-- Dependencies: 198
-- Name: quirofano_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('quirofano_id_seq', 300003, true);


--
-- TOC entry 2254 (class 0 OID 83902)
-- Dependencies: 200
-- Data for Name: quirofano_producto; Type: TABLE DATA; Schema: public; Owner: -
--

COPY quirofano_producto (quirofano_id, producto_id, vendido) FROM stdin;
300001	321654	f
300002	321654	f
300003	321654	f
\.


--
-- TOC entry 2245 (class 0 OID 83759)
-- Dependencies: 191
-- Data for Name: schema_migrations; Type: TABLE DATA; Schema: public; Owner: -
--

COPY schema_migrations (version) FROM stdin;
20180609192335
20180609192859
20180609193137
20180609193146
20180609203132
\.


--
-- TOC entry 2246 (class 0 OID 83765)
-- Dependencies: 192
-- Data for Name: statuses; Type: TABLE DATA; Schema: public; Owner: -
--

COPY statuses (id, description, created_at, updated_at) FROM stdin;
1	Activo	2018-06-27 22:20:09.286146	2018-06-27 22:20:09.286146
2	Inactivo	2018-07-31 16:45:38.10876	2018-07-31 16:45:38.10876
4	Vendido	2018-09-05 21:28:54.44668	2018-09-05 21:28:54.44668
3	En quirofano	2018-09-05 21:29:08.999814	2018-09-05 21:28:39.030531
5	Devolucion	2018-09-05 21:29:48.229906	2018-09-05 21:29:48.229906
\.


--
-- TOC entry 2273 (class 0 OID 0)
-- Dependencies: 193
-- Name: statuses_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('statuses_id_seq', 2, true);


--
-- TOC entry 2248 (class 0 OID 83773)
-- Dependencies: 194
-- Data for Name: user_types; Type: TABLE DATA; Schema: public; Owner: -
--

COPY user_types (id, description, created_at, updated_at) FROM stdin;
1	Adminitrador	2018-06-27 22:20:09.314057	2018-06-27 22:20:09.314057
2	Operador	2018-07-02 23:08:42.365765	2018-07-02 23:08:42.365765
\.


--
-- TOC entry 2274 (class 0 OID 0)
-- Dependencies: 195
-- Name: user_types_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('user_types_id_seq', 1, false);


--
-- TOC entry 2251 (class 0 OID 83839)
-- Dependencies: 197
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: -
--

COPY users (id, user_type_id, status, username, encrypted_password, name, first_last_name, second_last_name, birth_date, email, reset_password_token, reset_password_sent_at, remember_created_at, sign_in_count, current_sign_in_at, last_sign_in_at, current_sign_in_ip, last_sign_in_ip) FROM stdin;
1	1	Activo	mikaelo	e10adc3949ba59abbe56e057f20f883e	Mikaelo	Florentino	de la Garza	2018-09-05 20:31:46.516652	mike@nariux.com	\N	\N	\N	0	\N	\N	\N	\N
7	1	Activo	alo	1b2ccf52b54ea2c9468ca24fbe164919	alo	alo	alo	2018-09-01 20:58:11	alo	\N	\N	\N	0	\N	\N	\N	\N
8	1	Activo	qwe	76d80224611fc919a5d54f0ff9fba446	qwe	qwe	qwe	2018-09-11 20:59:19	qwe	\N	\N	\N	0	\N	\N	\N	\N
9	1	Activo	asd	f970e2767d0cfe75876ea857f92e319b	asd	asd	asd	2018-09-04 20:59:40	asd	\N	\N	\N	0	\N	\N	\N	\N
\.


--
-- TOC entry 2275 (class 0 OID 0)
-- Dependencies: 196
-- Name: users_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('users_id_seq', 11, true);


--
-- TOC entry 2101 (class 2606 OID 83883)
-- Name: clients clients_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY clients
    ADD CONSTRAINT clients_pkey PRIMARY KEY (id);


--
-- TOC entry 2118 (class 2606 OID 83901)
-- Name: quirofano pk_quirofano_id; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY quirofano
    ADD CONSTRAINT pk_quirofano_id PRIMARY KEY (id);


--
-- TOC entry 2103 (class 2606 OID 83801)
-- Name: products products_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY products
    ADD CONSTRAINT products_pkey PRIMARY KEY (id);


--
-- TOC entry 2105 (class 2606 OID 83803)
-- Name: providers providers_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY providers
    ADD CONSTRAINT providers_pkey PRIMARY KEY (id);


--
-- TOC entry 2108 (class 2606 OID 83805)
-- Name: statuses statuses_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY statuses
    ADD CONSTRAINT statuses_pkey PRIMARY KEY (id);


--
-- TOC entry 2114 (class 2606 OID 83852)
-- Name: users uk_username; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY users
    ADD CONSTRAINT uk_username UNIQUE (username);


--
-- TOC entry 2110 (class 2606 OID 83809)
-- Name: user_types user_types_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY user_types
    ADD CONSTRAINT user_types_pkey PRIMARY KEY (id);


--
-- TOC entry 2116 (class 2606 OID 83850)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 2111 (class 1259 OID 83858)
-- Name: index_users_on_email; Type: INDEX; Schema: public; Owner: -
--

CREATE UNIQUE INDEX index_users_on_email ON users USING btree (email);


--
-- TOC entry 2112 (class 1259 OID 83859)
-- Name: index_users_on_reset_password_token; Type: INDEX; Schema: public; Owner: -
--

CREATE UNIQUE INDEX index_users_on_reset_password_token ON users USING btree (reset_password_token);


--
-- TOC entry 2106 (class 1259 OID 83814)
-- Name: unique_schema_migrations; Type: INDEX; Schema: public; Owner: -
--

CREATE UNIQUE INDEX unique_schema_migrations ON schema_migrations USING btree (version);


--
-- TOC entry 2119 (class 2606 OID 83820)
-- Name: products fk_rails_a2f1461231; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY products
    ADD CONSTRAINT fk_rails_a2f1461231 FOREIGN KEY (provider_id) REFERENCES providers(id);


--
-- TOC entry 2121 (class 2606 OID 83853)
-- Name: users fk_rails_a2f1461231; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY users
    ADD CONSTRAINT fk_rails_a2f1461231 FOREIGN KEY (user_type_id) REFERENCES user_types(id);


--
-- TOC entry 2120 (class 2606 OID 83830)
-- Name: products fk_rails_ce4a327ast; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY products
    ADD CONSTRAINT fk_rails_ce4a327ast FOREIGN KEY (status_id) REFERENCES statuses(id);


-- Completed on 2018-09-12 20:15:03 CDT

--
-- PostgreSQL database dump complete
--

