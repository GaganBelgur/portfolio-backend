CREATE TABLE responsibility (
                       id BIGSERIAL PRIMARY KEY,
                       image_url TEXT,
                       title VARCHAR(255),
                       description TEXT,
                       updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
