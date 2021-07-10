/*
Напишіть запит, де буде account id, customer id і доступний залишок всіх рахунків, маючий статус 'ACTIVE' (активний) і доступний залишок понад 1000.
Напишіть запит, за яким для кожного клієнта фізичної особи (customer.cust_type_cd = 'I') повертаються ID рахунку, федеральний ID (Customer.fed_id) і тип створеного рахунку (product.name).
*/

select A.account_id,A.cust_id, A.avail_balance from account A where A.status=`ACTIVE` and A.avail_balance>1000;

select
    a.account_id,c.fed_id,p.name
from customer c
left join account a on a.cust_id=c.cust_id
left join product p on p.product_cd=a.product_cd
where c.cust_type_cd='I';