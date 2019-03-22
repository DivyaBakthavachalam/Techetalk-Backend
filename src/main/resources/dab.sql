CREATE TABLE USER(id BIGINT PRIMARY KEY AUTO_INCREMENT, 
                  name VARCHAR(100),email_id VARCHAR(100),creation_date DATE);
CREATE TABLE QUESTION(id BIGINT PRIMARY KEY AUTO_INCREMENT, 
                  question TEXT,user_name VARCHAR(100),user_fk BIGINT, creation_date DATE);
CREATE TABLE ANSWER(id BIGINT PRIMARY KEY AUTO_INCREMENT, 
                  answer TEXT,question_fk BIGINT,user_name VARCHAR(100),user_fk BIGINT, creation_date DATE);                  