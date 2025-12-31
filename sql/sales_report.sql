SELECT
  id,
  order_date,
  customer_name,
  amount,
  status
FROM orders
WHERE order_date BETWEEN '2025-12-10' AND '2025-12-20'
  AND status = 'PAID'
ORDER BY order_date;