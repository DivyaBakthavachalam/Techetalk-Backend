CREATE TABLE USER(id BIGINT PRIMARY KEY AUTO_INCREMENT, 
                  name VARCHAR(100),email_id VARCHAR(100),creation_date DATE);
CREATE TABLE QUESTIONS(id BIGINT PRIMARY KEY AUTO_INCREMENT, 
                  question TEXT,user_name VARCHAR(100),user_fk BIGINT, creation_date DATE);