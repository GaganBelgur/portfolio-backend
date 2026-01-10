CREATE TABLE connect_with_me (
                                 id BIGSERIAL PRIMARY KEY,
                                 summary TEXT,
                                 linkedin_url TEXT,
                                 github_url TEXT,
                                 email VARCHAR(255),
                                 portfolio_url TEXT,
                                 updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
