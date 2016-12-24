--5
SELECT * FROM user;
SELECT * FROM "ORDER";
SELECT * FROM book;

SELECT first_name, last_name, phone_number FROM user;
SELECT book_name, book_description, year_of_issue, book_in_warehouse FROM book;
SELECT series, number, issued_by, date_of_issue FROM document;
SELECT DISTINCT issued_by FROM document;
--6
SELECT * FROM user WHERE role_id > 2;
SELECT * FROM book WHERE book_in_warehouse < 5;
SELECT * FROM "ORDER" WHERE order_id = 2;
SELECT * FROM author WHERE patronymic IS NOT NULL;
SELECT * FROM "ORDER" WHERE actual_return_date IS NULL AND order_type_id = 3;
SELECT * FROM "ORDER" WHERE expected_return_date BETWEEN '2016-12-01' AND '2017-01-31';
SELECT * FROM user WHERE email LIKE '%gmail.com';
SELECT * FROM user WHERE phone_number LIKE '+38050%';
SELECT * FROM book WHERE book_quantity IN(4,25);
--7
SELECT * FROM user WHERE role_id = (SELECT role_id FROM role WHERE user_role = 'Librarian'); 
SELECT * FROM "ORDER" WHERE order_type_id = (SELECT order_type_id FROM order_type WHERE order_type = 'Send by post');
SELECT * FROM book WHERE genre_id = (SELECT genre_id FROM genre WHERE genre = 'Educational literature');
--8
SELECT * FROM user ORDER BY karma DESC;
--9
SELECT first_name, last_name, karma, phone_number FROM user WHERE karma > 15
UNION
SELECT first_name, last_name, karma, phone_number FROM user WHERE phone_number LIKE '+38050%';
--10
SELECT u.first_name, u.last_name, u.email, u.phone_number, u.karma, r.user_role FROM user u 
	INNER JOIN role r ON r.role_id = u.role_id AND r.user_role = 'Librarian';
 --  Displays all user name and book names that the order by post
SELECT u.first_name, u.last_name, u.phone_number, o.order_date, b.book_name  FROM user u 
   INNER JOIN "ORDER" o ON o.user_id = u.user_id
   INNER JOIN book b ON o.book_id = b.book_id WHERE u.user_id = 
   (SELECT user_id FROM "ORDER" WHERE order_type_id = (SELECT order_type_id FROM order_type WHERE order_type = 'Send by post'));
  
--11 
--Full information about user include full address
SELECT u.first_name, u.last_name, u.phone_number, c.city_name, s.street_name, a.house_number, a.flat_number FROM user u 
	LEFT OUTER JOIN address a ON u.address_id = a.address_id
    LEFT OUTER JOIN street s ON a.street_id = s.street_id
    LEFT OUTER JOIN city c ON s.city_id = c.city_id;
-- Full information about book	
SELECT b.book_name, a.first_name, a.last_name, a.patronymic, ph.publishing_house_name, g.genre, b.year_of_issue, l.language, b.book_description FROM book b 
	LEFT OUTER JOIN author a ON b.author_id = a.author_id 
	LEFT OUTER JOIN publishing_house ph ON b.publishing_house_id = ph.publishing_house_id
	LEFT OUTER JOIN genre g ON b.genre_id = g.genre_id
	LEFT OUTER JOIN language l ON b.language_id = l.language_id;
--12	
SELECT first_name, last_name, phone_number, SQRT(karma) FROM user; -- I haven't any other ideas	
--13	
UPDATE book SET book_description = REPLACE(book_description, 'Some desrpt', 'Описание ожидается');
SELECT *, LENGTH(first_name) len_name,LENGTH(last_name)  len_surname FROM user; 
--14
SELECT * FROM "ORDER" WHERE MONTH(expected_return_date) = 1;
SELECT * FROM "ORDER" WHERE YEAR(expected_return_date)  IN(2016,2017);
--15
SELECT first_name, MAX(karma) max_karma  FROM user GROUP BY first_name HAVING karma > 15;
SELECT COUNT(user_id) FROM user;
SELECT COUNT(book_id) FROM book WHERE language_id = (SELECT language_id FROM language WHERE language = 'English');

	
	
	