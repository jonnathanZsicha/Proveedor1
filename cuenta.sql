-- Table: public.cuenta

-- DROP TABLE public.cuenta;

CREATE TABLE public.cuenta
(
    id integer NOT NULL,
    codigo integer NOT NULL,
    saldo double precision,
    tipo_cuenta character varying(255) COLLATE pg_catalog."default",
    per_id integer NOT NULL,
    CONSTRAINT cuenta_pkey PRIMARY KEY (id),
    CONSTRAINT fkktg3tkcpvq7ru75pr8unslgee FOREIGN KEY (per_id)
        REFERENCES public.persona (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public.cuenta
    OWNER to postgres;