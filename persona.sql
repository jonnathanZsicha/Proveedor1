-- Table: public.persona

-- DROP TABLE public.persona;

CREATE TABLE public.persona
(
    id integer NOT NULL,
    apellido character varying(255) COLLATE pg_catalog."default",
    cedula character varying(255) COLLATE pg_catalog."default",
    nombre character varying(255) COLLATE pg_catalog."default",
    password character varying(255) COLLATE pg_catalog."default",
    usuario character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT persona_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.persona
    OWNER to postgres;