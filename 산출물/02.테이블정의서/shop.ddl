DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE userInfo CASCADE CONSTRAINTS;

CREATE TABLE userInfo(
		userId                        		VARCHAR2(100)		 NULL ,
		password                      		VARCHAR2(100)		 NULL ,
		name                          		VARCHAR2(100)		 NULL ,
		email                         		VARCHAR2(100)		 NULL 
);


CREATE TABLE product(
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(100)		 NULL ,
		p_price                       		INTEGER(10)		 NULL ,
		P_image                       		VARCHAR2(100)		 NULL ,
		p_desc                        		VARCHAR2(200)		 DEFAULT 0		 NULL ,
		p_click_count                 		NUMBER(10)		 DEFAULT 0		 NULL 
);



ALTER TABLE userInfo ADD CONSTRAINT IDX_userInfo_PK PRIMARY KEY (userId);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);

