CREATE TABLE experience (
                            id BIGSERIAL PRIMARY KEY,
                            name VARCHAR(255) NOT NULL,
                            role VARCHAR(255) NOT NULL,
                            duration VARCHAR(255) NOT NULL,
                            summary TEXT
);

CREATE TABLE project (
                         id BIGSERIAL PRIMARY KEY,
                         title VARCHAR(255) NOT NULL,
                         description TEXT,
                         tech_stack VARCHAR(255),
                         github_url VARCHAR(255),
                         live_url VARCHAR(255)
);

CREATE TABLE project_tech_tags (
                                   project_id BIGINT NOT NULL,
                                   tech_tag VARCHAR(50) NOT NULL,
                                   CONSTRAINT fk_project
                                       FOREIGN KEY (project_id)
                                           REFERENCES project(id)
                                           ON DELETE CASCADE
);
