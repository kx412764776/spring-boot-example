-- 将customer table中的id类型改为integer
ALTER TABLE customer
ALTER COLUMN id TYPE integer USING id::integer;
