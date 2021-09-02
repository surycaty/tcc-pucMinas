-- tcc."user" definition

-- Drop table

-- DROP TABLE tcc."user";

CREATE TABLE tcc."user" (
	id int8 NOT NULL,
	"document" text NOT NULL,
	email text NOT NULL,
	"name" text NOT NULL,
	username text NOT NULL,
	"password" text NOT NULL,
	create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT user_pkey PRIMARY KEY (id),
	CONSTRAINT email_un UNIQUE (email),
	CONSTRAINT username_un UNIQUE (username)
);

-- tcc.address definition

-- Drop table

-- DROP TABLE tcc.address;

CREATE TABLE tcc.address (
	id int8 NOT NULL,
	"name" text NOT NULL,
	street text NOT NULL,
	"number" text NULL,
	zip_code text NULL,
	complement text NULL,
	coordenate text NULL,
	create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	id_user int8 NOT NULL,
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
