INSERT INTO tb_category (name) VALUES ('informatica');
INSERT INTO tb_category (name) VALUES ('escritorio');

INSERT INTO tb_product (name, description, price, img_url) VALUES ('macbook air', 'Apple Macbook Air 13 Chip M1 256gb De Ssd 8gb Cinza-espacial', 7999.99, 'https://user-images.githubusercontent.com/91570669/185133025-2e822fd9-3c5e-4a55-921b-cc596b904a4a.jpg');

INSERT INTO tb_product_category (product_id, category_id) VALUES (1,1);

INSERT INTO tb_client(name, email, ident_number, phone) VALUES ('Maria Silva', 'mariasilva@gmail.com', '36378912377', '349876-5432');
