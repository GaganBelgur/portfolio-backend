ALTER TABLE project
RENAME COLUMN title TO name;

ALTER TABLE project
DROP COLUMN github_url,
DROP COLUMN live_url;

ALTER TABLE project
DROP COLUMN tech_stack;

ALTER TABLE project
ADD COLUMN tech_tags TEXT[];

ALTER TABLE project
ADD COLUMN company_tags VARCHAR(255);
