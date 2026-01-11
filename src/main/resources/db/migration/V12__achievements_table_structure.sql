CREATE TABLE achievements (
    id BIGSERIAL PRIMARY KEY,
    image_url TEXT,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    year VARCHAR(10),
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
