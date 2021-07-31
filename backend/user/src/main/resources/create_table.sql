-- tcc."user" definition

-- Drop table

-- DROP TABLE tcc."user";

CREATE TABLE tcc."user" (
	id int8 NOT NULL,
	"document" text NOT NULL,
	email text NOT NULL,
	"name" text NOT NULL,
	CONSTRAINT user_pkey PRIMARY KEY (id)
);

-- tcc.address definition

-- Drop table

-- DROP TABLE tcc.address;

CREATE TABLE tcc.address (
	id int8 NOT NULL,
	complemento text NULL,
	coordenate text NULL,
	"name" text NOT NULL,
	"number" text NULL,
	street text NOT NULL,
	id_user int8 NOT NULL,
	zip_code text NULL,
	CONSTRAINT address_pkey PRIMARY KEY (id)
);


-- tcc.address foreign keys

ALTER TABLE tcc.address ADD CONSTRAINT address_fk FOREIGN KEY (id_user) REFERENCES tcc."user"(id) ON DELETE CASCADE;

-- tcc."order" definition

-- Drop table

-- DROP TABLE tcc."order";

CREATE TABLE tcc."order" (
	id int8 NOT NULL,
	coordenate text NULL,
	description text NULL,
	"name" text NOT NULL,
	id_user int8 NOT NULL,
	CONSTRAINT order_pkey PRIMARY KEY (id)
);


-- tcc."order" foreign keys

ALTER TABLE tcc."order" ADD CONSTRAINT order_fk FOREIGN KEY (id_user) REFERENCES tcc."user"(id) ON DELETE CASCADE;
