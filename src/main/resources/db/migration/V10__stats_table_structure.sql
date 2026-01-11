CREATE TABLE stats (
                       id BIGSERIAL PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       title VARCHAR(255),
                       count INTEGER NOT NULL,
                       updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
