Select p.product_name, s.year, s.price
From Sales as s
Left JOIN Product as p
ON s.product_id=p.product_id