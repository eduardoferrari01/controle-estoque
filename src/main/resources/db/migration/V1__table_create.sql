CREATE TABLE categoria (
    id bigint NOT NULL,
    descricao character varying(255)
);

CREATE SEQUENCE categoria_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE estoque (
    quantidade integer,
    valor_total double precision,
    id bigint NOT NULL,
    id_produto bigint,
    localizacao character varying(255)
);

CREATE SEQUENCE estoque_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE produto (
    preco double precision,
    id bigint NOT NULL,
    id_categoria bigint,
    descricao character varying(255)
);

CREATE SEQUENCE produto_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE usuario (
    id bigint NOT NULL,
    email character varying(255),
    login character varying(255),
    nome character varying(255),
    senha character varying(255)
);

CREATE SEQUENCE public.usuario_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

SELECT pg_catalog.setval('public.categoria_id_seq', 1, false);

SELECT pg_catalog.setval('public.estoque_id_seq', 1, false);

SELECT pg_catalog.setval('public.produto_id_seq', 1, false);

SELECT pg_catalog.setval('public.usuario_id_seq', 1, false);

ALTER TABLE ONLY categoria
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.estoque
    ADD CONSTRAINT estoque_id_produto_key UNIQUE (id_produto);

ALTER TABLE ONLY public.estoque
    ADD CONSTRAINT estoque_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.produto
    ADD CONSTRAINT fkbb0k43mtsufg8bfhq0gyaxhhm FOREIGN KEY (id_categoria) REFERENCES public.categoria(id);

ALTER TABLE ONLY public.estoque
    ADD CONSTRAINT fkbx8yr35bvoe5dqdd2sxjjjktj FOREIGN KEY (id_produto) REFERENCES public.produto(id);
    