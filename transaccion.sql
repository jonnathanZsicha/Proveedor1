-- Table: public.transaccion

-- DROP TABLE public.transaccion;

CREATE TABLE public.transaccion
(
    id integer NOT NULL,
    monto double precision,
    numero_cuenta character varying(255) COLLATE pg_catalog."default",
    tipo_cuenta character varying(255) COLLATE pg_catalog."default",
    cuenta_id integer NOT NULL,
    CONSTRAINT transaccion_pkey PRIMARY KEY (id),
    CONSTRAINT fkkkale73n3p5vwbgxa49yiyqgx FOREIGN KEY (cuenta_id)
        REFERENCES public.cuenta (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public.transaccion
    OWNER to postgres;