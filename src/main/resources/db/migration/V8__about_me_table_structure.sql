CREATE TABLE about_me (
                          id BIGSERIAL PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          title VARCHAR(255),
                          summary TEXT,
                          profile_image_url TEXT,
                          updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
