INSERT INTO tb_category (name) VALUES ('informatica');
INSERT INTO tb_category (name) VALUES ('escritorio');

INSERT INTO tb_product (name, description, price, img_url) VALUES ('macbook air', 'Apple Macbook Air 13 Chip M1 256gb De Ssd 8gb Cinza-espacial', 7999.99, 'https://user-images.githubusercontent.com/91570669/185133025-2e822fd9-3c5e-4a55-921b-cc596b904a4a.jpg');

INSERT INTO tb_product_category (product_id, category_id) VALUES (1,1);


INSERT INTO tb_county (name) VALUES ('AM');
INSERT INTO tb_county (name) VALUES ('MG');
INSERT INTO tb_county (name) VALUES ('SP');
INSERT INTO tb_county (name) VALUES ('RJ');
INSERT INTO tb_county (name) VALUES ('BA');
INSERT INTO tb_county (name) VALUES ('PR');


INSERT INTO tb_city (name, county_id) VALUES ('Manaus', 1);
INSERT INTO tb_city (name, county_id) VALUES ('Uberlandia', 2);
INSERT INTO tb_city (name, county_id) VALUES ('Sao Paulo', 3);
INSERT INTO tb_city (name, county_id) VALUES ('Rio de Janeiro', 4);
INSERT INTO tb_city (name, county_id) VALUES ('Salvador', 5);
INSERT INTO tb_city (name, county_id) VALUES ('Cascavel', 6);

INSERT INTO tb_client(name, email, ident_number, type) VALUES ('Maria Silva', 'mariasilva@gmail.com', '36378912377', 1);

INSERT INTO tb_phones(client_id, phones ) VALUES (1, '3498765-4321');
INSERT INTO tb_phones(client_id, phones ) VALUES (1, '3498765-4322');

INSERT INTO tb_address(street, number, district, zip_code, client_id, city_id) VALUES ('Rua Flores', '300', 'Jardim', '38407263', 1, 2);

